package polymorphism;

public class Polymorphism {
	
	 int a;
	 int b;
	 double d;
	
	//method overloading +constructor overloading
	void sum() 
	{
	 System.out.println(a+b+d);
	System.out.println("thank you for sum of all data through polymorphism");
	}
	
	void sum (int a,int b) 
	
	{
		 int result= a+b;
		System.out.println(result);
		
	}
	
	void sum (int a, int b ,int c )//overloading by increasing parameter
	{
		int result=a+b+c;
		System.out.println(result);
		
	}
	
	void sum (int a ,double b) // overloading by changing data type
	{
		double result =a+b;
		System.out.println(result);
		
	}
	
	void sum (double  b,int a)// overloading by changing postion of  parameter by it should be diff
	
	
	{
		double result =a+b;
		System.out.println(result);}
		
		Polymorphism ()//overloading of constructor 
		{
			a=90;
			b=100;
		}
		
		Polymorphism(int i ,double j)// increasing parameter
		{
			a=i;
			d=j;
		}
		Polymorphism(double i,int j )
		{
			d=i;
			a=j;
		}
		
		
	}


