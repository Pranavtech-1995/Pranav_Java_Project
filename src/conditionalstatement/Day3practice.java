package conditionalstatement;

import java.util.Scanner;

public class Day3practice {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner p= new Scanner(System.in);
		 System.out.println("Enter no");
		int no =p.nextInt();
		 
		 if (no%2==0)
		 { System.out.println("no is even");
		 }
		 else 
		 { System.out.println("no is odd");
		 }

		 if(no>0)
		 {
			 System.out.println("no is positive");
	      }
		 else if (no<0)
			 
		 {
			 System.out.println("no is negative");
		 }
		 else 
		 {System.out.println("value of no is 0 it is neither negative nor positive");}
		 
		  System.out.println("enter daysname "); 
		 String daysname=p.next();
		 int daysno =-1;
		 String d ="invalid day";
		 switch(daysname) 
		 {
		 case "sunday" : daysno=1 ;break;
		 case "monday" : daysno=2  ;break;
		 case  "tuesday": daysno=3;break;
		 case  "wednesday": daysno=4;break;
		 case  "thrusday": daysno=5;break;
		 case  "friday":  daysno=6;break;
		 case  "saturday": daysno=7;break;
		 case "default": daysno=-1;break;
		 }
		 
		 if (daysno<=7&& daysno>=1)
		 {
			 System.out.println(daysno);
			 }
		 else 
		 {
		 System.out.println(d);
		 //System.out.println(daysno);

		 }
		 
		 
		 
		 
	}

}
