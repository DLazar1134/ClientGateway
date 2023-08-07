package com.mcnz.project;

//@Document(collection = "registration")
public class Registration {

//	@Id
	private String Id;
	private String event_id, customer_id, notes;
	private java.util.Date registration_date = new java.util.Date();

	public Registration() {}

	public Registration(String event_id, String customer_id, String notes) {
		super();
		this.event_id = event_id;
		this.customer_id = customer_id;
		this.notes = notes;
//		this.registration_date = registration_date;
	}

	@Override
	public String toString() {
		return "Registration [event_id=" + event_id + ", customer_id=" + customer_id + ", notes=" + notes
				+ ", registration_date=" + registration_date + "]";
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getEvent_id() {
		return event_id;
	}

	public void setEvent_id(String event_id) {
		this.event_id = event_id;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public java.util.Date getRegistration_date() {
		return registration_date;
	}

	public void setRegistration_date(java.util.Date registration_date) {
		this.registration_date = registration_date;
	}

}
