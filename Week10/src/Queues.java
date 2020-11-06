/*
		 Project Name: Queues
		 Author: 
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

	//I'm not too sure about this part. I found this online and edited it to fit my code, but I do not believe
	//it is working alongside it.
	int binarySearch(int arr[], int l, int r, int x) 
	{ 
		if (r >= l) { 
			int mid = l + (r - l) / 2; 
			if (arr[mid] == x) 
				return mid;

			if (arr[mid] > x) 
				return binarySearch(arr, l, mid - 1, x);  
			return binarySearch(arr, mid + 1, r, x); 
		} 
		return -1; 
	} 

	// Driver method to test above 
	{
		BinarySearch ob = new BinarySearch(); 
		int arr[] = { 2, 3, 4, 10, 40 }; 
		int n = arr.length; 
		int x = 10; 
		int result = ob.binarySearch(arr, 0, n - 1, x); 
		if (result == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at index " + result); 
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
