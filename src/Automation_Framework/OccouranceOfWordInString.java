package Automation_Framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class OccouranceOfWordInString {
	
	public static void main(String[] args) 
    { 
        String str = "This is testing Program testing Program"; 
        wordCount(str); 
    } 	
	 static void wordCount(String inputString) 
	    { 
	              
	        HashMap<String, Integer> charCountMap 
	            = new HashMap<String, Integer>();  
	        
	        String[] strArray = inputString.split(" "); // Creating a HashMap containing char  as a key and occurrences as  a value 	  
	  	     
	        for (String c : strArray) {     // checking each char of strArray 
	            if (charCountMap.containsKey(c)) { 
	  
	                charCountMap.put(c, charCountMap.get(c) + 1);    // If char is present in charCountMap, incrementing it's count by 1 
	            } 
	              else { 
	  
	                charCountMap.put(c, 1);        // If char is not present in charCountMap, putting this char to charCountMap with 1 as it's value 
	            } 
	        } 
	  
	        for (Map.Entry entry : charCountMap.entrySet()) {                 // Printing the charCountMap 
	            System.out.println(entry.getKey() + " " + entry.getValue()); 
	        } 
	        
	        Set<Entry<String, Integer>> entrySet = charCountMap.entrySet();         
	        int maxCount = 0;
	        String maxChar = null;
	         
	        for (Entry<String, Integer> entry : entrySet) 
	        {
	            if (entry.getValue() > maxCount)
	            {
	                maxCount = entry.getValue();	                 
	                maxChar = entry.getKey();
	            }
	        }	        
	        System.out.println("Input String : "+inputString);
	         
	        System.out.println("Maximum Occurring String and its count :");
	         
	        System.out.println(maxChar+" : "+maxCount);
	    } 
	


}
