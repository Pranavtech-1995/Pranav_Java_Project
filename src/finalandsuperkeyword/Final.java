package finalandsuperkeyword;

//final class
 final class A{
	
	final int i=100;//final var
	 
	 final void m()//final method
	{
		
		System.out.println("we can extend this class to any other class ");
	}
}

/*class B extends A// can't extend class if class is final 
{
	void m() // 
	{
		//System.out.println("can't overload if method is final");
	}
}*/

public class Final {

	public static void main(String[] args) {
		//B a= new B();
		A a = new A();
		//a.i=50;// we can't assign or modified final var bcz it is final 
		System.out.println(a.i);//bcz b class is not vailable 
		a.m();
		

	}

}
