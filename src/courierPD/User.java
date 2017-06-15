package courierPD;
public class User {

	System System;
	private DeliveryTicket User;
	/*
	 * it is defined as the name of the user.
	 */
	private int userid;
	private String userphone;
	
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	public User(){
		this.setName(name);
		this.setEmail(email);
		this.setPassword(password);
		this.setUserRole(userRole);
		this.setUserphone(userphone);
		this.setUserid(userid);
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getUserid() {
		return userid;
	}
	
	private String name;
	/*
	 * it is defined as the username of the user.
	 */
	private String username;
	/**
	 * it is defined as the password of the user.
	 */
	private String password;
	/**
	 * it is defined as the email of the user.
	 */
	private String email;
	/**
	 * it is defines the role of the user.
	 */
	private String userRole;
	public System getSystem() {
		return System;
	}
	public void setSystem(System system) {
		System = system;
	}
	public DeliveryTicket getUser() {
		return User;
	}
	public void setUser(DeliveryTicket user) {
		User = user;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String toString()
	{
		return getUsername()+ " " + getUserid();
	}
}