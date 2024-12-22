package finalandsuperkeyword;



	class X
	{
		int i=20;
		void x() 
		
		{
			System.out.println("welcome to super class");
		}
	}


 class Y extends X
 {
	 int i=30;
	 void x()// overloading done
	 {
		 System.out.println(i);
		 System.out.println( "calling parent class method and var");
		 System.out.println(super.i);// calling parent class var
		 super.x();//calling parent class method by using super keyword just above parent class
	 }
	 
	 
 }