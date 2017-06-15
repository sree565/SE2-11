package CourierUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DriversReportPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public DriversReportPanel() {
		setLayout(null);
		
		JLabel lblDriversReport = new JLabel("Driver's Report");
		lblDriversReport.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblDriversReport.setBounds(154, 33, 139, 24);
		add(lblDriversReport);
		
		JLabel lblFromDate = new JLabel("From Date:");
		lblFromDate.setBounds(44, 84, 72, 16);
		add(lblFromDate);
		
		textField = new JTextField();
		textField.setBounds(111, 81, 116, 22);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblToDate = new JLabel("To Date:");
		lblToDate.setBounds(249, 84, 56, 16);
		add(lblToDate);
		
		textField_1 = new JTextField();
		textField_1.setBounds(303, 81, 116, 22);
		add(textField_1);
		textField_1.setColumns(10);
		
		JList list = new JList();
		list.setBounds(65, 113, 287, 125);
		add(list);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPrint.setBounds(151, 262, 97, 25);
		add(btnPrint);

	}

}
