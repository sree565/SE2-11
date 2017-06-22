package CourierUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JButton;

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
		
		JLabel lblDelievryTicket = new JLabel("Delivery Ticket");
		lblDelievryTicket.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDelievryTicket.setBounds(267, 27, 171, 16);
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
		lblCustomerName.setBounds(12, 208, 107, 16);
		add(lblCustomerName);
		
		textField_6 = new JTextField();
		textField_6.setBounds(167, 205, 116, 22);
		add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblPickupTime = new JLabel("Pickup Time:");
		lblPickupTime.setBounds(12, 243, 86, 16);
		add(lblPickupTime);
		
		textField_7 = new JTextField();
		textField_7.setBounds(167, 240, 116, 22);
		add(textField_7);
		textField_7.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Bill To Pickup");
		chckbxNewCheckBox.setBounds(19, 274, 113, 25);
		add(chckbxNewCheckBox);
		
		JLabel lblTicketInfo = new JLabel("Ticket Info:");
		lblTicketInfo.setBounds(12, 308, 78, 16);
		add(lblTicketInfo);
		
		JLabel lblPackageId = new JLabel("Package ID:");
		lblPackageId.setBounds(12, 337, 96, 16);
		add(lblPackageId);
		
		textField_3 = new JTextField();
		textField_3.setBounds(167, 334, 116, 22);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEstimatedDelivery = new JLabel("Estimated Delivery Time:");
		lblEstimatedDelivery.setBounds(12, 372, 150, 16);
		add(lblEstimatedDelivery);
		
		textField_4 = new JTextField();
		textField_4.setBounds(165, 369, 116, 22);
		add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblEstimatedBlocks = new JLabel("Estimated Blocks:");
		lblEstimatedBlocks.setBounds(12, 412, 120, 16);
		add(lblEstimatedBlocks);
		
		textField_8 = new JTextField();
		textField_8.setBounds(165, 404, 116, 22);
		add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblQuotedPrice = new JLabel("Quoted Price:");
		lblQuotedPrice.setBounds(12, 449, 78, 16);
		add(lblQuotedPrice);
		
		textField_9 = new JTextField();
		textField_9.setBounds(167, 444, 116, 22);
		add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblSave = new JLabel("Save");
		lblSave.setBounds(228, 577, 56, 16);
		add(lblSave);
		
		JLabel lblCancel = new JLabel("Cancel");
		lblCancel.setBounds(341, 577, 56, 16);
		add(lblCancel);
		
		JLabel lblDeliveryCustomerNumber = new JLabel("Delivery Customer Number:");
		lblDeliveryCustomerNumber.setBounds(341, 176, 161, 16);
		add(lblDeliveryCustomerNumber);
		
		textField_10 = new JTextField();
		textField_10.setBounds(500, 173, 116, 22);
		add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblCustomerName_1 = new JLabel("Customer Name:");
		lblCustomerName_1.setBounds(341, 208, 103, 16);
		add(lblCustomerName_1);
		
		textField_11 = new JTextField();
		textField_11.setBounds(500, 205, 116, 22);
		add(textField_11);
		textField_11.setColumns(10);
		
		JCheckBox chckbxBillToPickup = new JCheckBox("Bill To Pickup");
		chckbxBillToPickup.setBounds(341, 274, 113, 25);
		add(chckbxBillToPickup);
		
		JLabel lblDeliveryInfo = new JLabel("Delivery Info:");
		lblDeliveryInfo.setBounds(416, 308, 91, 16);
		add(lblDeliveryInfo);
		
		JLabel lblCourierNo = new JLabel("Courier No:");
		lblCourierNo.setBounds(356, 337, 102, 16);
		add(lblCourierNo);
		
		textField_12 = new JTextField();
		textField_12.setBounds(500, 334, 116, 22);
		add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblAssignedTime = new JLabel("Assigned Time:");
		lblAssignedTime.setBounds(352, 372, 92, 16);
		add(lblAssignedTime);
		
		textField_13 = new JTextField();
		textField_13.setBounds(500, 369, 116, 22);
		add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblPickedupTime = new JLabel("Pickedup Time:");
		lblPickedupTime.setBounds(352, 407, 92, 16);
		add(lblPickedupTime);
		
		JLabel lblDeliverdTime = new JLabel("Deliverd Time:");
		lblDeliverdTime.setBounds(356, 449, 103, 16);
		add(lblDeliverdTime);
		
		textField_14 = new JTextField();
		textField_14.setBounds(500, 409, 116, 22);
		add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(500, 446, 116, 22);
		add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblBonus = new JLabel("Bonus:");
		lblBonus.setBounds(356, 484, 56, 16);
		add(lblBonus);
		
		textField_16 = new JTextField();
		textField_16.setBounds(500, 481, 116, 22);
		add(textField_16);
		textField_16.setColumns(10);
		
		JButton btnGenerateDirections = new JButton("Generate Directions");
		btnGenerateDirections.setBounds(22, 498, 151, 25);
		add(btnGenerateDirections);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(210, 532, 97, 25);
		add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(341, 532, 97, 25);
		add(btnCancel);

	}
}
