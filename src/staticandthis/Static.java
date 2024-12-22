package staticandthis;

public class Static {

	static int i;
	static int j;
	
	
	static void sum()
	{
		
		System.out.println(i+j);
	}
	
	static void diff()
	{
		
		System.out.println(i-j);
	}
	
	 void mul()
	{
		System.out.println(i*j);
	}
	
	 //static  and non static method through non static directly call 
	 void all()
	 
	 { 
		     //i=100;// we can modify the value but can't declare in static method
		     // j=50;
			 sum();
			 diff();
			 mul();
			 
				
			
			 
	}
	public static void main(String[] args) {

		//Static method and var through static method 
		i=40;//calling statics VAR
		j=10;
		//sum();//call static method
		//diff();
		
		//non static method through static method 
		Static s=new Static();
		//s.mul();//  for non statics we need ref var
		s.all();

		

	}

}
