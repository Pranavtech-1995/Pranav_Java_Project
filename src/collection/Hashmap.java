package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {


		//HashMap<Integer,String> h= new HashMap<Integer,String>();
		                        
		Map<Integer,String> h=new HashMap<Integer,String>();
		h.put(1, "Ambuj");
		h.put(2, "Shikha");
		h.put(3, "Himanshu");
		h.put(4, "Ananad");
		h.put(5, "Neelesh");
		h.put(6, "Ambuj");
		h.put(6, "Aman");//if we put duplicate then it will act as replacement with latest one which you have added
		
		//finding whole key
		h.keySet();//for key
		System.out.println(h.keySet());
		//finding whole value
		h.values();//for value
		System.out.println(h.values());
		//finding  both value and key
		h.entrySet();//for both value and key
       System.out.println(h.entrySet());
       // after removing
       h.remove(2);//a/c to key 
       System.out.println("After removing "+h);
       h.remove(6, "Ambuj");
       System.out.println("After removing through key & value pair"+h);
      //Replacement 
       h.replace(1, "Gurpreet");
       System.out.println("After replacing through index and value"+h);
       h.replace(3, "Himanshu", "Pranav");
       System.out.println("After replacing through index ,oldvalue ,new value" +h);
	//getting value a/c to key
       System.out.println(h.get(4));
       System.out.println(h.get(3));
       //getting key a/c to value
       System.out.println(h.values());
       //size
       h.put(2, "Ishi");
       System.out.println(h);
       System.out.println(h.size());
       
      // finding all data using for loop
       //if value doesn't then it will answer it as 0
       
       for (int i = 1;i<=h.size(); i++) 
       {
    	   System.out.print(h.get(i)+ " ");
       }
       System.out.println();
       
       for (  int k:h.keySet()) 
       
       {
    	   System.out.println(k+":"+h.get(k)+" " );
       }
       System.out.println();
	 
       Iterator<Entry <Integer,String>> it =h.entrySet().iterator();
       
        while (it.hasNext()) 
        {
        	 Entry<Integer, String> entry =it.next();
        	System.out.println(entry.getKey()+"   "+entry.getValue());
        }
	
        
        h.clear();
        System.out.println(h);
	}

}
