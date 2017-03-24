package demo;

import java.util.Scanner;

public class WhileDemo {

	
	public static void main(String[] args) {
		 int correctPin = 1234;
		
		 Scanner k = new Scanner(System.in);
		
		System.out.println("Please enter your pin");
		int enteredPin = k.nextInt();
		
		while (enteredPin != correctPin){
			//Keep asking the user to enter the PIN
		}
		
		
	}

}
