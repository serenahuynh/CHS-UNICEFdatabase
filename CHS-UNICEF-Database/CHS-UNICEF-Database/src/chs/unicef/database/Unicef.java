package chs.unicef.database;

import java.util.List;

public class Unicef {
	private static List<Member> members;
	private static int totalClubFunds;
	private static int totalHours;
	private static int memberCount;
	private static String mostHours;
	private static String mostDonations;
	
	//create 2019-2020 UNICEF Database
	public Unicef(List<Member> members) {
		this.members = members;
		totalClubFunds = 0;
		totalHours = 0;
		memberCount = 1;
	}
	
	//add member
	public void addMember(Member member) {
		members.add(member);
	}

	//add member to count
	public static void addMemberCount() {
		memberCount++;
	}
	//get number of members
	public static int memberCount() {
		return memberCount;
	}
	
	//get list of members
	public static List<Member> viewMembers(){
		return members;
	}
	
	//update club funds
	public static void updateFunds(int funds) {
		totalClubFunds += funds;
	}
	
	//view club funds
	public static int viewFunds() {
		return totalClubFunds;
	}
	
	//update total club hours
	public static void updateHours(int hours) {
		totalHours += hours;
	}
	
	//view club hours
	public static int viewHours() {
		return totalHours;
	}

	//number of max hours
	public static int mostHours() {
		int maxHours = 0;
		for(List m: members) {
			if (member.hours() > maxHours) {
				maxHours = member.hours();
				mostHours = member;
			}
		}
		return maxHours;
	}
	
	//return member with most hours
	public static String memMostHours() {
		return mostHours;
	}
	
	//number of max donation
	public static int mostDonation() {
		int maxDonation = 0;
		for(List m: members) {
			if (member.viewDonation() > maxDonation) {
				maxDonation = member.viewDonation();
				mostDonations = member;
			}
		}
		return maxDonation;
	}
	
	//return member with most hours
	public static String memMostDoante() {
		return mostDonations;
	}


}
