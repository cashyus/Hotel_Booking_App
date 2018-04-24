/**
 * 
 */
package hotel.booking.app.service;

import java.util.List;

import hotel.booking.app.entity.*;

/**
 * @author Dolic
 *
 */
public interface RoomService {
	public void addRoom(Room room);
	public List<Room> getRooms();
	public Room getRoom(int roomId);
	public void deleteRoom(int roomId);
}
