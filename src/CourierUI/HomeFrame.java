package CourierUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Courier.ACMECourierCompany;
import Courier.Customer;
import CourierUI.CustomerListPanel;


import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class HomeFrame extends JFrame {
	
	private JFrame currentFrame;

	/**
	 * Launch the application.
	 */
	public void run(ACMECourierCompany company) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//pass the instance of Store to JFrame
					HomeFrame frame = new HomeFrame(company);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	/**
	 * Create the frame.
	 */
	public HomeFrame(ACMECourierCompany company) {
		
		JFrame currentFrame=this;
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 767, 506);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnDeliveryTicket = new JMenu("Delivery Ticket Management");
		menuBar.add(mnDeliveryTicket);
		
		JMenuItem mntmDeliveryTicket = new JMenuItem("Delivery Ticket List");
		mntmDeliveryTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnDeliveryTicket.add(mntmDeliveryTicket);
		
		JMenu mnNewMenu = new JMenu("City Map");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Manage Users");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnDriverDetails = new JMenu("Driver Details");
		menuBar.add(mnDriverDetails);
		
		JMenuItem mntmDriversList = new JMenuItem("Drivers List");
		mnDriverDetails.add(mntmDriversList);
		
		JMenuItem mntmDriversAvailability = new JMenuItem("Driver's Availability");
		mnDriverDetails.add(mntmDriversAvailability);
		
		JMenu mnNewMenu_2 = new JMenu("Customer Details");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmCustomerList = new JMenuItem("Customer List");
		mntmCustomerList.addActionListener(new ActionListener() {
			
			CustomerListPanel customerlist = new CustomerListPanel(currentFrame, company);
			public void actionPerformed(ActionEvent arg0) {
				
				currentFrame.setContentPane(customerlist);
				customerlist.setBorder(new EmptyBorder(5,5,5,5));
				customerlist.setLayout(new BorderLayout(0,0));
				currentFrame.pack();
				currentFrame.setLocationRelativeTo(null);
				currentFrame.setVisible(true);
				
				/*
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(customerlist);
				currentFrame.getContentPane().validate();*/
				
			}
		});
		
		
		mnNewMenu_2.add(mntmCustomerList);
		
		JMenu mnReports = new JMenu("Reports");
		menuBar.add(mnReports);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Reports Selection");
		mnReports.add(mntmNewMenuItem);
		
		JMenu mnLogout = new JMenu("Logout");
		menuBar.add(mnLogout);
		getContentPane().setLayout(null);
		
		JLabel lblWelcomeToAcme = new JLabel("Welcome to ACME Courier Service");
		lblWelcomeToAcme.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblWelcomeToAcme.setBounds(231, 103, 303, 141);
		getContentPane().add(lblWelcomeToAcme);
	}
}
