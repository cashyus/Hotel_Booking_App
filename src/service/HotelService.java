package hotel.booking.app.service;

import java.util.List;

import hotel.booking.app.entity.Customer;

public interface HotelService {
	
	
	public List<Customer> getCustomers();

	public  void addCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);

	public List<Customer> searchCustomer(String theSearchName);




}
