package Courier;
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
	
	public Customer(){
		
	}
	
	public Customer(String name,String address, String number,String email){
		this.setName(name);
		this.setAddress(address);
		this.setEmail(email);
		this.setNumber(number);
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
	

}