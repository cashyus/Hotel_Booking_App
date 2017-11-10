package hotel.booking.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hotel.booking.app.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	//factory stuff here
	
	@Autowired
	private SessionFactory sessionfactory;

	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
		Session currentSession = sessionfactory.getCurrentSession();
		
		Query<Customer> theQuery = currentSession.createQuery("from Customer", Customer.class);
		
		List<Customer> customers = theQuery.getResultList();
		
		return customers;
	}

}
