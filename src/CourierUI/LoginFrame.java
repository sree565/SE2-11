package CourierUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import courierPD.ACMECourierCompany;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginFrame extends JFrame {
	
	private JFrame frame;

	private JPanel contentPane;
	private JTextField usernametxt;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
					 frame.setSize(600,600);
						
				        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				        frame.getContentPane().setLayout(new BorderLayout());
				        //frame.pack();  
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 382, 287);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(111, 97, 84, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPassword.setBounds(111, 155, 97, 16);
		contentPane.add(lblPassword);
		
		usernametxt = new JTextField();
		usernametxt.setBounds(219, 94, 116, 22);
		contentPane.add(usernametxt);
		usernametxt.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0) {
				 String uname = usernametxt.getText();
				 String pwd = passwordField.getText();
				 
				 if (uname.equals("admin")&& pwd.equals("123")){
					 JOptionPane.showMessageDialog(frame, "Logged in successfully");
					 //frame.setVisible(false);
					 ACMECourierCompany company = new ACMECourierCompany();
					 HomeFrame home = new HomeFrame(company);
					 home.setVisible(true);
					 
				 }
				 else
				 JOptionPane.showMessageDialog(frame,"Invalid credentials");
				 
				 //Navigate to Home page
				 
			}
		});
		btnLogin.setBounds(196, 225, 97, 25);
		contentPane.add(btnLogin);
		
		JLabel lblAcmeCourierServices = new JLabel("ACME Courier Services");
		lblAcmeCourierServices.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAcmeCourierServices.setBounds(163, 30, 192, 16);
		contentPane.add(lblAcmeCourierServices);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(220, 152, 115, 22);
		contentPane.add(passwordField);
	}
}
