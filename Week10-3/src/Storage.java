
import java.util.*;
//Storage class
public class StackStorage {

	// Declare variables
	public Stack<Integer> stack = new Stack<Integer>();
	char designation;

	public StackStorage(int size)
	{
		Scanner scan = new Scanner(System.in);

		//Populate Stack
		for(int newSize=size;newSize>0;newSize--)
		{
			scan.nextInt();
		}
		// Print the Stack
		System.out.println(stack + "\n");

	}
	//View the top-most item within the stack
	private void viewTop()
	{
		System.out.println("Top Item: " + stack.peek());
	}

	//Method to remove an item from a stack
	public void removeInventory(int remove)
	{
		while(remove>0)
		{	
			if(!(stack.isEmpty()))
				stack.pop();
			remove--;
		}
		System.out.println(stack + "\n");
	}



	//Add an item to the inventory
	public void addInventory(int add)
	{
		stack.push(add);
		System.out.println(stack + "\n");
	}



}
