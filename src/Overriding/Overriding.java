package Overriding;


class A{
	
	void m ()
	{
		
		System.out.println("Welcome to the overriding concept");
	}
	
	int m1(int a) 
	{
		return a;
	}
}

class B extends A{
	
	void m() //using same name method but the body has been changed 
	{
		System.out.println("overloaded it by changing body");
	}
	 String m1(String s) 
	 
	 {
		 System.out.println("overloading concept");
		 return s;
	 }
	 
}
public class Overriding {

	public static void main(String[] args) {
		
     B b= new B();
     b.m();
     b.m1(20);
     String save=b.m1("Overloaded");
     System.out.println(save);
	
	}

}
