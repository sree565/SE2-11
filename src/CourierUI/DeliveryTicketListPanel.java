package CourierUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;

public class DeliveryTicketListPanel extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public DeliveryTicketListPanel() {
		setLayout(null);
		
		JLabel lblDeliveryTicket = new JLabel("Delivery Ticket");
		lblDeliveryTicket.setBounds(131, 39, 161, 31);
		add(lblDeliveryTicket);
		
		table = new JTable();
		table.setBounds(54, 212, 274, -114);
		add(table);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(79, 246, 97, 25);
		add(btnAdd);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(205, 246, 97, 25);
		add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(314, 246, 97, 25);
		add(btnDelete);

	}

}
