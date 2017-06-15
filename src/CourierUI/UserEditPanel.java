package CourierUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import courierPD.ACMECourierCompany;
import courierPD.User;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class UserEditPanel extends JPanel {
	private JTextField textuserId;
	private JTextField textName;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textRole;
	private JTextField txtEmail;
	private JTextField txtPhone;

	/**
	 * Create the panel.
	 */
	public UserEditPanel(JFrame currentFrame, User user, ACMECourierCompany company) {
		setLayout(null);
		
		JLabel lblUserEdit = new JLabel("User Edit");
		lblUserEdit.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUserEdit.setBounds(216, 28, 129, 16);
		add(lblUserEdit);
		
		JLabel lblUserId = new JLabel("User Id:");
		lblUserId.setBounds(30, 95, 56, 16);
		add(lblUserId);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(30, 131, 56, 16);
		add(lblName);
		
		textuserId = new JTextField();
		textuserId.setBounds(136, 92, 116, 22);
		add(textuserId);
		textuserId.setColumns(10);
		
		textName = new JTextField();
		textName.setBounds(214, 128, 116, 22);
		add(textName);
		textName.setColumns(10);
		
		JLabel lblUsername = new JLabel("UserName:");
		lblUsername.setBounds(30, 170, 77, 16);
		add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(136, 163, 116, 22);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(30, 205, 77, 16);
		add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 198, 116, 22);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblUserRole = new JLabel("User Role:");
		lblUserRole.setBounds(30, 242, 77, 16);
		add(lblUserRole);
		
		textRole = new JTextField();
		textRole.setBounds(136, 233, 116, 22);
		add(textRole);
		textRole.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(30, 271, 56, 16);
		add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(136, 268, 116, 22);
		add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Phone No:");
		lblNewLabel.setBounds(30, 311, 56, 16);
		add(lblNewLabel);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(136, 308, 116, 22);
		add(txtPhone);
		txtPhone.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnSave.setBounds(87, 371, 97, 25);
		add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserListPanel userListPanel = null;
				try {
					userListPanel = new UserListPanel(currentFrame,company);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(userListPanel);
				currentFrame.getContentPane().revalidate();
			}
		});
		btnCancel.setBounds(216, 371, 97, 25);
		add(btnCancel);

	}
}
