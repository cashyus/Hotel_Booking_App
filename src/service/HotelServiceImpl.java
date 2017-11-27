package hotel.booking.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hotel.booking.app.dao.CustomerDao;
import hotel.booking.app.entity.Customer;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private CustomerDao customerDao;
	
	//injecting the customerDAO and services depend on the DAO (databases) for managing them
	
	@Override
	@Transactional //defines transactions at service layer
	public List<Customer> getCustomers() {
		return customerDao.getCustomers();
	}
	@Override
	@Transactional
	public void addCustomer(Customer theCustomer){
		customerDao.addCustomer(theCustomer);
	}
	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		
		
		return customerDao.getCustomer(theId);
	}
	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		
		customerDao.deleteCustomer(theId);
		
	}
	@Override
	@Transactional
	public List<Customer> searchCustomer(String theSearchName) {
		
		return customerDao.searchCustomer(theSearchName);
	}


	

}
