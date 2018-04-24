/**
 * 
 */
package hotel.booking.app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import hotel.booking.app.entity.*;
import hotel.booking.app.service.RoomService;

/**
 * @author Dolic
 *
 */

@Controller
@RequestMapping("room")
public class RoomController {

	@Autowired
	private RoomService roomService;

	/**
	 * @param room
	 * @param result
	 * @return
	 * add room method
	 */
	@RequestMapping(value = "/addRoom", method = RequestMethod.GET)
	public ModelAndView addRoom(@ModelAttribute("room") Room room, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("rooms", roomService.getRooms());
		return new ModelAndView("addRoom", model);
	}

	/**
	 * @param room
	 * @param result
	 * @return
	 * save room method
	 */
	@RequestMapping(value = "/saveRoom", method = RequestMethod.POST)
	public ModelAndView saveRoom(@ModelAttribute("room") Room room, BindingResult result) {
		roomService.addRoom(room);
		return new ModelAndView("redirect:/addRoom.jsp");
	}

	/**
	 * @param room
	 * @param result
	 * @return
	 * delete room method
	 */
	@RequestMapping(value = "/deleteRoom", method = RequestMethod.GET)
	public ModelAndView deleteRoom(@ModelAttribute("room") Room room, BindingResult result) {
		roomService.deleteRoom(room.getRoomId());
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("rooms", roomService.getRooms());
		return new ModelAndView("addRoom", model);
	}

	/**
	 * @param room
	 * @param result
	 * @return
	 * edit room method
	 */
	@RequestMapping(value = "/editRoom", method = RequestMethod.GET)
	public ModelAndView editRoom(@ModelAttribute("room") Room room, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("room", roomService.getRoom(room.getRoomId()));
		model.put("rooms", roomService.getRooms());
		return new ModelAndView("addRoom", model);
	}

	/**
	 * @return
	 * gets all the rooms with list data structure
	 */
	@RequestMapping(value = "/rooms", method = RequestMethod.GET)
	public List<Room> getRooms() {
		return roomService.getRooms();
	}
}
