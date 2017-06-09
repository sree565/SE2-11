package Courier;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;

public class DeliveryTicket {

	private Customer pickupClients;
	private Customer DeliveryClients;
	private Collection<Driver> Driver;
	/**
	 * it is defined as the package number.
	 */
	private int packagenumber;
	/**
	 * it is defined as the date and time of the package.
	 */
	private LocalDate dateTime;
	/**
	 * it is defined as the pickup date and time of the package.
	 */
	private LocalDate pickupDateTime;
	/**
	 * it is defined as the estimated delivery date and time of the package.
	 */
	private LocalDate estDeliveryDateTime;
	/**
	 * it is defines the bill of the package.
	 */
	private int billAmount;
	/**
	 * it is defined as the estimated departure date and time of the package.
	 */
	private LocalDate estDepartureDateTime;
	/**
	 * it is defined as the actual departure date and time of the package.
	 */
	private LocalDate actDepartureDateTime;
	/**
	 * it is defined as the actual pickup date and time of the package.
	 */
	private LocalDate actPickupdateTime;
	/**
	 * it is defined as the actual delivery date and time of the package.
	 */
	private LocalDate actDeliveryDateTime;
	/**
	 * it is defined as the actual return date and time of the driver.
	 */
	private LocalDate actReturnDateTime;

	/**
	 * it is defines the calculate estimated delivery time.
	 */
	public void calcEstDeliveryTime() {
		// TODO - implement DeliveryTicket.calcEstDeliveryTime
		throw new UnsupportedOperationException();
	}

	/**
	 * it is defines the calculate estimated departure time of the package.
	 */
	public void calcEstDepartureTime() {
		// TODO - implement DeliveryTicket.calcEstDepartureTime
		throw new UnsupportedOperationException();
	}

	/**
	 * it is defines the calculate total bill of the package.
	 */
	public void calcBillAmount() {
		// TODO - implement DeliveryTicket.calcBillAmount
		throw new UnsupportedOperationException();
	}

}