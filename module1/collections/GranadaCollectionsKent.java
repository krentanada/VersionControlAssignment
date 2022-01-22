package collections;
import java.util.*;

public class Kent {
	public static void main (String [] args) {
		
		//Array List
		String[] stuffOnDesk = {"pokemon", "phone", "cat","pizza"}; 
		List <String> list = new ArrayList <String>();
		
		//add array items StuffOnDesk to list1 
		for(String x: stuffOnDesk) 
			list.add(x); 
		
		System.out.println("The list below is from an Array List.");
	
				//Print out list 
			for (int i = 0; i<list.size(); i++) {
				System.out.printf("%s ", list.get(i));
				}
			
			System.out.println();
			
			//LinkedList using add to combine list
			String[] stuff = {"computer", "keyboard", "wow", "manga", "corn"};
			List<String> list1 = new LinkedList<String>(); 
			for(String x : stuff)
				list1.add(x); 
			
			String[] stuff2 = {"piano", "manga", "corn", "naruto"};
			List<String> list2 = new LinkedList<String>();
			for(String y : stuff2)
				list2.add(y);
			
			list1.addAll(list2);
			list2= null;
			
			System.out.println();
			System.out.println("The list below is a combined list with the use of LinkedList.");
			
			printMe(list1);
			
			System.out.println();
			
			//Queue Stack
			PriorityQueue<String> q = new PriorityQueue<String>();
			
			//Populating queue 
			q.offer("Red");
			q.offer("Pink");
			q.offer("Gold");
			
			//Viewing queue
			System.out.println("Below is the queue. This is down by using queue stacks.");
			System.out.printf("%s ", q);
			System.out.println();
			System.out.println();
			
			System.out.println("This below is the highest priority in the queue"); 
			System.out.printf( "%s ", q.peek());
			System.out.println();
			System.out.println();
			
			
			//Hash Sets
			String[] hash = {"guitar", "cambodia", "dino", "kazutora", "guitar"};
			List<String> hashl = Arrays.asList(hash);
			
			System.out.println("This is a list.");
			System.out.printf("%s ",hashl);
			System.out.println();
			
			System.out.println();
			System.out.println("This is the list with duplicates removed using hashsets");
			Set<String> set = new HashSet<String>(hashl);
			System.out.printf("%s ", set); 
			
			
			
	}
	
	//printMe method for LinkedLists
		private static void printMe(List<String> l) {
			for(String b : l)
				System.out.printf("%s ", b);  
			System.out.println();
			
		} 
}  