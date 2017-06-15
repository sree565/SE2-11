package courierPD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.sql.DriverManager;

import java.sql.*;


public class ACMECourierCompany {

	private static ArrayList<Customer> customers;
	private ArrayList<DeliveryTicket> DeliveryTicket;
	private static ArrayList<Driver> drivers=new ArrayList<Driver>();
	private Collection<Map> Map;
	private static ArrayList<User> users;


	/**
	 * it is defines the name of the company
	 */
	private String name;
	/**
	 * it defines street of the company
	 */
	private String street;
	/**
	 * it is defines the minimum price of the package or order.
	 */
	private int minPrice;
	/**
	 * it is defines avenue of the company
	 */
	private String avenue;
	/**
	 * it is defines the amount or bill of the package
	 */
	private int fixedBillAmount;
	/**
	 * it is defines the price per each block.
	 */
	private int pricePerBlock;
	/**
	 * it is defines  the bill per mileage.
	 */
	private int mileageBillAmount;
	/**
	 * it is defines the bonus amount for driver
	 */
	private int bonusAmount;
	private int bonusMinTol;
	
	

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}
	
	/**
	 * Aadd Customer to Company
	 * @param customer
	 */
	
	public void addCustomer(Customer customer) {
		if (customer != null) {
			//System.out.println(""+getNumber());
			getCustomers().add(customer);
		}
	}

	/**
	 * remove customer from the company
	 * 
	 * @param cashier
	 */
	public void removeCustomer(Customer customer) {
		if (customer != null) {
			getCustomers().remove(customer);
		}
	}
	
	/**
	 * Add User to the Company
	 */
		
	public void addUser(User user) throws SQLException {
		if (user != null) {
			getUsers().add(user);
		}
	}
	

	/**
	 * remove user from the company
	 * 
	 * @param cashier
	 */
	public void removeUser(User user) throws SQLException {
		
		Connection con;
		Statement stem;
		users.clear();

		try{
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project_se1","root","241656");
		
		PreparedStatement ps = con.prepareStatement("delete  from user where u_id=?");
		ps.setInt(1, user.getUserid());
		ResultSet rs = ps.executeQuery();
		ps.executeUpdate();

		}catch(Exception e){

		}
	}
	
	public ArrayList<User> getUsers() throws SQLException{
		Connection con;
		Statement stem;
		users.clear();

		try{
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project_se1","root","241656");
		String query ="select u_id,u_fname,u_pwd,u_role,u_email, u_phoneno from user";
		stem=con.createStatement();
		ResultSet rs=stem.executeQuery(query);
		while(rs.next()){
			User user = new User();
			user.setUserid(rs.getInt("u_id"));
			user.setName(rs.getString("u_fname"));
			user.setPassword(rs.getString("u_pwd"));
			user.setEmail(rs.getString("u_email"));
			user.setUserphone(rs.getString("u_phoneno"));
			users.add(user);
		}
		}catch(Exception e){

		}
		return users;
	}
	 
	

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	
	
	/**
	 * Add Driver to Company
	 * @param customer
	 */
	
	public void addDriver(Driver driver) throws SQLException {
		if (driver != null) {
			getDrivers().add(driver);
		}
	}
	
	

	/**
	 * remove driver from the company
	 * 
	 * @param cashier
	 */
	public void removeDriver(Driver driver) throws SQLException {
		
		Connection con;
		Statement stem;
		drivers.clear();

		try{
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project_se1","root","241656");
		//int RemID=driver.getNumber();
		//String query =;
		PreparedStatement ps = con.prepareStatement("delete  from driver where driver_no=?");
		ps.setInt(1, driver.getNumber());
		ResultSet rs = ps.executeQuery();
		ps.executeUpdate();

		}catch(Exception e){

		}
	}

	public ArrayList<Driver> getDrivers() throws SQLException{
		Connection con;
		Statement stem;
		drivers.clear();

		try{
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project_se1","root","241656");
		String query ="select driver_no,d_name,d_email,d_phone from driver";
		stem=con.createStatement();
		ResultSet rs=stem.executeQuery(query);
		while(rs.next()){
			Driver d=new Driver();
			d.setNumber(rs.getInt("driver_no"));
			d.setName(rs.getString("d_name"));
			d.setEmail(rs.getString("d_email"));
			d.setPhone(rs.getString("d_phone"));
			drivers.add(d);
			}
		}catch(Exception e){

		}
		return drivers;
	}
	 
	

	public void setDrivers(ArrayList<Driver> drivers) {
		this.drivers = drivers;
	}

     
	/**
	 * it is defined as the calculate total bill of the package.
	 */
	public void calTotalBill() {
		// TODO - implement ACMECourierCompany.calTotalBill
		throw new UnsupportedOperationException();
	}

	/**
	 * it is defined as the calculate quoted price.
	 */
	public void calcQuotedPrice() {
		// TODO - implement ACMECourierCompany.calcQuotedPrice
		throw new UnsupportedOperationException();
	}

	/**
	 * it defines the calculate the blocks.
	 */
	public void calcBlocks() {
		// TODO - implement ACMECourierCompany.calcBlocks
		throw new UnsupportedOperationException();
	}
	public ACMECourierCompany()
	{
//		drivers = new ArrayList<Driver>();
//		customers = new ArrayList<Customer>();
	}

}