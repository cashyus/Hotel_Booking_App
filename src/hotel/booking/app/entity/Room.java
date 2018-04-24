/**
 * 
 */
package hotel.booking.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Dolic
 * room = category
 */
@Entity
@Table(name="room")
public class Room {
	
	@Id
	@Column(name="roomId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer roomId;

	@Column(name="room_type")
	private String room_type;
	
	@Column(name="room_service")
	private String room_service;

	/**
	 * @return the roomId
	 */
	public Integer getRoomId() {
		return roomId;
	}

	/**
	 * @param roomId the roomId to set
	 */
	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	/**
	 * @return the room_type
	 */
	public String getRoom_type() {
		return room_type;
	}

	/**
	 * @param room_type the room_type to set
	 */
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}

	/**
	 * @return the room_service
	 */
	public String getRoom_service() {
		return room_service;
	}

	/**
	 * @param room_service the room_service to set
	 */
	public void setRoom_service(String room_service) {
		this.room_service = room_service;
	}
	
	
}
