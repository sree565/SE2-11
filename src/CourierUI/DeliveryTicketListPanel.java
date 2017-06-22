package CourierUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JList;

public class DeliveryTicketListPanel extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public DeliveryTicketListPanel() {
		setLayout(null);
		
		JLabel lblDeliveryTicket = new JLabel("Delivery Ticket");
		lblDeliveryTicket.setBounds(167, 32, 161, 31);
		add(lblDeliveryTicket);
		
		table = new JTable();
		table.setBounds(54, 212, 274, -114);
		add(table);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(54, 246, 97, 25);
		add(btnAdd);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(189, 246, 97, 25);
		add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(314, 246, 97, 25);
		add(btnDelete);
		
		JList list = new JList();
		list.setBounds(79, 73, 274, 138);
		add(list);

	}
}
