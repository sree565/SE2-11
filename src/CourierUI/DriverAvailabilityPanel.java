package CourierUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class DriverAvailabilityPanel extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public DriverAvailabilityPanel() {
		setLayout(null);
		
		JLabel lblDriverAvailability = new JLabel("Driver Availability");
		lblDriverAvailability.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblDriverAvailability.setBounds(161, 27, 167, 16);
		add(lblDriverAvailability);
		
		JList list = new JList();
		list.setBounds(68, 77, 336, 160);
		add(list);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSave.setBounds(107, 268, 97, 25);
		add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setBounds(266, 268, 97, 25);
		add(btnCancel);
		
		table = new JTable();
		table.setBounds(360, 131, 1, 1);
		add(table);

	}
}
