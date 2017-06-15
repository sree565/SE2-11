package CourierUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ReportsPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public ReportsPanel() {
		setLayout(null);
		
		JLabel lblReports = new JLabel("Reports");
		lblReports.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblReports.setBounds(184, 28, 122, 29);
		add(lblReports);
		
		JRadioButton rdbtnCustomerInvoiiceReports = new JRadioButton("Customer Invoiice Reports");
		rdbtnCustomerInvoiiceReports.setBounds(100, 78, 195, 25);
		add(rdbtnCustomerInvoiiceReports);
		
		JRadioButton rdbtnDriversReports = new JRadioButton("Driver's Reports");
		rdbtnDriversReports.setBounds(100, 108, 127, 25);
		add(rdbtnDriversReports);
		
		JLabel lblFromDate = new JLabel("From Date:");
		lblFromDate.setBounds(81, 142, 76, 16);
		add(lblFromDate);
		
		textField = new JTextField();
		textField.setBounds(167, 142, 116, 22);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblToDate = new JLabel("To Date:");
		lblToDate.setBounds(81, 188, 56, 16);
		add(lblToDate);
		
		textField_1 = new JTextField();
		textField_1.setBounds(167, 185, 116, 22);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnGenerateReport = new JButton("Generate Report");
		btnGenerateReport.setBounds(130, 237, 127, 25);
		add(btnGenerateReport);

	}
}
