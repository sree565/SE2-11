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

import javax.swing.event.ListSelectionEvent;

public class DriverListPanel extends JPanel{

	/**
	 * Create the panel.
	 */
	private JList list ;
	private DefaultListModel listModel;
	public DriverListPanel(JFrame currentFrame,ACMECourierCompany c) throws SQLException{
		setLayout(null);
		listModel = new DefaultListModel();
		for(Driver d:c.getDrivers())
			listModel.addElement(d);
		
		//list = new JList(listModel);
		
		JLabel lblDriverDetails = new JLabel("Driver Details");
		lblDriverDetails.setBounds(177, 34, 116, 16);
		add(lblDriverDetails);
		
		
		
		JButton btnEdit = new JButton("Edit Driver");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				DriverAddPanel k=new DriverAddPanel(currentFrame,c,(Driver)list.getSelectedValue());
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(k);
				currentFrame.revalidate();
			}
		});
		btnEdit.setBounds(35, 241, 117, 29);
		btnEdit.setEnabled(false);
		add(btnEdit);
		
		JButton btnAdd = new JButton("Hire");
		btnAdd.addActionListener(new ActionListener() {
			Driver driver=new Driver();
			public void actionPerformed(ActionEvent e) {
				//DriverAddPanel driveraddPanel=;
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new DriverAddPanel(currentFrame,c,driver));
				currentFrame.revalidate();
				
			}
		});
		btnAdd.setBounds(190, 241, 117, 29);
		add(btnAdd);
		
		JButton btnDelete = new JButton("Fire");
		btnDelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Connection con;
				Statement stem;
				try{
					Driver s=(Driver)list.getSelectedValue();
				c.removeDriver(s);
				listModel.removeElement(list.getSelectedValue());
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project_se1","root","241656");
				PreparedStatement ps = con.prepareStatement("delete from driver where driver_no=?");
	            ps.setInt(1, s.getNumber());
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
