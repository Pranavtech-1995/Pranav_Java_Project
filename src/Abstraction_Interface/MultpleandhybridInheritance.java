package Abstraction_Interface;

//One child two parent it can be done only through interface 
//due to ambiquity issue bcz if two method having same name due to inbuild class in java 
 // every class  have method of object class  inherieted  bcz obj is super class for every
interface Shape{
	  
	 void square() ;
	 void rectangle();
	 void cube();
	 
	 }
  
  interface Area extends Shape
  
  {
	  int l=50;
	   int b=60;
	  int h=100;
	  
	 void squarearea();
	void rectanglearea();
	 void cubearea();
	
	 
 
  }
//One grandchild take overall properties having mother(I) and father(I) properties as well as granfather (parent class)
public class MultpleandhybridInheritance  extends C2 implements Shape ,Area {

	@Override
	public void square() {
		// TODO Auto-generated method stub
		System.out.println("Area of square is");
	}


	@Override
	public void squarearea() {
		// TODO Auto-generated method stub
		 int a=(l*b);
		 System.out.println(a);
	}

	@Override
	public void rectangle() {
		System.out.println("Area of square is");
		
				
		
	}
	@Override
	public void rectanglearea() {
		// TODO Auto-generated method stub
		int b=(l*l);
		System.out.println(b);
	}
	@Override
	public void cube() {
		// TODO Auto-generated method stub
		System.out.println("Area of cube is");
	}
	
	@Override
	public void cubearea() {
		// TODO Auto-generated method stub
		int c=(l*b*h);
		System.out.println(c);
	}

	void cuboid() 
	
	{
		System.out.println("wlcome to the hybrid model inheritance");
		//One grandchild take overall properties having mother(I) and father(I) properties as well as granfather (parent class) 
		super.cuboid();
		System.out.println(l*b*+b*h+h*l);
	
	
	}
	
	


	
	public static void main(String[] args) 
	{
		
		 MultpleandhybridInheritance M= new  MultpleandhybridInheritance();
		 M.square();
		 M.squarearea();
		 M.rectangle();
		 M.rectanglearea();
		 M.cube();
		 M.cubearea();
		 M.cuboid();

	}}