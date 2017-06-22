package CourierUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.Font;

public class CityMapEditPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public CityMapEditPanel() {
		setLayout(null);
		
		JLabel lblCityMap = new JLabel("City Map Edit");
		lblCityMap.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCityMap.setBounds(171, 36, 124, 16);
		add(lblCityMap);
		
		JLabel lblStreet = new JLabel("Street:");
		lblStreet.setBounds(29, 86, 56, 16);
		add(lblStreet);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(96, 83, 118, 22);
		add(comboBox);
		
		JLabel lblStartDate = new JLabel("Start Date:");
		lblStartDate.setBounds(29, 136, 68, 16);
		add(lblStartDate);
		
		textField = new JTextField();
		textField.setBounds(98, 133, 116, 22);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblStartTime = new JLabel("Start Time:");
		lblStartTime.setBounds(29, 187, 68, 16);
		add(lblStartTime);
		
		textField_1 = new JTextField();
		textField_1.setBounds(98, 184, 116, 22);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAvenue = new JLabel("Avenue:");
		lblAvenue.setBounds(271, 83, 56, 16);
		add(lblAvenue);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(328, 83, 110, 22);
		add(comboBox_1);
		
		JLabel lblEndDate = new JLabel("End Date:");
		lblEndDate.setBounds(260, 133, 56, 16);
		add(lblEndDate);
		
		textField_2 = new JTextField();
		textField_2.setBounds(328, 133, 116, 22);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEndTime = new JLabel("End Time:");
		lblEndTime.setBounds(259, 187, 68, 16);
		add(lblEndTime);
		
		textField_3 = new JTextField();
		textField_3.setBounds(328, 184, 116, 22);
		add(textField_3);
		textField_3.setColumns(10);
		
		JList list = new JList();
		list.setBounds(111, 331, 272, -95);
		add(list);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(130, 388, 97, 25);
		add(btnAdd);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(261, 388, 97, 25);
		add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(389, 388, 97, 25);
		add(btnDelete);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(117, 249, 97, 25);
		add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(246, 249, 97, 25);
		add(btnCancel);

	}
}
