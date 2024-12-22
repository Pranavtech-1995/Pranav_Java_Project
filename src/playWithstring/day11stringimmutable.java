package playWithstring;

public class day11stringimmutable {

	public static void main(String[] args) {
		//reverse of string 
		 String s="welcome";
		  String rev="";
		  
		  for (int i=s.length()-1;i>=0;i--)
		  {
		       rev= rev+s.charAt(i);
		       
			  
			  
		  }
		  System.out.println(rev);
		  System.out.println(s);//immutable means we can change original value
		  
		  //without using string method
		  char ch[] =s.toCharArray();
		   String rever="";
		   for (int j=s.length()-1;j>=0;j--) {
			   
			   rever= rever+ch[j];
			   
		   }
		   System.out.println("without using string method"+rever);
		   
		   //using string buffer 
		   StringBuffer sb= new StringBuffer("Pranav");
		   StringBuffer sc =sb.reverse();
		   System.out.println(sc);
		   System.out.println(sb);
		    sb.append(s);
		   System.out.println(sb);//mutable means we can change the value of string
		         
		   //using StringBuilder
		   
		   
		   // using StringBuilder
		   
		   StringBuilder Su= new StringBuilder("Prakash");
		    StringBuilder sbu= Su.reverse();
		    System.out.println(sbu);
		    System.out.println(Su);//mutable
		    
			 
		  
		  
	}

}
