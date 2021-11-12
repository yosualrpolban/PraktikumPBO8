package Soal3;

public class Staff {
	StaffMember[] staffList;
		
		public Staff() {
			staffList = new StaffMember[8];
			staffList[0] = new Executive("Sam","123 Main Line","555-0469","123--65-4321",2423.07);
			staffList[1] = new Employee("Carla","456 Off Line","555-0101","987-65-4321", 1246.15);
			staffList[2] = new Employee("Woody","789 Off Rocker","555-0000","010-20-3040", 1169.23);
			staffList[3] = new Hourly("Diane","678 Fifth Ave","555-0690","958-47-3625", 10.55);
			staffList[4] = new Volunteer("Norm", "987 Sude Bivd","555-8374");
			staffList[5] = new Volunteer("Cliff","313 Duds Lane","555-7282");
			staffList[6] = new Commission("Brian", "321 Sixth Ave", "555-0470", "958-47-7777", 6.25, 0.2);
			staffList[7] = new Commission("Buzz", "777 Mars", "555-0202", "958-47-3654", 9.75, 0.15);
			
			((Executive)staffList[0]).awardBonus(500.00);
			((Hourly)staffList[3]).addHours(40);
			((Commission)staffList[6]).addHours(35);
			((Commission)staffList[6]).addSales(4000);
			((Commission)staffList[7]).addHours(40);
			((Commission)staffList[7]).addSales(950);	}
	
		public void payday() {
			double amount;
			
			for(int count=0;count < staffList.length; count++) {
				System.out.println(staffList[count]);
				amount = staffList[count].pay();	//polymorphic
				if(amount == 0.0)
					System.out.println("Thanks!!");
				else
					System.out.println("Paid: " + amount);
				System.out.println("-------------------------------------");
		}
	}
}
