package conditionalstatement;

import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		
		int age;
		int days;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		age =sc.nextInt();
		// conditional stattement if // if else //if else if else if else else // switch case 
		if (age>18 && age<60)
		{ 
		System.out.println(" Eligible for vote ");	
		}
		else if (age>60) {
			System.out.println("Eligible Senior citizen");
		}
		else 
		{ 
			System.out.println("Not Eligible");
		}
		System.out.println("enter your dayno" );
		days=sc.nextInt();
		
		String daysname;
		
		//SWITCH CASE STAEMENT
		switch(days)
		{ 
		case 1: daysname="monday";break;
		case 2: daysname ="tuesday"; break;
		case 3: daysname ="wednesday"; break;
		case 4 : daysname= "thurssday"; break;
		case 5: daysname = "friday"; break;
		case 6: daysname = "saturday"; break;
		case 7: daysname ="sunday"; break;
		default: daysname ="invalid";
		}
       System.out.println( "day is" +daysname);
       
       System.out.println("enter firstno");
       int no1=sc.nextInt();
       System.out.println("enter secondno");
       int no2=sc.nextInt();
       System.out.println("enter thirdno");
       int no3=sc.nextInt();
       // if else if else 
       if (no1>no2 && no1>no3) {
    	   
    	   System.out.println("first no is highest ");
    	   
       }
       else if (no2>no1 && no2>no3) {
    	   System.out.println("second no is hightest");
       }
       else if(no3>no1 && no3>no2){ 
    	   System.out.println("third is highest");}
       else 
       { 
    	   System.out.println("All are equal");
       }
       // nested loop condition under condition
       if (age==18 ) {
    	   
    	   if (days==2) {
    		   System.out.println("you have completed age of vote on tuesday");}
    		   else  
    		   {
    			   System.out.println("you are not eligible");
    		   }}
    else 
    		   
   { System.out.println("you have crossed 18");
     }
  
	}
	
	}
