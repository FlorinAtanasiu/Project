package helloword;

import java.util.Scanner;

public class loops {
	public static void main(String[] args) {

		int value = 0;

		boolean loop = value < 10;

		while (value < 10) {
			System.out.println("hello" + value);
			// if u run this you get an infinite loop!

			value = value + 1;
		}
		// for loops
		for (int i = 0; i < 5; i++) {
			System.out.printf("The value of i is: %d\n", i);
		}

		// if loops
		int myInt = 15;

		if (myInt < 10) {

			System.out.println("Yes , it's true!");
		} else if (myInt > 20) {
			System.out.println("No, it's not true");
		} else {
			System.out.println("none of the above");
		}

		// do while loop
		Scanner scanner = new Scanner(System.in);

		/*System.out.println("Enter a number: ");
		int value = scanner.nextInt();

		while (value != 5) {
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
		}
		*/
		
		int vale = 0;
		do {
			System.out.println("Enter a number: ");
		    vale = scanner.nextInt();
		}
		while(vale != 5);
		
		System.out.println("Got 5!");
		
		//switch method
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter command: ");
		String text = input.nextLine();
		
		switch(text) {
		case "start": 
			System.out.println("machine started!");
			break;
			
		case "stop": 	
			System.out.println("machine stoped.");
			break; 
			
		default:
			System.out.println("command not recognized.");
		}
		
		
	}
}
