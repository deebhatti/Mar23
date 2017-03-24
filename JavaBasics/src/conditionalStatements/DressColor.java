package conditionalStatements;

import java.util.Scanner;

public class DressColor {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.println("Please enter a day");
		String day = k.nextLine();
		

		switch (day) {
		case "Monday":
			System.out.println("Wear a white color dress");
			break;

		case "Tuesday":
			System.out.println("Wear a yellow color dress");
			break;

		case "Wednesday":
			System.out.println("Wear a red color dress");
			break;

		case "Thursday":
			System.out.println("Wear an orange color dress");
			break;

		case "Friday":
			System.out.println("Wear a pink color dress");
			break;

		case "Saturday":
			System.out.println("Wear a brown color dress");
			break;

		case "Sunday":
			System.out.println("Wear a green color dress");
			break;

		default:
			System.out.println("Please enter a valid input");

		}

	}

}
