package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Arraylist {

	public static void main(String[] args) {
		
		
		//Declaration
		
		ArrayList<Object> a= new ArrayList<Object>();
		//List<Object> a= new ArrayList<Object>();
		a.add(100);
		a.add(100);
		a.add(100);
	    //a.addFirst(100);
		//a.addLast(900);
		a.add(200);
		a.add("Pranav");
		a.add(null);
		a.add(null);
		a.add(200);
		a.add(4, "second last");
		
		
		System.out.println(a.size());//9
		System.out.println("printing data of an element"+a);
		//getting last index of an element
		System.out.println("getting last index of an element "+a.lastIndexOf(200));
		//removing an  int element at index level
		a.remove(2);
		// for removing an integer from ArrayList we have to change string value to integer 
		a.remove(Integer.valueOf(100));//When you call a.remove(100), it tries to remove the element at index 100. To remove an object by value, you should call a.remove(Integer.valueOf(100)).
		System.out.println("After removing element "+a);
		//removing an element
	    a.remove("Pranav");
		System.out.println("After removing string element"+a);
		//removing an element
		//a.removeFirst();
		System.out.println("After removing first element"+a);
		//removing an element
		//a.removeLast();
		//removing an element
		System.out.println("After removing last element"+a);
		
		//getting an element //Access specific of an element 
		 System.out.println( "Getting element of 2nd index "+a.get(2));
		//System.out.println("Getting element of 1st index "+a.getFirst());
		// System.out.println("Getting element of last index "+a.getLast());
		 //inserting an elemement 
		 a.add(3,"Prabhat");
		 System.out.println("Modifiying of an elememt "+a);
		 //modifying an element
		 a.set(3, "Naresh");
		 System.out.println( " After modifying an element "+a);
		 //Reading of an element using for loop
		 
		 for(int i=0; i<=a.size()-1;i++)
		 {
			 
			 System.out.print(a.get(i)+" ");
			
		 }
		 System.out.println();
		 
		 for (Object arr:a) 
			 
		 {
			 System.out.print(arr+" ");
		 }
		 
		 System.out.println();
		 
		    Iterator <Object> it=a.iterator();
		        
		 
		  while (it.hasNext())
		  {
			  System.out.print(it.next()+" ");
		  }
		 System.out.println();
		 
		 //is empty 
		   boolean bo=a.isEmpty();
		  System.out.println(bo);
		  
		  //Removing all the element from an array
		  
		  ArrayList<Object> a1= new ArrayList<Object>();
		  
		  a1.add("second last");
		  a1.add("Naresh");
		  a1.add(null);
		  a1.add(100);//removing all duplicate element if exist
		  a.removeAll(a1);
		  System.out.println("After Removing  of two  dupliacte  & two single existance elememt " +a);
		 // a.clone();
		  System.out.println("clone data "+a);
		  a.clear();
		  System.out.println(a);
		
		

	}

}
