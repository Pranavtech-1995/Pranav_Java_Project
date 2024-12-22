package casting;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//rule -1 and rule-2 give compile time error
		//rule 3 run time error
		//EX-1
		//A b= c d
		//Rule-1  (conversions is possible or not )is there any relationship b/w  c and d
		//rule -2 (assignation check)datatype of c must same as a A or child of A
		//rul-3 (run time error check )  the underlying object of d  must be child of c or must be same 
		//String s= new String("Welcome");
		//StringBuffer sb=  (StringBuffer) s;//rule 1 fail
          //Ex-2
		//Object o= new String("Welcome");
		//String s= (StringBuffer)o;//Rule 2 fail//string buffer is not the child string or same
		//ex-3
		//Object o1= new String("Welcome");
		//StringBuffer sb1= (StringBuffer)o1;// rule 3 fail bcz there is no any relationship
		//System.out.println(sb1);
		  //ex-4
		
		Object o2= new Object();
		o2="welcome";
		String s1=  (String )o2;//rule -yes ;rule 2-yes ;rule 3-yes
		System.out.println(s1);
		
		//ex-5 
		
		Object o3 = new String("Welcome");
		String s2 = (String) o3;
		System.out.println(s2);
		
		
		
		
	}

}
