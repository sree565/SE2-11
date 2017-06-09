package Courier;
import java.util.*;

public class ACMECourierCompany {

	private TreeMap<String,Customer> customers;
	private Collection<DeliveryTicket> DeliveryTicket;
	private TreeMap<String,Driver> drivers;
	private Collection<Map> Map;
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
	
	

	public TreeMap<String, Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(TreeMap<String, Customer> customers) {
		this.customers = customers;
	}
	
	/**
	 * Aadd Customer to Company
	 * @param customer
	 */
	
	public void addCustomer(Customer customer) {
		if (customer != null) {
			//System.out.println(""+getNumber());
			getCustomers().put(customer.getNumber(), customer);
		}
	}

	/**
	 * remove customer from the company
	 * 
	 * @param cashier
	 */
	public void removeCustomer(Customer customer) {
		if (customer != null) {
			getCustomers().remove(customer.getNumber());
		}
	}
	/**
	 * Aadd Driver to Company
	 * @param customer
	 */
	
	public void addDriver(Driver driver) {
		if (driver != null) {
			getDrivers().put(driver.getNumber(), driver);
		}
	}
	

	/**
	 * remove driver from the company
	 * 
	 * @param cashier
	 */
	public void removeDriver(Driver driver) {
		if (driver != null) {
			getCustomers().remove(driver.getNumber());
		}
	}

	public TreeMap<String, Driver> getDrivers() {
		return drivers;
	}

	public void setDrivers(TreeMap<String, Driver> drivers) {
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

}