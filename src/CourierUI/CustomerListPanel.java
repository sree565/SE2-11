package CourierUI;

import javax.swing.JPanel;

import Courier.ACMECourierCompany;
import Courier.Customer;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerListPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public CustomerListPanel(JFrame currentFrame, ACMECourierCompany company){
		
		setLayout(null);
		
		JLabel lblCustomersList = new JLabel("Customers List");
		System.out.println("dskahf");
		//lblCustomersList.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCustomersList.setBounds(184, 41, 164, 16);
		add(lblCustomersList);
		
		JList list = new JList();
		list.setBounds(66, 81, 397, 214);
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
		btnAdd.setBounds(77, 325, 97, 25);
		add(btnAdd);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEdit.setBounds(217, 325, 97, 25);
		add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setBounds(366, 325, 97, 25);
		add(btnDelete);

	}
}
