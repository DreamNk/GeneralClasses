package Automation_Framework;
import java.util.regex.Pattern; 
import java.util.regex.Matcher; 

public class patternMatch2 {
	
	  public static void main(String[] args) 
	    { 
		  
		  int count = 0;
		  
		   Pattern p = Pattern.compile("ab"); 
		   Matcher m = p.matcher("abbabab");
		  while (m.find())
		   {
			   count ++;
			   System.out.print("Start ->  "+ m.start());
			   System.out.println("  End ->  "+ m.end());
			   System.out.println();
			 
			   
		   }
		  System.out.print("No of occuurances = "+ count);
		
	        
	    } 

}
