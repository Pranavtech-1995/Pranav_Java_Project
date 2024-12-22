package JavaOperatorandExpression;

public class Day2 {

	public static void main(String[] args) {
		
		int a=20;
		int b =30;
		int result=a+b;
		
		//Airthmatic operator
		System.out.println ("Sum of a and b is"+" " +(result));
		System.out.println ( "difference of a and b is" +""+(a-b));
		System.out.println( "multiplication of a&b is" +" "+(a*b));
		System.out.println ( "quotient of a and b is" +" "+(a/b));
		System.out.println ( "reminder of an d b is "+" "+(a%b));
		
		//Relation operator//comparison operator 
		
		 if (a==b) {
			 System.out.println ("both are equal");
		 }
		 else 
		 {
			 System.out.println ("both are not equal");
		 }
		 System.out.println(a==b);
		 System.out.println(a>b);
		 System.out.println(a<b);
		 System.out.println(a>=b);
		 System.out.println(a<=b);
		 System.out.println(a!=b);
		 a=50;// DEClaring same varible and change it without using data type 
		 
		 System.out.println(a>b);
		 System.out.println ("Sum of a and b is"+" " +(a*b));
		 
		  boolean results =a>b;
		  System.out.println(results);
		  //Logical Operator 
		  b=50;
		  System.out.println(a==b && a!=b);//false
		  System.out.println(a==b || a!=b);//true 
		  System.out.println(!(a==b));
		  
		  
		  //Increment and decrement operator//only for single value 
		    
		  int  count =0;
		   count =count+1;//1
		   count+=1;//2
		    int Incr= count++;//2//post// only assign will happen here 
		    int Preincr=++count;//pre
		    System.out.println(Incr);//2//post increment
		    System.out.println(Preincr);//4
		  System.out.println(count);//4
		  count++;//post increment
		  ++count;// pre increment
		  System.out.println(count);//6
		  count--;//post increment
		  --count;//pre increment 
		  System.out.println(count);//4
		  
		  //Assignment Operator // greater than one 
		   int Assign=30;
		   //Assign+=3;//6
		   //Assign%=4;//2
		   //Assign-=3;//0
		   Assign/=2;//15
		   
		   
		  System.out.println(Assign);
		  
		  //Ternary OPERATOR//data type  var =comparison ? true:false// 3 variable req if condition true then it will return true and if false then it will result false
		  a=40;
		  b=90;
		  int res=a>b?a:b;// a=40 if true then a value 40 and if false  b value=90
		  System.out.println(res);
		  int ter =a<b?a:b;
		  System.out.println(ter);// print a=40
		   int  age =10;
		 String vote =age>18?"eligible":"not eligible" ;
		 System.out.println(vote);
		  
		 //Swapping no 
		 int x=10;
		 int y=20;
		 int z ;//declare
		 z=x;//pour
		 x=y;// put blank item and exchange the value 
		 System.out.println(x);
		 System.out.println(z);
		  
		  
		 
		 
		
		

	}

}
