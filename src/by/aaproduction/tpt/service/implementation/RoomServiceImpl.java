/**
 * 
 */
package by.aaproduction.tpt.service.implementation;


import by.aaproduction.tpt.service.interfaces.RoomService;
import by.aaproduction.tpt.utils.DateComparer;
import by.aaproduction.tpt.dao.bean.RequestList;
import by.aaproduction.tpt.dao.bean.Room;
import by.aaproduction.tpt.dao.bean.RoomList;
import by.aaproduction.tpt.dao.exception.DAOException;
import by.aaproduction.tpt.dao.implementation.FactoryDAO;
import by.aaproduction.tpt.dao.interfaces.AdminDAO;
import by.aaproduction.tpt.dao.interfaces.RequestDAO;
import by.aaproduction.tpt.dao.interfaces.RoomDAO;
import by.aaproduction.tpt.service.exception.ServiceException;

/**
 * @author Artsemy
 *
 */
public class RoomServiceImpl implements RoomService {

	@Override
	public void addRoom(Room room) throws ServiceException {
		boolean numberOfPeopleNotPositive = room.getNumberOfPeople() <= 0;
		boolean priceNotPositive = room.getPrice() <= 0;
		
		if (numberOfPeopleNotPositive || priceNotPositive) {
			throw new ServiceException("Data is not correct!");
		}
		try {
			FactoryDAO daoObjectFactory= FactoryDAO.getInstance();
			RoomDAO roomDAO = daoObjectFactory.getRoomDAO();
			roomDAO.addRoom(room);
		}
		catch(DAOException ex){
			throw new ServiceException(ex);
		}
	}

	@Override
	public void deleteRoom(Room room) throws ServiceException {
		boolean numberOfPeopleNotPositive = room.getNumberOfPeople() <= 0;
		boolean priceNotPositive = room.getPrice() <= 0;
		boolean idNotValid = room.getId() <= 0;
		
		if (numberOfPeopleNotPositive || priceNotPositive || idNotValid) {
			throw new ServiceException("Data is not correct!");
		}
		try {
			FactoryDAO daoObjectFactory= FactoryDAO.getInstance();
			RoomDAO roomDAO = daoObjectFactory.getRoomDAO();
			roomDAO.deleteRoom(room);
		}
		catch(DAOException ex){
			throw new ServiceException(ex);
		}
	}

	@Override
	public RoomList getAllRooms() throws ServiceException {
		try {
			RoomList roomList = null;
			FactoryDAO daoObjectFactory= FactoryDAO.getInstance();
			RoomDAO RoomDAO = daoObjectFactory.getRoomDAO();
			roomList = RoomDAO.getAllRooms();
			return roomList;
		}
		catch(DAOException ex) {
			throw new ServiceException(ex);
		}
	}

	@Override
	public void editRoom(Room room) throws ServiceException {
		boolean numberOfPeopleNotPositive = room.getNumberOfPeople() <= 0;
		boolean priceNotPositive = room.getPrice() <= 0;
		boolean idNotValid = room.getId() <= 0;
		
		if (numberOfPeopleNotPositive || priceNotPositive || idNotValid) {
			throw new ServiceException("Data is not correct!");
		}
		try {
			FactoryDAO daoObjectFactory= FactoryDAO.getInstance();
			RoomDAO roomDAO = daoObjectFactory.getRoomDAO();
			roomDAO.editRoom(room);
		}
		catch(DAOException ex){
			throw new ServiceException(ex);
		}
	}
	
	
}
