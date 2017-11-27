package hotel.booking.app.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import hotel.booking.app.service.HotelService;

@Controller
public class LoginController {
	
	@RequestMapping(value="/")
	public String welcome(Model theModel){
		theModel.addAttribute("name","Home Page");
		theModel.addAttribute("description", "pizza face unsecured page!");
		
		return "index";
	}
	@RequestMapping("/admin")
	public String admin(Model theModel, Principal principal){
		
		String loggedInUserName = principal.getName();
		theModel.addAttribute("user", loggedInUserName);
		theModel.addAttribute("name","Spring Security Is LIVE");
		theModel.addAttribute("description", "Protected Page -- Mirzet");
		
		return "redirect:/customer/Home";
	}

	@RequestMapping(value="/login", method=RequestMethod.GET)
	
	public String login(ModelMap theModel){
		return "Login";
	}
	
	@RequestMapping(value = "/loginError", method = RequestMethod.GET)
	public String loginError(ModelMap theModel){
		theModel.addAttribute("error", "true");
		return "Login";
	}
	
	
	}
	
	
	

