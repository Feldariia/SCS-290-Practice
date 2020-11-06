 /*
		 Project Name: Queues
		 Author: Shannon Mong
		 GitHub: Feldariia
		 Description: Week 10
		 Last Modified: 25Oct2020
		 Version: 1.0
		 */

import java.util.*;
public class Queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to the game! Here are your character stats:");
		
		// Create our priority queue of size 10 and assign a custom comparison method
		PriorityQueue<Characters> pq = new PriorityQueue<Characters>(10, new CharactersComparator()); 

		//Adding characters to queue and assigning a stat record
		Characters char1 = new Characters("Iril", 3.2); 
		pq.add(char1); 
		Characters char2 = new Characters("Asreil", 6.6); 
		pq.add(char2);          
		Characters char3 = new Characters("Feldaria", 1.0); 
		pq.add(char3); 
		Characters char4 = new Characters("Tonak", 4.0); 
		pq.add(char4); 
		Characters char5 = new Characters("Krital", 2.5); 
		pq.add(char5); 
		
		//Print out the highest character stats in order
		System.out.println("Your characters with the highest stats are as followed:"); 

		while (!pq.isEmpty()) { 
			System.out.println(pq.poll().getName()); 
		}
		
		}
}
		// OVERRIDING
		class CharactersComparator implements Comparator<Characters>{ 

			// Overriding compare()method of Comparator  
			// for a descending list of characters
			public int compare(Characters s1, Characters s2) { 
				if (s1.stats < s2.stats) 
					return 1; 
				else if (s1.stats > s2.stats) 
					return -1; 
				return 0; 
			} 
		} 
