package hotel.booking.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import hotel.booking.app.entity.Login;



@Controller
public class LoginController {
	
	@RequestMapping (value = "/login", method = RequestMethod.GET)
	public String init (Model theModel){
		theModel.addAttribute("msg", "Please enter your login details");
		
		
		return "login";//view return
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String submit(Model theModel, @ModelAttribute("login") Login login){
		if(login != null && login.getUserName() != null & login.getPassword() !=null){
			if(login.getUserName().equals("mirzet") && login.getPassword().equals("pass")){
				return "redirect:/customer/WelcomeHome"; //view jsp return 
			}else{
				theModel.addAttribute("error", "Invalid details");
				return "login"; //view jsp return 
			}
		}else {
			theModel.addAttribute("error", "Please enter login details");
			return "login";//view return jsp
		}
	}
}