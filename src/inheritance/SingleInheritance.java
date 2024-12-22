package inheritance;


	// single level inheritance
	class X {
		
		int i;
		void  dogsound () {
			
			i=10;
			System.out.println("Dog barks ");
		}
		
		 
	   }
	class Y extends X{
		
		int j;
		
		void  catsound ()
		{ 
			j=30;
			System.out.println("cat is mew mew");
		}
		
		void dogsound()
		{
			System.out.println("Dog is barking//overridingconcept change the value of parent class");
		}
		void sum()
		{
			System.out.println(i+j);
		}
		
		
	}
	public class SingleInheritance {

	
	
	public static void main(String[] args) {
		// we can access both element
		Y b=  new Y(); // through child we can access and override it
		b.dogsound();
		b.catsound();
		b.i=10;//initating value //if we class parent dogsounds then no need
		System.out.println(b.i);//for initiating i value we need to initate dogsound class
		System.out.println(b.j);
		b.sum();
		
		//only we can access parent element
		X a=new X();
		a.dogsound();
		System.out.println(a.i);
		
		
		
		

	}

}
