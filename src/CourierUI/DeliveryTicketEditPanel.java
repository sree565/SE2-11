package CourierUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class DeliveryTicketEditPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;

	/**
	 * Create the panel.
	 */
	public DeliveryTicketEditPanel() {
		setLayout(null);
		
		JLabel lblDelievryTicket = new JLabel("Delievry Ticket");
		lblDelievryTicket.setBounds(165, 43, 92, 16);
		add(lblDelievryTicket);
		
		JLabel lblOrderTakenBy = new JLabel("Order taken by:");
		lblOrderTakenBy.setBounds(30, 81, 102, 16);
		add(lblOrderTakenBy);
		
		textField = new JTextField();
		textField.setBounds(123, 78, 116, 22);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setBounds(287, 81, 56, 16);
		add(lblDate);
		
		textField_1 = new JTextField();
		textField_1.setBounds(322, 78, 116, 22);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setBounds(463, 81, 56, 16);
		add(lblTime);
		
		textField_2 = new JTextField();
		textField_2.setBounds(500, 78, 116, 22);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPickUpInfo = new JLabel("Pick up info:");
		lblPickUpInfo.setBounds(30, 133, 78, 16);
		add(lblPickUpInfo);
		
		JLabel lblDelievryInfo = new JLabel("Delievry Info:");
		lblDelievryInfo.setBounds(406, 133, 78, 16);
		add(lblDelievryInfo);
		
		JLabel lblPickupCustomerNumebr = new JLabel("Pickup Customer Numebr:");
		lblPickupCustomerNumebr.setBounds(12, 176, 161, 16);
		add(lblPickupCustomerNumebr);
		
		textField_5 = new JTextField();
		textField_5.setBounds(167, 173, 116, 22);
		add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblCustomerName = new JLabel("Customer Name:");
		lblCustomerName.setBounds(12, 223, 107, 16);
		add(lblCustomerName);
		
		textField_6 = new JTextField();
		textField_6.setBounds(123, 220, 116, 22);
		add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblPickupTime = new JLabel("Pickup Time:");
		lblPickupTime.setBounds(22, 257, 86, 16);
		add(lblPickupTime);
		
		textField_7 = new JTextField();
		textField_7.setBounds(109, 252, 116, 22);
		add(textField_7);
		textField_7.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Bill To Pickup");
		chckbxNewCheckBox.setBounds(30, 291, 113, 25);
		add(chckbxNewCheckBox);
		
		JLabel lblTicketInfo = new JLabel("Ticket Info:");
		lblTicketInfo.setBounds(12, 325, 78, 16);
		add(lblTicketInfo);
		
		JLabel lblPackageId = new JLabel("Package ID:");
		lblPackageId.setBounds(12, 371, 96, 16);
		add(lblPackageId);
		
		textField_3 = new JTextField();
		textField_3.setBounds(88, 368, 116, 22);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEstimatedDelivery = new JLabel("Estimated Delivery Time:");
		lblEstimatedDelivery.setBounds(12, 412, 150, 16);
		add(lblEstimatedDelivery);
		
		textField_4 = new JTextField();
		textField_4.setBounds(165, 409, 116, 22);
		add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblEstimatedBlocks = new JLabel("Estimated Blocks:");
		lblEstimatedBlocks.setBounds(12, 436, 120, 16);
		add(lblEstimatedBlocks);
		
		textField_8 = new JTextField();
		textField_8.setBounds(123, 433, 116, 22);
		add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblQuotedPrice = new JLabel("Quoted Price:");
		lblQuotedPrice.setBounds(12, 479, 78, 16);
		add(lblQuotedPrice);
		
		textField_9 = new JTextField();
		textField_9.setBounds(88, 476, 116, 22);
		add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblGenerateDirections = new JLabel("Generate Directions");
		lblGenerateDirections.setBounds(87, 532, 117, 16);
		add(lblGenerateDirections);
		
		JLabel lblSave = new JLabel("Save");
		lblSave.setBounds(228, 577, 56, 16);
		add(lblSave);
		
		JLabel lblCancel = new JLabel("Cancel");
		lblCancel.setBounds(341, 577, 56, 16);
		add(lblCancel);
		
		JLabel lblDeliveryCustomerNumber = new JLabel("Delivery Customer Number:");
		lblDeliveryCustomerNumber.setBounds(392, 176, 161, 16);
		add(lblDeliveryCustomerNumber);
		
		textField_10 = new JTextField();
		textField_10.setBounds(551, 173, 116, 22);
		add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblCustomerName_1 = new JLabel("Customer Name:");
		lblCustomerName_1.setBounds(416, 211, 103, 16);
		add(lblCustomerName_1);
		
		textField_11 = new JTextField();
		textField_11.setBounds(530, 205, 116, 22);
		add(textField_11);
		textField_11.setColumns(10);
		
		JCheckBox chckbxBillToPickup = new JCheckBox("Bill To Pickup");
		chckbxBillToPickup.setBounds(441, 274, 113, 25);
		add(chckbxBillToPickup);
		
		JLabel lblDeliveryInfo = new JLabel("Delivery Info:");
		lblDeliveryInfo.setBounds(428, 325, 91, 16);
		add(lblDeliveryInfo);
		
		JLabel lblCourierNo = new JLabel("Courier No:");
		lblCourierNo.setBounds(382, 354, 102, 16);
		add(lblCourierNo);
		
		textField_12 = new JTextField();
		textField_12.setBounds(463, 354, 116, 22);
		add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblAssignedTime = new JLabel("Assigned Time:");
		lblAssignedTime.setBounds(392, 398, 92, 16);
		add(lblAssignedTime);
		
		textField_13 = new JTextField();
		textField_13.setBounds(483, 395, 116, 22);
		add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblPickedupTime = new JLabel("Pickedup Time:");
		lblPickedupTime.setBounds(406, 449, 92, 16);
		add(lblPickedupTime);
		
		JLabel lblDeliverdTime = new JLabel("Deliverd Time:");
		lblDeliverdTime.setBounds(416, 479, 103, 16);
		add(lblDeliverdTime);
		
		textField_14 = new JTextField();
		textField_14.setBounds(500, 446, 116, 22);
		add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(510, 476, 116, 22);
		add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblBonus = new JLabel("Bonus:");
		lblBonus.setBounds(406, 532, 56, 16);
		add(lblBonus);
		
		textField_16 = new JTextField();
		textField_16.setBounds(463, 526, 116, 22);
		add(textField_16);
		textField_16.setColumns(10);

	}
}
