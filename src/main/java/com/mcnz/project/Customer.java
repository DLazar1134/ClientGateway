package com.mcnz.project;

//@Document(collection = "customer")
public class Customer {

	//@Id
	private String id;
	private String name, password, email;

	public Customer() {
	}

	public Customer(String name, String password, String email) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", password=" + password + ", email=" + email + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

}
