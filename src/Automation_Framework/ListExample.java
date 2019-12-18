package Automation_Framework;

import java.util.*; 

public class ListExample { 
    public static void main(String[] args) 
    { 
    	//Insertation ored is preserved
    	//Dubliactes are allowed
    	
        // Creating a list 
        List<Integer> l1 = new ArrayList<Integer>(); 
        l1.add(0, 1); // adds 1 at 0 index 
        l1.add(1, 2); // adds 2 at 1 index 
        System.out.println(l1); // [1, 2] 
  
        // Creating another list 
        List<Integer> l2 = new ArrayList<Integer>(); 
        l2.add(1); 
        l2.add(2); 
        l2.add(3); 
  
        // Will add list l2 from 1 index 
        l1.addAll(1, l2); 
        System.out.println(l1); 
  
        // Removes element from index 1 
        l1.remove(1); 
        System.out.println(l1); // [1, 2, 3, 2] 
  
        // Prints element at index 3 
        System.out.println(l1.get(3)); 
  
        // Replace 0th element with 5 
        l1.set(0, 5); 
        System.out.println(l1); 
        
        // List provides methods to search element and returns its numeric position. Following two methods are supported by List for this operation:-
        
        List<String> l = new ArrayList<String>(5); 
        l.add("Geeks"); 
        l.add("for"); 
        l.add("Geeks"); 
  
        // Using indexOf() and lastIndexOf() 
        System.out.println("first index of Geeks:"
                           + l.indexOf("Geeks")); 
        System.out.println("last index of Geeks:"
                           + l.lastIndexOf("Geeks")); 
        System.out.println("Index of element"
                           + " not present : "
                           + l.indexOf("Hello"));
    } 
} 
