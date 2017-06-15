package CourierUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.sql.PreparedStatement;

import java.util.ArrayList;

import courierPD.ACMECourierCompany;
import courierPD.Driver;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class DriverAddPanel extends JPanel {
	private JTextField txtCid;
	private JTextField txtFname;
	private JTextField txtLname;
	private JTextField txtPno;
	private JTextField txtEmail;

	/**
	 * Create the panel.
	 */
	public DriverAddPanel(JFrame currentFrame,ACMECourierCompany c,Driver driver) {
		//System.out.println("hii add panel");
		setLayout(null);
		
		JLabel lblAddDriver = new JLabel("ADD DRIVER");
		lblAddDriver.setBounds(182, 44, 118, 16);
		add(lblAddDriver);
		
		JLabel lblCourierId = new JLabel("COurier Id:-");
		lblCourierId.setBounds(72, 103, 76, 16);
		add(lblCourierId);
		
		JLabel lblFirstname = new JLabel("FirstName:-");
		lblFirstname.setBounds(87, 141, 61, 16);
		add(lblFirstname);
		
		JLabel lblLastname = new JLabel("LastName:-");
		lblLastname.setBounds(87, 179, 61, 16);
		add(lblLastname);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:-");
		lblPhoneNumber.setBounds(72, 221, 113, 16);
		add(lblPhoneNumber);
		
		JLabel lblEmailId = new JLabel("Email ID:-");
		lblEmailId.setBounds(87, 254, 61, 16);
		add(lblEmailId);
		
		txtCid = new JTextField();
		String k=Integer.toString(driver.getNumber());
		txtCid.setText(k);
		txtCid.setBounds(192, 93, 130, 26);
		add(txtCid);
		txtCid.setColumns(10);
		
		txtFname = new JTextField();
		txtFname.setText(driver.getName());
		txtFname.setBounds(192, 131, 130, 26);
		add(txtFname);
		txtFname.setColumns(10);
		
		txtLname = new JTextField();
		txtLname.setText(driver.getName());
		txtLname.setBounds(192, 169, 130, 26);
		add(txtLname);
		txtLname.setColumns(10);
		
		txtPno = new JTextField();
		txtPno.setText(driver.getPhone());
		txtPno.setBounds(192, 208, 130, 26);
		add(txtPno);
		txtPno.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setText(driver.getEmail());
		txtEmail.setBounds(192, 249, 130, 26);
		add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnSave = new JButton("Hire");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con;
				Statement stem;
				//drivers.clear();
				try{
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project_se1","root","241656");
					PreparedStatement ps = con.prepareStatement("insert into driver(driver_no, d_name, d_email, d_phone) values(?,?,?,?)");
		            ps.setString(1, txtCid.getText());
		            ps.setString(2, txtFname.getText()+txtLname.getText());
		            ps.setString(3, txtEmail.getText());
		            ps.setString(4, txtPno.getText());
		            ps.executeUpdate();
				int k=Integer.parseInt(txtCid.getText());
					driver.setNumber(k);
					driver.setName(txtFname.getText()+txtLname.getText());
					driver.setPhone(txtPno.getText());
					driver.setEmail(txtEmail.getText());
					c.addDriver(driver);
					currentFrame.getContentPane().removeAll();
					currentFrame.getContentPane().add(new DriverListPanel(currentFrame,c));
					currentFrame.getContentPane().revalidate();
				}
				catch(SQLException ex){
					
				}
			}
		});
		btnSave.setBounds(72, 305, 117, 29);
		add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
			currentFrame.getContentPane().removeAll();
			currentFrame.getContentPane().add(new DriverListPanel(currentFrame,c));
			currentFrame.getContentPane().revalidate();
				}
				catch(SQLException ex){
					
				}
			}
		});
		btnCancel.setBounds(229, 305, 117, 29);
		add(btnCancel);

	}

}
