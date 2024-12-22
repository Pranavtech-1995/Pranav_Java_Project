package inheritance;



class A{
	int i;
	
	void m1() {
	
		i=10;
		System.out.println("Hello");
	}
	static void m2()
	{
	System.out.println("HOW");
}}
	
	class B extends A{
		int j;
		
     void   m3() 
    {	
	    j=40;
	System.out.println("Are ");
    }
	
	}
	class C extends B{
		int k;
			
	void m4() {
	
		k=30;
		System.out.println("You");
	}
	}
	
	class D extends C{
		
		int l;
		
		static void m5()
		{ 
			System.out.println("Pranav");
		}
		void sum() {
			l=20;
			System.out.println(i+j+k+l);
		}
	}
	


public class Multilevel {

	public static void main(String[] args) {
		
		D d=new D();
		d.m1();
		A.m2();//static method
		d.m3();
		d.m4();
		D.m5();//child class Static Method
		d.sum();
		
		

	}

}
