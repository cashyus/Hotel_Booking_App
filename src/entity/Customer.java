package hotel.booking.app.entity;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name="customers")
public class Customer {
	
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	
	
	@Column(name="first_name")
	private String firstname;
	
	

	@Column(name="last_name")
	private String lastname;
	

	@Column(name="street")
	private String Street;



	@Column(name="city")
	private String City;
	
	@Column(name="state")
	private String state;
	

	@Column(name="email")
	private String email;
	
	

	@Column(name="phone")
	private String phone;
	
	

	@Column(name="payment")
	private String payment;
	
	@Column(name="zip")
	private String Zip;
	
	public Customer(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfirstname() {
		return firstname;
	}

	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getlastname() {
		return lastname;
	}

	public void setlastname(String lastname) {
		this.lastname = lastname;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String Street) {
		this.Street = Street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String City) {
		this.City = City;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String Email) {
		this.email = Email;
	}

	public String getPhone() {
		return phone;
	}

	public void setphone(String phone) {
		this.phone = phone;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}


	public String getZip() {
		return Zip;
	}

	public void setZip(String zip) {
		Zip = zip;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", Street=" + Street
				+ ", City=" + City + ", email=" + email + ", phone=" + phone + ", payment=" + payment + ", Zip=" + Zip
				+ "]";
	}




	
}
