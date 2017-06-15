package CourierUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DriverAvailabilityPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public DriverAvailabilityPanel() {
		setLayout(null);
		
		JLabel lblDriverAvailability = new JLabel("Driver Availability");
		lblDriverAvailability.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblDriverAvailability.setBounds(161, 27, 167, 16);
		add(lblDriverAvailability);
		
		JList list = new JList();
		list.setBounds(68, 77, 296, 137);
		add(list);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSave.setBounds(96, 248, 97, 25);
		add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setBounds(216, 248, 97, 25);
		add(btnCancel);

	}

}
