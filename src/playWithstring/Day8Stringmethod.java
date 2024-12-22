package playWithstring;

import java.util.Arrays;

public class Day8Stringmethod {

	public static void main(String[] args) {
		
		String s="welcome";
		String s1=new String("welcome");
	
		
		boolean b=s.equalsIgnoreCase(s1);//matching value 
		System.out.println(b);
		 if(s==s1)
		 {
			 System.out.println("equal");
		 }
		 else
		 {
			 System.out.println("Not equal due to referencr var matching");
		 }
		//searching data 
		 int  d[]=  {10,20,30,100,500,30,50,30,30};
		 
		 boolean status=false;
		   for (int i = 0;i<=d.length-1;i++)
		   { 
			   if (d[i]==30)
			   {
			   System.out.println("data found");
			  System.out.println(d[i]);
			  status=true;
			  break;
			  }
		   }
			  /* else 
			   {
				   System.out.println("data not found");
			   }*/ //printing same same value mutiple time
			   
			  if(status==false) 
			  { 
				  System.out.println("data not found");
			  }
			  
			  //Find repetition of element 
			  
			  int count=1;
			  
			  for(int j=0;j<d.length-1;j++) {
				  
				  if (d[j]==30) 
				  {
					 count++; 
				  }
			  }
			  System.out.println("repeated search value is"+" "+count);
			  
	         //sorting of element 
			  
			  System.out.println("before sorting");
			  System.out.println(Arrays.toString(d));
			  
			  Arrays.sort(d);
			  
			  
			  System.out.println("after sorting");
			  System.out.println(Arrays.toString(d));
			  
			  //reverse an element
			  System.out.print("revers orderof element is:"+" ");
			  for (int k=d.length-1;k>=0;k--)
			  { 
				  
				  System.out.print(d[k]+" ");
				  
			  }
			  
			  
			  
	
	
	}
			  
		   }
		 
		 
		 
		 

	


