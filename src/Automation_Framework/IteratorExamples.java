package Automation_Framework;

import java.io.*;
import java.util.*;

class IteratorExamples {
	public static void main(String[] args) {
		
		
		List<String> arrlist = new ArrayList<String>(); 
		  
        // Adding elemnet to srclst 
        arrlist.add("Ram"); 
        arrlist.add("Gopal"); 
        arrlist.add("Verma"); 

        // Print the list 
        System.out.println("List: " + arrlist); 

        // creating object of type Enumeration<String> 
        Enumeration<String> e = Collections.enumeration(arrlist); 

        // Print the Enumeration 
        System.out.println("\nEnumeration over list: "); 

        // print the enumeration 
        while (e.hasMoreElements()) 
            System.out.println("Value is: " + e.nextElement());
  

    
    /* ***************************************************************** */

		ArrayList<String> list = new ArrayList<String>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		// Iterator to traverse the list
		Iterator iterator = list.iterator();

		System.out.println("List elements : ");

		while (iterator.hasNext())

			System.out.print(iterator.next() + " ");
		System.out.println();

		/* ***************************************************************** */

		ArrayList<String> list1 = new ArrayList<String>();

		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("E");

		// ListIterator to traverse the list
		ListIterator iterator1 = list1.listIterator();

		// Traversing the list in forward direction
		System.out.println("Displaying list elements in forward direction : ");

		while (iterator1.hasNext())
			System.out.print(iterator1.next() + " ");

		System.out.println();

		// Traversing the list in backward direction
		System.out.println("Displaying list elements in backward direction : ");

		while (iterator1.hasPrevious())
			System.out.print(iterator1.previous() + " ");

		System.out.println();
		
		/* ***************************************************************** */
	}
}