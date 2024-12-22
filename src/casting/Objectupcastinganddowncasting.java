package casting;

class Parent{
	  
	int i;
	void m()
	
	{
		System.out.println("Parent class");
	}
	
	
}
class Child extends Parent {
	  
	int j;
	void m1()
	
	{
		System.out.println("Child class");
	}
	
	
}




public class Objectupcastinganddowncasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//no casting
		Child c= new Child();
		int a=c.i=20;
		int b=c.j=30;
		System.out.println(a);
		System.out.println(b);
		c.m();
		c.m1();
		
		//upcasting
		
		Parent p= new Child ();//upcasting
		p.i=50;
		System.out.println( "new "+p.i);
		p.m();
		//p.m1();//we can't access bcz var is of parent class
		//p.j=30; //we can't call bcz var is of parent class
		
		//downcasting//complile time no error //run time error
		//Child h= (Child) new Parent ();//Parent cannot be cast to class casting.Child
		//h.i=30;
		//h.j=50;
		//System.out.println(h.i*h.j);
		//h.m();
		//h.m1();
		
		Parent p1 =(Child)new Parent();//Rule1 yes //rule 2 yes //rule -3 fail;
		p1.m();
}}
