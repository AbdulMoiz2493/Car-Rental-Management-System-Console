import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);
		 CRMS crms = new CRMS();
	        
	        //setting default inputs
	        CompactCar compactCar = new CompactCar("Honda", "Civic", 2020, "KY-786");   
	        compactCar.setRentalFee(4000);
	        SUV suv = new SUV("Audi", "E-tron GT", 2023, "A-000");
	        suv.setRentalFee(7000);
	        LuxuryCar luxuryCar = new LuxuryCar("Dodge Challenger", "Hellcat", 2019, "AAA-888");
	        luxuryCar.setRentalFee(12000);


	        RegularRenter regularRenter = new RegularRenter("Abdul Moiz", "moiz@gmail.com", "65436532", "Islamabad");
	        FrequentRenter frequentRenter = new FrequentRenter("Ahsan Ali Qasim", "ahsan@yahoo.com", "35643201283", "Rawalpindi");
	        CorporateRenter corporateRenter = new CorporateRenter("Rafay", "xyz@honda.com.pk", "123456", "Wah Cantt");


	        int choice;
	        do {
	        	//MENU
	        System.out.println();
	        System.out.println("----------- Car Rental Management System ------------");
	        System.out.println("1. Add a new car");
	        System.out.println("2. Display available cars");
	        System.out.println("3. Remove a car");
	        System.out.println("4. Add a new renter");
	        System.out.println("5. Display renter details");
	        System.out.println("6. Remove a renter");
	        System.out.println("7. Rent a car");
	        System.out.println("8. Display rental details");
	        System.out.println("9. Exit");
	        System.out.print("Enter your choice: ");
	        choice =scanner.nextInt();
	        
	        switch(choice) {      //conditions on the basis of requirements of user
	        case 1:
	        	System.out.println();
	        	System.out.println("which type of car would you like to add: ");
	        	System.out.println("1. Compact Car");
	        	System.out.println("2. SUV");
	        	System.out.println("3. Luxury Car");
	        	System.out.print("Enter your choice: ");

	        	int choice1 =scanner.nextInt();
	        	
	        	if(choice1==1) {
	        		crms.addCar(compactCar);
	        		System.out.println("Car added successfully!");
	        	}
	        	else if(choice1==2) {
	        		crms.addCar(suv);
	        		System.out.println("Car added successfully!");
	        	}
	        	else if(choice1==3) {
	        		crms.addCar(luxuryCar);
	        		System.out.println("Car added successfully!");
	        	}
	        	else
	        		System.out.println("Invalid Choice!");
	        	break;
	        	
	        case 2:
	        	System.out.println();
	        	crms.displayAvailableCars();
	        	break;
	        	
	        case 3:
	        	System.out.println();
	        	System.out.println("which type of car would you like to remove: ");
	        	System.out.println("1. Compact Car");
	        	System.out.println("2. SUV");
	        	System.out.println("3. Luxury Car");
	        	System.out.print("Enter your choice: ");
	        	int choice2 =scanner.nextInt();
	        	
	        	if(choice2==1) {
	        		crms.removeCar(compactCar);
	        	}
	        	else if(choice2==2) {
	        		crms.removeCar(suv);
	        	}
	        	else if(choice2==3) {
	        		crms.removeCar(luxuryCar);
	        	}
	        	else
	        		System.out.println("Invalid Choice!");
	        	break;
	        	
	        case 4:
	        	System.out.println();
	        	System.out.println("which type of renter would you like to add: ");
	        	System.out.println("1. Regular Renter");
	        	System.out.println("2. Frequent Renter");
	        	System.out.println("3. Corporate Renter");
	        	System.out.print("Enter your choice: ");
	        	int choice3 =scanner.nextInt();
	        	
	        	if(choice3==1) {
	        		crms.addRenter(regularRenter);
	        		System.out.println("Renter added successfully!");
	        	}
	        	else if(choice3==2) {
	        		crms.addRenter(frequentRenter);
	        		System.out.println("Renter added successfully!");
	        	}
	        	else if(choice3==3) {
	        		crms.addRenter(corporateRenter);
	        		System.out.println("Renter added successfully!");
	        	}
	        	else
	        		System.out.println("Invalid Choice!");
	        	break;
	        	
	        case 5:
	        	System.out.println();
	        	crms.displayRenterDetails();
	        	break;
	        	
	        case 6:
	        	System.out.println();
	        	System.out.println("which type of renter would you like to remove: ");
	        	System.out.println("1. Regular Renter");
	        	System.out.println("2. Frequent Renter");
	        	System.out.println("3. Corporate Renter");
	        	System.out.print("Enter your choice: ");
	        	int choice4 =scanner.nextInt();
	        	
	        	if(choice4==1) {
	        		crms.removeRenter(regularRenter);
	        	}
	        	else if(choice4==2) {
	        		crms.removeRenter(frequentRenter);
	        	}
	        	else if(choice4==3) {
	        		crms.removeRenter(corporateRenter);
	        	}
	        	else
	        		System.out.println("Invalid Choice!");
	        	break;
	        	
	        case 7:
	        	System.out.println();
	        	System.out.println("which type of car would you like to rent: ");
	        	System.out.println("1. Compact Car");
	        	System.out.println("2. SUV");
	        	System.out.println("3. Luxury Car");
	        	System.out.print("Enter your choice: ");
	        	int choice5 =scanner.nextInt();
	        	System.out.println("which type of renter would you like to have: ");
	        	System.out.println("1. Regular Renter");
	        	System.out.println("2. Frequent Renter");
	        	System.out.println("3. Corporate Renter");
	        	System.out.print("Enter your choice: ");
	        	int choice6 =scanner.nextInt();
	        	
	        	
	        	
	        	if(choice5==1 && choice6==1) {
	        		crms.rentCar(regularRenter, compactCar);
	        		System.out.println("Enter total distance traveled: ");
	     	        double totalDistance = scanner.nextDouble();
	        		System.out.println("Rental Cost : "+compactCar.calculateRentalCost(totalDistance));
	        		double total=compactCar.calculateRentalCost(totalDistance);
	        		double damage=crms.DamagePercentage(total);
	        		System.out.println("Damage Cost: "+damage);
	        	}
	        	
	        	
	        	else if(choice5==1 && choice6==2) {
	        		crms.rentCar(frequentRenter, compactCar);
	        		System.out.println("Enter total distance traveled: ");
	     	        double totalDistance = scanner.nextDouble();
	     	        double frequent_discount=0.9;
	        		System.out.println("Rental Cost after frequent user discount : "+compactCar.calculateRentalCost(totalDistance)*frequent_discount);
	        		double total=(compactCar.calculateRentalCost(totalDistance)*frequent_discount);
	        		double damage=crms.DamagePercentage(total);
	        		System.out.println("Damage Cost: "+damage);
	        	}
	        	
	        	
	        	else if(choice5==1 && choice6==3) {
	        		crms.rentCar(corporateRenter, compactCar);
	        		System.out.println("Rental Cost : "+compactCar.getRentalFee());
	        		 System.out.println("Enter total distance traveled: ");
		     	        double totalDistance = scanner.nextDouble();
		     	        double corporate_discount=0.8;
		        		System.out.println("Rental Cost after corporate renter discount: "+compactCar.calculateRentalCost(totalDistance)*corporate_discount);
		        		double total=compactCar.calculateRentalCost(totalDistance)*corporate_discount;
		        		double damage=crms.DamagePercentage(total);
		        		System.out.println("Damage Cost: "+damage);
	        	}
	        	
	        	
	        	else if(choice5==2 && choice6==1) {
	        		crms.rentCar(regularRenter, suv);
	        		System.out.println("Enter total distance traveled: ");
	     	        double totalDistance = scanner.nextDouble();
	        		System.out.println("Rental Cost : "+suv.calculateRentalCost(totalDistance));
	        		
	        		double total=suv.calculateRentalCost(totalDistance);
        			double damage=crms.DamagePercentage(total);
        			
	        		System.out.println("Do you want to add insurance? (enter 0 for no/1 for yes: ");
	        		int a =scanner.nextInt();
	        		if(a==0) {
	        			System.out.println("No insurance granted!");
	        			System.out.println("Damage Cost: "+damage);
	        		}
	        		else if(a==1) {
	        			System.out.println("Insurance granted! Rent Cost after adding insurance amount: "+(suv.calculateRentalCost(totalDistance)+(suv.calculateInsuranceCost())));
	        			damage=damage-(suv.calculateInsuranceCost());
		        		System.out.println("Damage Cost: "+damage);
	        		}
	        		
	        		
	        	}
	        	
	        	
	        	else if(choice5==2 && choice6==2) {
	        		crms.rentCar(frequentRenter, suv);
	        		System.out.println("Enter total distance traveled: ");
	     	        double totalDistance = scanner.nextDouble();
	     	        double frequent_discount=0.9;
	        		System.out.println("Rental Cost after frequent user discount : "+suv.calculateRentalCost(totalDistance)*frequent_discount);
	        		double total=suv.calculateRentalCost(totalDistance)*frequent_discount;
        			double damage=crms.DamagePercentage(total);
	        		System.out.println("Do you want to add insurance? (enter 0 for no/1 for yes: ");
	        		int a =scanner.nextInt();
	        		if(a==0) {
	        			System.out.println("No insurance granted!");
	        			System.out.println("Damage Cost: "+damage);
	        		}
	        		else if(a==1) {
	        			System.out.println("Insurance granted! Rent Cost after adding insurance amount: "+(suv.calculateRentalCost(totalDistance)*frequent_discount+(suv.calculateInsuranceCost())));
	        			damage=damage-(suv.calculateInsuranceCost());
		        		System.out.println("Damage Cost: "+damage);
	        		}
	        		
	        	}
	        	
	        	
	        	else if(choice5==2 && choice6==3) {
	        		crms.rentCar(corporateRenter, suv);
	        		 System.out.println("Enter total distance traveled: ");
		     	        double totalDistance = scanner.nextDouble();
		     	        double corporate_discount=0.8;
		        		System.out.println("Rental Cost after corporate renter discount: "+suv.calculateRentalCost(totalDistance)*corporate_discount);
		        		double total=suv.calculateRentalCost(totalDistance)*corporate_discount;
	        			double damage=crms.DamagePercentage(total);
		        		System.out.println("Do you want to add insurance? (enter 0 for no/1 for yes: ");
		        		int a =scanner.nextInt();
		        		if(a==0) {
		        			System.out.println("No insurance granted!");
		        			System.out.println("Damage Cost: "+damage);
		        		}
		        		else if(a==1) {
		        			System.out.println("Insurance granted! Rent Cost after adding insurance amount: "+(suv.calculateRentalCost(totalDistance)*corporate_discount+(suv.calculateInsuranceCost())));
		        			damage=damage-(suv.calculateInsuranceCost());
			        		System.out.println("Damage Cost: "+damage);
		        		}
		        		
	        	}
	        	
	        	
	        	else if(choice5==3 && choice6==1) {
	        		crms.rentCar(regularRenter, luxuryCar);
	        		System.out.println("Enter total distance traveled: ");
	     	        double totalDistance = scanner.nextDouble();
	        		System.out.println("Rental Cost : "+luxuryCar.calculateRentalCost(totalDistance));
	        		double total=luxuryCar.calculateRentalCost(totalDistance);
        			double damage=crms.DamagePercentage(total);
	        		System.out.println("Do you want to add insurance? (enter 0 for no/1 for yes: ");
	        		int a =scanner.nextInt();
	        		if(a==0) {
	        			System.out.println("No insurance granted!");
		        		System.out.println("Damage Cost: "+damage);
	        		}
	        		else if(a==1) {
	        			System.out.println("Insurance granted! Rent Cost after adding insurance amount: "+(luxuryCar.calculateRentalCost(totalDistance)+(suv.calculateInsuranceCost())));
	        			damage=damage-luxuryCar.calculateInsuranceCost();
		        		System.out.println("Damage Cost: "+damage);
	        		}
	        		
	        	}
	        	
	        	
	        	else if(choice5==3 && choice6==2) {
	        		crms.rentCar(frequentRenter, luxuryCar);
	        		System.out.println("Enter total distance traveled: ");
	     	        double totalDistance = scanner.nextDouble();
	     	        double frequent_discount=0.9;
	        		System.out.println("Rental Cost after frequent user discount : "+luxuryCar.calculateRentalCost(totalDistance)*frequent_discount);
	        		double total=luxuryCar.calculateRentalCost(totalDistance)*frequent_discount;
        			double damage=crms.DamagePercentage(total);
	        		System.out.println("Do you want to add insurance? (enter 0 for no/1 for yes: ");
	        		int a =scanner.nextInt();
	        		if(a==0) {
	        			System.out.println("No insurance granted!");
	        			System.out.println("Damage Cost: "+damage);
	        		}
	        		else if(a==1) {
	        			System.out.println("Insurance granted! Rent Cost after adding insurance amount: "+(luxuryCar.calculateRentalCost(totalDistance)*frequent_discount+(luxuryCar.calculateInsuranceCost())));
	        			damage=damage-luxuryCar.calculateInsuranceCost();
		        		System.out.println("Damage Cost: "+damage);
	        		}
	        		
	        	}
	        	
	        	
	        	
	        	else if(choice5==3 && choice6==3) {
	        		crms.rentCar(corporateRenter, luxuryCar);
	        		 System.out.println("Enter total distance traveled: ");
		     	        double totalDistance = scanner.nextDouble();
		     	        double corporate_discount=0.8;
		        		System.out.println("Rental Cost after corporate renter discount: "+luxuryCar.calculateRentalCost(totalDistance)*corporate_discount);
		        		double total=luxuryCar.calculateRentalCost(totalDistance)*corporate_discount;
	        			double damage=crms.DamagePercentage(total);
		        		System.out.println("Do you want to add insurance? (enter 0 for no/1 for yes: ");
		        		int a =scanner.nextInt();
		        		if(a==0) {
		        			System.out.println("No insurance granted!");
		        			
		        			System.out.println("Damage Cost: "+damage);
		        		}
		        		else if(a==1) {
		        			System.out.println("Insurance granted! Rent Cost after adding insurance amount: "+(luxuryCar.calculateRentalCost(totalDistance)*corporate_discount+(luxuryCar.calculateInsuranceCost())));
		        			damage=damage-luxuryCar.calculateInsuranceCost();
			        		System.out.println("Damage Cost: "+damage);
		        		}
		        		
		        		
	        	}
	        	
	        	
	        	else
	        		System.out.println("Invalid Choice!");
	        	break;
	        	
	        	
	        case 8:
	        	System.out.println();
	        	 crms.displayRentalDetails();
	        	 break;
	        	 
	        case 9:
	        	System.out.println();
	        	System.out.println("Exiting...");
	        }
	        }while(choice!=9);

	}

}
