package courierPD;
public class Customer {
	
	ACMECourierCompany company;
	/**
	 * it is defined as the name of the customer.
	 */
	private String name;
	/**
	 * it is defined as the street and avenue of the customer.
	 */
	private String address;
	/**
	 * it is defined as the number of the customer.
	 */
	private String number;
	/**
	 * it is defined as the email of the customer.
	 */
	private String email;
	private Customer customer;
	
	public Customer(){
		
	}
	
	

	public ACMECourierCompany getCompany() {
		return company;
	}
	public void setCompany(ACMECourierCompany company) {
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Customer getCustomer()
	{
		return customer;
	}
	public String toString()
	{
		return getNumber()+" 	"+getName();
	}
	

}