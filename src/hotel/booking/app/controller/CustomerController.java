package hotel.booking.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hotel.booking.app.dao.CustomerDao;
import hotel.booking.app.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	//daoinjections
	@Autowired
	private CustomerDao customerDao;
	
	
	
	
	@RequestMapping("/ManageCustomers")
	public String listCustomers(Model theModel){
		
		//gets customers from the dao & add model 
		List<Customer> theCustomers = customerDao.getCustomers();
		theModel.addAttribute("customers", theCustomers);
		
		
		return "list-customers";
	}
	
	//add login stuff here 
}
