package oopsmethodandconstructor;

public class Constructors {
	int x;
	int y;
	// constructor don't have return type not even as void 
	//name should be same as class name 
	//  this method is used only for  assiging the value 
	//while declaring the object refernce we can assign the Parameter 
	Constructors ()// default constructor// No parameter 
	
	{
		x=20;
		 y=30;
	}
	
	Constructors(int i,int j )// Parameterized constructor// 
	
	{
		x=i;
		y=j;
	}
	
	 void sum ()
	 {
		 
		  int result= x+y;
		 System.out.println(result);
	 }

	public static void main(String[] args) {
		
		Constructors c= new Constructors();// default constructor
		c.sum();
	    
		//Constructors c= new Constructors(10,20);//for parameterized constructor
		//c.sum();
		
	}

}
