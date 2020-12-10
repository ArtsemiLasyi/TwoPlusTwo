package by.aaproduction.tpt.dao.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import by.aaproduction.tpt.dao.bean.Room;
import by.aaproduction.tpt.dao.bean.RoomList;
import by.aaproduction.tpt.dao.exception.DAOException;
import by.aaproduction.tpt.dao.implementation.connection.ConnectionPool;
import by.aaproduction.tpt.dao.implementation.connection.exception.ConnectionPoolException;
import by.aaproduction.tpt.dao.interfaces.RoomDAO;

public class SQLRoomDAO implements RoomDAO {

	private static final String sqlRoomsTableName = "rooms";
	private static final String sqlRoomsColumnId = "id";
	private static final String sqlRoomsColumnRoomNumber = "number";
	private static final String sqlRoomsColumnPrice = "price";
	private static final String sqlRoomsColumnMealsIncluded = "mealsincluded";
	private static final String sqlRoomsColumnHasAddedPlace = "hasaddedplace";
	private static final String sqlRoomsColumnNumberOfPeople = "numberofpeople";
	private static final String sqlRoomsColumnIsBusy = "isbusy";
	private static final String sqlRoomsColumnAbout = "about";
	
	
    private static final ConnectionPool connectionPool = ConnectionPool.getInstance();

    private static final String sqlInsertIntoRooms = "INSERT rooms(`number`, `price`, `mealsincluded`, `hasaddedplace`, `numberofpeople`, `about`) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String sqlDeleteFromRooms = "DELETE FROM rooms id = ? AND number = ?";
    private static final String sqlUpdateRooms = "UPDATE rooms SET number = ?, price = ?, mealsincluded = ?, hasaddedprice = ?, numberofpeople = ?, about = ? WHERE id = ?";
    private static final String sqlSelectFromRooms = "SELECT * FROM rooms";

    @Override
    public RoomList getAllRooms() throws DAOException {
        Connection connection = null;

        try {
            connection = connectionPool.takeConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sqlSelectFromRooms);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet == null)
                return null;
            RoomList rooms = new RoomList();
            while(resultSet.next()) {
            	Room room = new Room();
            	room.setNumberOfRoom(Integer.parseInt(resultSet.getString(sqlRoomsColumnRoomNumber)));
            	room.setId(Integer.parseInt(resultSet.getString(sqlRoomsColumnId)));
            	room.setIsBusy(Boolean.parseBoolean(resultSet.getString(sqlRoomsColumnIsBusy)));
            	room.setAbout(resultSet.getString(sqlRoomsColumnAbout));
            	room.setMealsIncluded(Boolean.getBoolean(resultSet.getString(sqlRoomsColumnMealsIncluded)));
            	room.setHasAddedPlace(Boolean.parseBoolean(resultSet.getString(sqlRoomsColumnHasAddedPlace)));
            	room.setPrice(resultSet.getDouble(sqlRoomsColumnPrice));
            	room.setNumberOfPeople(resultSet.getInt(sqlRoomsColumnNumberOfPeople));
                rooms.instance.add(room);
            }
            connectionPool.returnConnection(connection);
            return rooms;
        }
        catch (ConnectionPoolException e) {
            throw new DAOException("Error in connection pool while getting room", e);
        }
        catch (SQLException e) {
            throw new DAOException("Error while getting room", e);
        }
        finally {
        }
    }

    @Override
    public void addRoom(Room room) throws DAOException {
        Connection connection = null;
        try {
            connection = connectionPool.takeConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsertIntoRooms);
            preparedStatement.setInt(1, room.getNumberOfRoom());
            preparedStatement.setDouble(2, room.getPrice());
            preparedStatement.setBoolean(3, room.getMealsIncluded());
            preparedStatement.setBoolean(4, room.getHasAddedPlace());
            preparedStatement.setInt(5, room.getNumberOfPeople());
            preparedStatement.setString(6, room.getAbout());
            preparedStatement.executeUpdate();
        }
        catch (ConnectionPoolException e) {
            throw new DAOException("Error in connection pool while inserting room", e);
        }
        catch (SQLException e) {
            throw new DAOException("Error while inserting room", e);
        }
        finally {
            connectionPool.returnConnection(connection);
        }
    }

    @Override
    public void editRoom(Room room) throws DAOException {
        Connection connection = null;
        try {
            connection = connectionPool.takeConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sqlUpdateRooms);
            preparedStatement.setInt(1, room.getNumberOfRoom());
            preparedStatement.setDouble(2, room.getPrice());
            preparedStatement.setBoolean(3, room.getMealsIncluded());
            preparedStatement.setBoolean(4, room.getHasAddedPlace());
            preparedStatement.setInt(5, room.getNumberOfPeople());
            preparedStatement.setString(6, room.getAbout());
            preparedStatement.setInt(7, room.getId());
            preparedStatement.executeUpdate();
        }
        catch (ConnectionPoolException e) {
            throw new DAOException("Error in connection pool while updating room", e);
        }
        catch (SQLException e) {
            throw new DAOException("Error while updating room", e);
        }
        finally {
            connectionPool.returnConnection(connection);
        }
    }

    @Override
    public void deleteRoom(Room room) throws DAOException {
        Connection connection = null;
        try {
            connection = connectionPool.takeConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sqlDeleteFromRooms);
            preparedStatement.setInt(1, room.getId());
            preparedStatement.setInt(2, room.getNumberOfRoom());
            preparedStatement.executeUpdate();
        }
        catch (ConnectionPoolException e) {
            throw new DAOException("Error in connection pool while deleting room", e);
        }
        catch (SQLException e) {
            throw new DAOException("Error while deleting room", e);
        }
        finally {
            connectionPool.returnConnection(connection);
        }
    }
}
