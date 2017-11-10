package hotel.booking.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idcustomers")
	private int id;
	
	
	@Column(name="firstname")
	private String firstname;
	
	

	@Column(name="lastname")
	private String lastname;
	

	@Column(name="Street")
	private int Street;
	

	@Column(name="City")
	private String City;
	

	@Column(name="State")
	private String State;
	

	@Column(name="email")
	private String email;
	
	

	@Column(name="phonenumber")
	private long phonenumber;
	
	

	@Column(name="paymentmethod")
	private String paymentmethod;
	
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

	public int getStreet() {
		return Street;
	}

	public void setStreet(int Street) {
		this.Street = Street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String City) {
		this.City = City;
	}

	public String getState() {
		return State;
	}

	public void setState(String State) {
		this.State = State;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String Email) {
		this.email = Email;
	}

	public long getPhoneNumber() {
		return phonenumber;
	}

	public void setphonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getPaymentMethod() {
		return paymentmethod;
	}

	public void setpaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstname + ", lastName=" + lastname + ", street=" + Street
				+ ", city=" + City + ", state=" + State + ", email=" + email + ", phoneNumber=" + phonenumber
				+ ", paymentMethod=" + paymentmethod + "]";
	}

	
}
