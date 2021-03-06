package CourierUI;


import java.sql.*;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionListener;

import courierPD.ACMECourierCompany;
import courierPD.Customer;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.util.Map.Entry;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionEvent;

public class CustomerListPanel extends JPanel {

	/**
	 * Create the panel.
	 */
public JList list;
private DefaultListModel dList;
public Statement st;

	JButton btnEdit;
	public CustomerListPanel(JFrame currentFrame, ACMECourierCompany company){
		
		setLayout(null);
		
		JLabel lblCustomersList = new JLabel("Customers List");
		lblCustomersList.setFont(new Font("Tahoma", Font.BOLD, 14));
		dList= new DefaultListModel();

		for(Customer c : company.getCustomers())
		{
			dList.addElement(c.getCustomer());
			System.out.println("hello");
		}

		lblCustomersList.setBounds(131, 49, 164, 16);
		add(lblCustomersList);
		
		list = new JList(dList);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if(list.getSelectedValue()!=null)
				{
					btnEdit.setEnabled(true);
				}
			}
		});
	
		list.setBounds(47, 91, 359, 192);
     	add(list);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			     Customer customer = new Customer();       
	            currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new CustomerEditPanel(currentFrame,customer,company));
			     currentFrame.getContentPane().revalidate();
			}
		});
		btnAdd.setBounds(31, 325, 97, 25);
		add(btnAdd);
		
		 btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ACMECourierCompany company=new ACMECourierCompany();
				CustomerEditPanel customeEditPanel=new CustomerEditPanel(currentFrame,(Customer)list.getSelectedValue(),company);
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(customeEditPanel); 
				currentFrame.revalidate();
			}
		});
		btnEdit.setBounds(166, 325, 97, 25);
		add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				company.removeCustomer((Customer)list.getSelectedValue());
				dList.removeElement(list.getSelectedValue());
			}
		});
		btnDelete.setBounds(291, 325, 97, 25);
		add(btnDelete);

	}
}
