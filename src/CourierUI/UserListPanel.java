package CourierUI;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;

import courierPD.ACMECourierCompany;
import courierPD.Driver;
import courierPD.User;

import javax.swing.event.ListSelectionEvent;

public class UserListPanel extends JPanel{

	/**
	 * Create the panel.
	 */
	private JList list ;
	private DefaultListModel listModel;
	public UserListPanel(JFrame currentFrame,ACMECourierCompany company) throws SQLException{
		setLayout(null);
		listModel = new DefaultListModel();
		for(User user:company.getUsers())
			listModel.addElement(user);
		
		//list = new JList(listModel);
		
		JLabel lblUserDetails = new JLabel("User List");
		lblUserDetails.setBounds(177, 34, 116, 16);
		add(lblUserDetails);
		
		
		
		JButton btnEdit = new JButton("Edit User");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				UserEditPanel userEdit=new UserEditPanel(currentFrame,(User)list.getSelectedValue(),company);
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(userEdit);
				currentFrame.revalidate();
			}
		});
		btnEdit.setBounds(187, 241, 117, 29);
		btnEdit.setEnabled(false);
		add(btnEdit);
		
		JButton btnAdd = new JButton("Add User");
		btnAdd.addActionListener(new ActionListener() {
			User user=new User();
			public void actionPerformed(ActionEvent e) {
				
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new UserEditPanel(currentFrame,user,company));
				currentFrame.revalidate();
				
			}
		});
		btnAdd.setBounds(40, 241, 130, 29);
		add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Connection con;
				Statement stem;
				try{
					User user=(User)list.getSelectedValue();
				company.removeUser(user);
				listModel.removeElement(list.getSelectedValue());
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project_se1","root","241656");
				PreparedStatement ps = con.prepareStatement("delete from user where u_id=?");
	            ps.setInt(1, user.getUserid());
	            ps.executeUpdate();
	            
				currentFrame.revalidate();
				}
				catch(SQLException ex)
				{
					System.out.println("arraylist not loading");
				}
			}
		});
		btnDelete.setBounds(327, 241, 117, 29);
		btnDelete.setEnabled(false);
		add(btnDelete);
		
		list= new JList(listModel);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if(list.getSelectedValue()!=null)
				{
					btnEdit.setEnabled(true);
					btnDelete.setEnabled(true);
				}
				
			}
		});
		list.setBounds(70, 62, 344, 154);
		add(list);

	}
}
