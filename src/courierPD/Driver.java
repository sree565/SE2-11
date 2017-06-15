package courierPD;
import java.util.*;

public class Driver {

	ACMECourierCompany Company;
	
	private Collection<DeliveryTicket> DeliveryTicket;
	/**
	 * it is defined as the name of the driver.
	 */
	private String name;
	/**
	 * it is defines the number of the driver.
	 */
	private int number;
	
	public ACMECourierCompany getCompany() {
		return Company;
	}

	public void setCompany(ACMECourierCompany company) {
		Company = company;
	}

	public Collection<DeliveryTicket> getDeliveryTicket() {
		return DeliveryTicket;
	}

	public void setDeliveryTicket(Collection<DeliveryTicket> deliveryTicket) {
		DeliveryTicket = deliveryTicket;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * it is defines the phone number of the driver.
	 */
	private String phone;
	/**
	 * it is defines the email of the driver.
	 */
	private String email;
	public Driver()
	{

	}
	
	public Driver(String name, String phone, int number, String email){
		
	}

	/**
	 * it is defines the pickup package.
	 */
	public void pickup() {
		// TODO - implement Driver.pickup
		throw new UnsupportedOperationException();
	}

	/**
	 * it is defines the delivery of package.
	 */
	public void deivery() {
		// TODO - implement Driver.deivery
		throw new UnsupportedOperationException();
	}

	/**
	 * it is defines the driver submit reports to the user.
	 */
	public void submit() {
		// TODO - implement Driver.submit
		throw new UnsupportedOperationException();
	}
	public String toString()
	{
		return getNumber()+" 	"+getName();	
	}

}