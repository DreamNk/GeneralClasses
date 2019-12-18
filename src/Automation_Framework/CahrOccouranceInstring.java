package Automation_Framework;
import java.io.*; 
import java.util.*; 
import java.util.Map.Entry;

public class CahrOccouranceInstring {
	
	public static void main(String[] args) 
    { 
        String str = "Nnandakishor"; 
        characterCount(str); 
    } 	
	 static void characterCount(String inputString) 
	    { 	              
	        HashMap<Character, Integer> charCountMap 
	            = new HashMap<Character, Integer>();   
	        char[] strArray = inputString.toCharArray(); // Creating a HashMap containing char  as a key and occurrences as  a value 	  
	  	     
	        for (char c : strArray) {     // checking each char of strArray 
	            if (charCountMap.containsKey(c)) { 
	  
	                charCountMap.put(c, charCountMap.get(c) + 1);    // If char is present in charCountMap, incrementing it's count by 1 
	            } 
	              else { 
	  
	                charCountMap.put(c, 1);        // If char is not present in charCountMap, putting this char to charCountMap with 1 as it's value 
	            } 
	        
	        } 
	        System.out.println(inputString+" : "+charCountMap);
	  
	        for (Map.Entry entry : charCountMap.entrySet()) {                 // Printing the charCountMap 
	            System.out.println(entry.getKey() + " " + entry.getValue()); 
	        } 
	        
	        Set<Entry<Character, Integer>> entrySet = charCountMap.entrySet();         
	        int maxCount = 0;
	        char maxChar = 0;
	         
	        for (Entry<Character, Integer> entry : entrySet) 
	        {
	            if (entry.getValue() > maxCount)
	            {
	                maxCount = entry.getValue();	                 
	                maxChar = entry.getKey();
	            }
	        }	        
	        System.out.println("Input String : "+inputString);	         
	        System.out.println("Maximum Occurring char and its count :");	         
	        System.out.println(maxChar+" : "+maxCount);
	    } 
	

}
