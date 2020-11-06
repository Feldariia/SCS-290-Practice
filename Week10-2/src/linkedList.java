/*
		 Project Name: LinkedList
		 GitHub: Feldariia
		 Description: Week 10
		 Last Modified: 25Oct2020
		 Version: 1.0
		 */
import java.util.*;
public class linkedList {
	public static void main(String[] args) {

	LinkedList<String> list = new LinkedList<String>();

	Scanner input = new Scanner(System.in);
	//Add students to the roster
	list.add("Sam");
	list.add("Bryan");
	list.add("Smith");
	list.add("Ben");
	list.add("Garrett");
	list.add("Chris");
	list.add("Em");
	list.add("Jas");
	list.add("Taylor");
	list.add("Delores");
	list.add("Christine");

	
	//Add the teacher to the first position
	System.out.println("Adding the teacher to the first position of the roster");
	list.addFirst("Brad");

	//Add a student to the end position
	System.out.println("Why are you late? What is your name?");	
	input.hasNext();
	list.addLast(input);
	
	
	
	input.close();
	Object roster {
	
	//Welcome the class and print out the list
	System.out.println("Welcome to the class! Here are your new classmates for this semester!: ");
	System.out.print(list);
	
	
	//Iterating LinkedList
	Iterator<String> iterator=list.iterator();
	while(iterator.hasNext()){
		System.out.println(iterator.next());
	
	
	
	}
	
	
	
	
	
	}
	

	
} 


}
