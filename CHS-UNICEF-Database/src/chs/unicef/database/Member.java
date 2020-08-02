package chs.unicef.database;

import java.util.ArrayList;

public class Member {
	private String fullName;
	private String year;
	private String id;
	private int clubFee;
	private static int memberCount = 0;
	private static int clubHours = 0;
	private int hours;
	private int donation;
	private String status;
	
	//ask for student name, ID, and year
	public Member(String name, String yr, String stuID, ArrayList<String> events, String stat) {
		fullName = name;
		year = yr;
		id = stuID;
		ArrayList<String> volunteerEvents = events;
		status = stat;
		hours = 0;
		clubFee = 10;
		donation = 0;
		Unicef.addMemberCount();
	}
	
	//add events method
	public void addEvents(String event) {
		ArrayList<String> volunteerEvents = new ArrayList<String>();
		volunteerEvents.add(event);
	}
	
	//add volunteer hours
	public void volunteerHours(int hours) {
		this.hours += hours;
		clubHours += hours;
		Unicef.updateHours(hours);
	}
	
	//update club fee balance
	public void pay(int fees) {
		clubFee -= fees;
		Unicef.updateFunds(fees);
	}
	
	//add donations to funds
	public void donation(int amount) {
		Unicef.updateFunds(amount);
		donation += amount;
	}
	
	//view donations
	public int viewDonation() {
		return donation;
	}
	
	
	//view balance
	public int clubFee() {
		return clubFee;
	}
	
	//view hours
	public int hours() {
		return hours;
	}
	
	//show status
	public String viewStatus() {
		return status;
	}

	
}
