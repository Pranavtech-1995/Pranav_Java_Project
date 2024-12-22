package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset {

	public static void main(String[] args) {

		
		
		
		//HashSet<Object> h = new HashSet<Object>();
		Set<Object> h =new HashSet<Object>();	
		h.add(100);
		h.add(200);
		h.add("Google");
		h.add("Hcl");
		h.add(100);//duplicate is not allowed
		h.add(null);//only one null is allowed 
		
		//size of an element
		 System.out.println("size of an element "+h.size());
		 // Printing of an element 
		 System.out.println("Printing of an element "+ h);
		 //removing an element
		h.remove(100);
		h.remove("Hcl");
		System.out.println("After removing element"+h);
		//accessing is not possible bcz there is no sequence
		//Inserting is not possible
		//getting can be possible by doping of hasmap array into arraylist 
		// bcz in this seq is not possible 
		ArrayList<Object> a1= new ArrayList<Object>(h);
		System.out.println("conversion of hashmap into arraylist then we can access "+a1);
		a1.get(2);
		System.out.println(a1.get(2));
		System.out.println(a1.get(0));
		
		// can't extract element through for loop bcz seq is not possible 
		System.out.println("Printing of an element through enhanced for loop");
		 for ( Object x:h)
		 {
			 System.out.print(x+" ");
		 }
		 System.out.println();
		 System.out.println("Through Iterator");
		 
		 Iterator <Object>it =h.iterator();
		 
		 while(it.hasNext())
		 {
			 System.out.print(it.next()+" ");
		 }
		 
		 h.clear();
		 System.out.println();
		 System.out.println("After Clearing"+" "+h);

	}

}
