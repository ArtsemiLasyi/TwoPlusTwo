/**
 * 
 */
package by.aaproduction.tpt.dao.implementation.connection;

import java.sql.*;
import java.util.concurrent.BlockingQueue;

import by.aaproduction.tpt.dao.implementation.connection.exception.ConnectionPoolException;
import by.aaproduction.tpt.service.implementation.Configuration;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Artsemy
 *
 */

public final class ConnectionPool {

    private static final int POOLSIZE = 8;
    private BlockingQueue<Connection> connectionQueue;
    private BlockingQueue<Connection> givenAwayConQueue;

    private String driverName;
    private String url;
    private String user;
    private String password;
    private int poolSize;

    private static final ConnectionPool instance = new ConnectionPool();

    private ConnectionPool() {
    	Configuration conf = new Configuration();
        this.driverName = "com.mysql.cj.jdbc.Driver";
        this.url = conf.getUrl();
        this.user = conf.getUsername();
        this.password = conf.getPassword();

        poolSize = POOLSIZE;
    }

    public static ConnectionPool getInstance() {
        return instance;
    }

    public void InitPoolData() throws ConnectionPoolException {

        try {
            Class.forName(driverName).newInstance();
            givenAwayConQueue = new ArrayBlockingQueue<Connection>(poolSize);
            connectionQueue = new ArrayBlockingQueue<Connection>(poolSize);

            for (int i = 0; i < poolSize; i++) {
                Connection connection = DriverManager.getConnection(url, user, password);
                connection.setAutoCommit(true);
                connectionQueue.add(connection);
            }
        } catch (SQLException e) {
            throw new ConnectionPoolException("SQL Exception in connection pool", e);
        } catch (Exception e) {
            throw new ConnectionPoolException("Can't find database driver class", e);
        }
    }

    public Connection takeConnection() throws ConnectionPoolException {
        Connection connection = null;
        try {
            connection = connectionQueue.take();
            givenAwayConQueue.add(connection);
        }
        catch (InterruptedException e) {
            throw new ConnectionPoolException("Error connecting to datasource", e);
        }
        return connection;
    }

    public void returnConnection(Connection connection) {
        if(givenAwayConQueue.remove(connection))
            connectionQueue.add(connection);
    }

    public void dispose() throws ConnectionPoolException {
        try {
            closeConnectionQueue(givenAwayConQueue);
            closeConnectionQueue(connectionQueue);
        }
        catch (SQLException e) {
            throw new ConnectionPoolException("Error while disposing!");
        }
    }

    private void closeConnectionQueue(Queue<Connection> queue) throws SQLException {
        Connection connection;
        while((connection = connectionQueue.poll()) != null) {
            if(!connection.getAutoCommit())
                connection.commit();
            connection.close();
        }
    }
}

