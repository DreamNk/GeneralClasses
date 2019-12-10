package Automation_Framework;
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 
  

public class EmailValidationPatternMatching {
	
	    public static boolean isValid(String email) 
	    { 
	 /*      String emailRegex = "[a-zA-Z0-9_+&*-]+(?:\\."+ 
	                            "[a-zA-Z0-9_+&*-]+)*@" + 
	                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
	                            "A-Z]{2,7}$"; */
	    	
	    //	String emailRegex = "[a-zA-Z0-9][a-zA-Z0-9_]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
	    	String emailRegex = "[a-zA-Z0-9][a-zA-Z0-9_]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
	                	        	                              
	        Pattern pat = Pattern.compile(emailRegex); 
	        if (email == null) 
	            return false; 
	        return pat.matcher(email).matches(); 
	    } 
	    
	    public static boolean isValidPhone(String email) 
	    { 
	        String emailRegex = "[7-9][0-9]{9}"; 
	        	                              
	        Pattern pat = Pattern.compile(emailRegex); 
	        if (email == null) 
	            return false; 
	        return pat.matcher(email).matches(); 
	    } 
	  	
	    public static void main(String[] args) 
	    { 
	        String email = "Contributegeeks@2forgeeks.org"; 
	        if (isValid(email)) 
	            System.out.println("Yes"); 
	        else
	            System.out.println("No"); 
	        
	        	        
	        String Phone = "8999999999"; 
	        if (isValidPhone(Phone)) 
	            System.out.print("Yes"); 
	        else
	            System.out.print("No"); 
	    } 

}
