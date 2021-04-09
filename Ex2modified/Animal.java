package Ex2modified;

import java.util.*; //import java util package

public class Animal {
	Scanner sc = new Scanner(System.in);
	
	void properties() {
		System.out.println("Enter animal's name: ");
		String name = sc.nextLine();
		System.out.println("Enter the breed of it: ");
		String b = sc.nextLine();
		System.out.println("Enter the eyes' color: ");
		String e = sc.nextLine();
		
		System.out.println("ANIMAL PROPERTIES");
		System.out.println("Name: " + name);
		System.out.println("Breed: " + b);
		System.out.println("Eyes Color: " + e);
		System.out.println("------------------");
	}
	
	void calAge() {
		
		System.out.println("ANIMAL AGE CALCULATOR");
		
		System.out.println("Which animal selected (d=dog, c=cat, r=rabbit, h=hamster): ");
		char ani = sc.next().charAt(0);
		
		switch(ani) {
		case 'd' : System.out.println("Enter a number (value >= 1): " );
				   int a = sc.nextInt();
				   
				   double dog = (Math.log(a)* 16)+31;
				   System.out.println("If your dog were a human, it would be " + dog + " years old");
				   			break;
		case 'c' : System.out.println("Enter a number (1-10): " );
				   int ag = sc.nextInt();
				       int cat = 0;
				       int age = 0;
				   		if(ag == 1) 
				   			cat = ag * 15 ; 
				   		 else if(ag == 2) {
				   				cat = (ag * 10) + 4;
				   		System.out.println("If your cat was a human, it would be " + cat + " years old"); }	
				   		
				   		if((ag >=3) && (ag <= 10)) {
				   			
				   			switch(ag) {
				   			case 3 : age = 28;
				   					  break;
				   			case 4 : age = 32;
				   					  break;
				   			case 5 : age = 36;
				   			          break;
				   			case 6 : age = 40;
				   			          break;
				   			case 7 : age = 44;
				   			          break;
				   			case 8 : age = 48;
				   			          break;
				   			case 9 : age = 52;
				   			          break;
				   			case 10: age = 56;
				   					 break;}
				   	
				   		 System.out.println("If your cat was a human, it would be " + age + " years old");
				   			
				   		}
				   		   break;
				   		   
		case 'r' : System.out.println("Enter a number (1 - 5): " );
					int ag1 = sc.nextInt();
					int rab = 0;
			   		if(ag1 == 1) 
			   			rab = (ag1 * 20)+ 1 ; 
			   		 else if(ag1 == 2) 
			   				rab = (ag1 * 10) + 7;
			   		 else if(ag1 == 3) {
			   			 	rab = 33;
			   		System.out.println("If your rabbit was a human, it would be " + rab + " years old"); }      
			   		
			   		if((ag1 > 3) && (ag1 <= 5)) {
			   		    	   int data[] = {0,0,0,0,39,45};
			   		    	   int r = data[ag1];
			   		    	   System.out.println("If your rabbit was a human, it would be " + r + " years old");}	
			   					break;
		case 'h' : System.out.println("Enter a number (1-3)");
					int hA =sc.nextInt();
					double hamsA = 0;
					if(hA == 1) {
						hamsA= 58;
					System.out.printf("Your %d year old hamster would have %.0f years old if it was a human%n",hA,hamsA);}
					
					if(hA == 2) 
						hamsA = 70;
					else if(hA == 3) {
						hamsA = 100;
						System.out.printf("Your %d years old hamster would have %.0f years old if it was a human%n",hA,hamsA); }
					 break;		
		}
	}
	void printVege(){
			System.out.println("Does it a vegetarian ? (Y/N)");
			String vege = sc.nextLine();
			if(vege.equalsIgnoreCase("Y"))
			System.out.println("Yes! It's a vegetarian.");
			else
				System.out.println("Nahh.. It's not a vegetarian.");
		}
	void calMontlyfoodcost() {
			String pN = " ";
			int pack = 0;
			double pr = 0.0;
			double price = 0.0;

			System.out.println("Enter the pet name: ");
				pN = sc.nextLine();
			System.out.println("Enter the amount of packet of food bought: ");
				pack = sc.nextInt();
			System.out.println("Enter the price of the food: ");
				pr = sc.nextDouble();
			System.out.println("-------------------------------------------");
			
			System.out.println("MONTHLY FOOD EXPENSES");
			System.out.printf("Animal\t\t\tAmount\t\t\tPrice\n");
			price = pr * pack;
			System.out.printf("%s\t\t\t%d\t\t\t%.2f",pN,pack,price);
			
	}
}


