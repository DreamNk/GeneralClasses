package Automation_Framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Matrix {

	public static void main(String[] args) {
		int rows =3;
		int columns =3;
		
		HashMap<Integer, Integer> Rowsum 
        = new HashMap<Integer, Integer>();   
		
		int[][] firstMatrix = { {2, 3, 9},
				                {5, 2, 9},
				                {5, 3, 9}	                		                 
				              };
  
       
             for(int i = 0; i < rows; i++) {
        	
        	  int sum=0;
        	  
            for (int j = 0; j < columns; j++)
            {
         System.out.print("  "+firstMatrix[i][j]); 
               
    	 sum = sum + firstMatrix[i][j];
         
         for (int [] row  : firstMatrix)

         {
        	 Rowsum.put(i,sum);
         }
            }
            System.out.println();
        }
        
        System.out.println();
        
        for (Map.Entry entry : Rowsum.entrySet()) {                 // Printing the charCountMap 
         System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
        
        Set<Entry<Integer, Integer>> entrySet = Rowsum.entrySet();         
        int maxrow = 0;
        int maxsum = 0;
         
        for (Entry<Integer, Integer> entry : entrySet) 
        {
            if (entry.getValue() > maxsum)
            {
            	maxsum= entry.getValue();	                 
                maxrow  = entry.getKey();
            }

        }	        
        System.out.println();
        System.out.println(maxrow + " " + maxsum); 
        
       

	}

}
