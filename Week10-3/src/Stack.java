/*
		 Project Name: Stack for Week 10
		 GitHub: Feldariia
		 Description: Week10-3
		 Last Modified: 30Oct2020
		 Version: 1.0
 */


import java.util.Scanner;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare variables
		int menuOption;
		Scanner input= new Scanner(System.in);
		

		do
		{
			System.out.flush(); 
			System.out.println("Welcome to the store management system. Please select an option from below: ");
			System.out.println("1.) Create New Inventory List");
			System.out.println("2.) Delete Inventory Item");
			System.out.println("3.) Exit");
			
		menuOption=input.next().charAt(0);

			if(menuOption!='3')
			{
				switch(menuOption)
				{
				case '1':
					System.out.print("How big would you like the new list?: ");
					input.nextInt();
					break;
				case '2':
					System.out.print("How many items would you like to remove within the inventory list? ");
					input.nextInt();
					stack.remove(input);
					break;
				default:
					System.out.println("Goodbye." );
				}


			}
		} while (menuOption !='3');

		// Close the keyboard
		input.close();

	}

	
	//I didn't know if this should've been in my storage class, so I just added this on the bottom of my existing superclass code
	//It's just a method to remove an item from a stack in regards to the user's selected item through an item input.
	private static void remove(Scanner input) {
		stack.remove(input);
		
	}

}
