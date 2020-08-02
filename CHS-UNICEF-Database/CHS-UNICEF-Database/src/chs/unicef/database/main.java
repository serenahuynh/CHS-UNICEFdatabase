package chs.unicef.database;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		ArrayList<String> events = null;
		Member serenaH = new Member("Serena Huynh", "Senior", "1112388", events, "President");
		//REST OF ROSTER NOT SHOWN FOR PRIVACY PURPOSES
		
		List<Member> roster = new ArrayList<>();
		roster.add(serenaH);
		
		Unicef twentyNineteen = new Unicef(roster);
		Member selina = new Member("Selina Huynh", "Senior", "-------", events, "Co-President");
		serenaH.pay(10);
		selina.pay(10);
		
		serenaH.donation(200);
		selina.donation(100);
		
		serenaH.addEvents("Haunted Harvest | Oct 5, 4pm-9pm");
		serenaH.volunteerHours(5);
		selina.addEvents("Holiday Express | Dec 23, 4pm-9pm");
		selina.volunteerHours(5);
		
		System.out.println("2019-2020 UNICEF member count: " + Unicef.memberCount());
		System.out.println("2019-2020 UNICEF Roster: " + Unicef.viewMembers());
		System.out.println("Total club hours: " + Unicef.viewHours() + ". Keep it up!");
		System.out.println("The club currently has $" + Unicef.viewFunds() +" in funds!");
		
		System.out.println("Serena currently owes: $" + serenaH.clubFee() + ", and donated: $" + serenaH.viewDonation());
		System.out.println("Serena volunteered for " + serenaH.hours() + " hours so far!");
		
		System.out.println("The member with most hours is " + Unicef.memMostHours() + " with " + Unicef.mostHours() + " hours!");
		System.out.println("The member who donated the most is " + Unicef.memMostDonate() + " with $" + Unicef.mostDonation() "!");
	}

}
