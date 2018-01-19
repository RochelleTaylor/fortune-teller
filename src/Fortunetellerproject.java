import java.util.Scanner;

public class Fortunetellerproject {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter first name");
		String enterName = input.nextLine();

		System.out.println("Enter last name");
		String enterLastName = input.nextLine();

		System.out.println("Whats your age?");
		String enterAge = input.nextLine();

		System.out.println("What is your birth month?");
		String enterMonth = input.nextLine();

		System.out.println("Whats your favorite ROYGBIV color?");
		String enterColor = input.nextLine();

		System.out.println("Will retire in");

		int yearsRetire = input.nextInt();

		if (yearsRetire % 2 == 0) {
			System.out.println(yearsRetire + " is even");
			String yearsRetire1 = input.nextLine();
			System.out.println("You will retire in 20 years");

		} else {
			System.out.println(yearsRetire + " is odd");
			String yearsRetire1 = input.nextLine();
			System.out.println("You will retire in 25 years");

		}

		System.out.println("How many siblings do you have");
		String siblings = input.nextLine();

		int siblings1 = 1;
		String vacation;
		if (siblings1 == 1) {
			vacation = "columbus,Oh";
		} else if (siblings1 == 2) {
			vacation = "Lake Michigan";
		} else if (siblings1 == 3) {
			vacation = "Toronto";
		} else if (siblings1 == 4) {
			vacation = "California";
		} else if (siblings1 >= 5) {
			vacation = "Baton Rouge";
		} else {
			vacation = "Chernobyl, Ukraine";
		}
		System.out.println(vacation);

		System.out.println("Whats your favorite color?");
		String color = input.nextLine();

		String transportation;
		if (color.equals("red")) {
			transportation = "Chevy";
		} else if (color.equals("yellow")) {
			transportation = "Ford";			
		} else if (color.equals("purple")) {
			transportation = "Honda";
		} else if (color.equals("green")) {
			transportation = "Dodge";
		} else if (color.equals("brown")) {
			transportation = "Mustang";
		} else if (color.equals("orange")) {			
			
			
		}
		

	} // End of Main()
} // End of class Fortuneteller
