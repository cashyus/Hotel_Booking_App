package hotel.booking.app.controller;

import java.security.Principal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import hotel.booking.app.dao.CustomerDao;
import hotel.booking.app.entity.Customer;
import hotel.booking.app.service.HotelService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private HotelService hotelservice;
	
	@GetMapping("/WelcomeHome")
	public String welcomeHomeLanding(Model theModel){
		return "WelcomeHome";
	}


	@GetMapping("/CurrentCustomers")
	public String listCustomers(Model theModel) {

		// gets customers from the service layer
		List<Customer> theCustomers = hotelservice.getCustomers();
		theModel.addAttribute("customers", theCustomers);

		return "CurrentCustomers";
	}

	// add customers button stuff

	@GetMapping("/AddCustomerForm")
	public String showFormForAdd(Model theModel) {

		Customer theCustomer = new Customer();

		theModel.addAttribute("customer", theCustomer);


		return "addingCustomer-form";
	}

	@PostMapping("/addCustomer")
	public String addCustomer(@ModelAttribute("customer") Customer theCustomer) {

		// save functionality when adding a customer to the hotel app

		hotelservice.addCustomer(theCustomer);
		return "redirect:/customer/CurrentCustomers";
	}
	@GetMapping ("/ManageCustomers")
	public String manageCustomersList(Model theModel){
		List<Customer> theCustomers = hotelservice.getCustomers();
		theModel.addAttribute("customers", theCustomers);

	return "ManageCustomers";
	}
	
	
	@GetMapping("/UpdateManageCustomers")
	public String ManageCustomerForm(@RequestParam("customerId") int theId, Model theModel){
		
		//get the customer from the service and service will delgate it somewhere else
		Customer theCustomer = hotelservice.getCustomer(theId);
		
		//set customer as a model attribute to prepopulate the form
		
		theModel.addAttribute("customer", theCustomer);
		
		
		//send over to our form
		
		return "addingCustomer-form";
	}
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int theId){
		
		//delete the cust
		hotelservice.deleteCustomer(theId);
		
		return "redirect:/customer/ManageCustomers";
	}
	@PostMapping("/search")
	public String searchCustomer(@RequestParam("theSearchName") String theSearchName, Model theModel){
		List<Customer> theCustomers = hotelservice.searchCustomer(theSearchName);
		theModel.addAttribute("customers", theCustomers);
		
		return "CurrentCustomers";
}
}
