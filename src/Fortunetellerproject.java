import java.util.Scanner;

public class Fortunetellerproject {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter first name");
		String enterName = input.nextLine();

		System.out.println("Enter last name");
		String lastName = input.nextLine();

		System.out.println("Whats your age?");
		String enterAge = input.nextLine();

		System.out.println("What is your birth month?");
		String enterMonth = input.nextLine();

		System.out.println("Whats your favorite ROYGBIV color? If you dont know what ROYGBIV is type help");{
		String enterROYGBIV = input.nextLine();
		if(enterROYGBIV.equals("help")){
			System.out.println("Enter Red Orange Yellow Green Blue Indigo Violet");
			enterROYGBIV=input.next();

		}

		System.out.println("Enter your age");

		int age = input.nextInt();

		if (age % 2 == 0) {
			System.out.println( age + " is even");
			System.out.println(" You will retire in 20 years");

		} else {
			System.out.println( age + " is odd");
			System.out.println("You will retire in 25 years");

		}

		System.out.println("How many siblings do you have");
		int numberSiblings= input.nextInt();
		String vacation;
		if (numberSiblings == 1) {
			vacation = "columbus,Oh";
			
		} else if (numberSiblings == 2) {
			vacation = "Lake Michigan";
			
		} else if (numberSiblings == 3) {
			vacation = "Toronto";
			
		} else if (numberSiblings == 4) {
			vacation = "California";
			
		} else if (numberSiblings >= 5) {
			vacation = "Texas";
			
		} else {
			vacation = "Pennsylvania";
		}
		
		
		String transportation=null;
		if (enterROYGBIV.equals("red")) {
			transportation = "Chevy";
		} else if (enterROYGBIV.equals("orange")) {
			transportation = "Ford";			
		} else if (enterROYGBIV.equals("yellow")) {
			transportation = "Honda";
		} else if (enterROYGBIV.equals("green")) {
			transportation = "Dodge";
		} else if (enterROYGBIV.equals("blue")) {
			transportation = "Mustang";
		} else if (enterROYGBIV.equals("indigo")) {
			transportation= "Lincoln";	
		} else if (enterROYGBIV.equals("violet")) {
			transportation= "Toyota";
		
		}
		System.out.println("What month were you born?");
		int birthMonth = input.nextInt();
		String balance=null;
		
		if(birthMonth >= 1 && birthMonth <= 4) {
			balance = "300,000.00";
		} else if(birthMonth >= 5 && birthMonth <= 8) {
			balance = "$400,000.00";
		}else if(birthMonth >= 9 && birthMonth <= 12) {
			balance = "$500,000.00";
		}
		
		input.close();
		
		System.out.println(enterName + " " + lastName + " will retire in" + age + " years with " 
		+ balance + " in the bank, a vaction home in " + vacation + ",and travel by" + transportation + ".");
		}
	}
}





