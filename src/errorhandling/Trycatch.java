package errorhandling;

import java.util.Scanner;

// error -this can be shown during compliation time
//logic -own mistake

// checked exception -this can be checked by java complier itself
//unchecked exception-that can be handlded by us due to user input
// this can be checked during run time 

//UNCHECKED EXCEPTION
public class Trycatch {


        
         
       public static void main (String[] args) 
       
       {
    	    String s2[]= {"welcome","hello"};
    	   String s="welcome";
    	   //String s1=null;
    	   Scanner sc = new Scanner(System.in) ;
			System.out.println("Enter a no ");
			  int i=sc.nextInt();
			  // we can't execute multiple block in try if first will throw error then we have correct that one first
			  // for executing each statement we have to enter it in separate  try and catch block statement 
			  try 
			  {
				  System.out.println(s2[3]);//array out of bound 
			  //System.out.println(s1.length());
			  }
			  catch (Exception e)
			  {
				  System.out.println(e.getMessage());
			  }
			  
			  
			  try 
			   {
				
			   System.out.println(100/i);
			   System.out.println(s.charAt(i)); // Safe access after check
	           //System.out.println(s1.length());//null pointer exception
			   System.out.println(s2[0]);
			   }
			 
    	   catch( ArithmeticException e)
    	   {
    		  System.out.println("you entered invalid no "); 
    		  System.out.println(e.getMessage());
    		 
    	   }
			  
		catch (StringIndexOutOfBoundsException e)
			   
			   {
			       System.out.println("You have entered wrong index ");
			       System.out.println(e.getMessage()); 
			       
			   }
			   
	      catch (NullPointerException e) 
			   {
				   System.out.println(e.getMessage());
			   }
		catch (Exception e) //THROUGH only one exception we can catch all type of error if you don't have knowledge of error type
			   
	    {
			System.out.println(" there is an error"+ " "+e.getMessage());
		
	    }
	// final always execute either catch work,catch not work,exception occurred or not occurred
        finally 
        {
        	sc.close();
        	System.out.println("Thank you for using our programm");
        }
       
       
       }




}
