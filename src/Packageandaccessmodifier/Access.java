package Packageandaccessmodifier;

public class Access {

	//private - it can be accessed only within the class
	//Default - it can be accessed  within the package 
	//protected -it can be accessed  within the  package and in subclass of outside the package
	//public - it can be accesed throughout the project 
public int z;

 public void m3()
{
	System.out.println("it can be accessed all throughout the project");
}
protected int k;
	
	
	protected void m2()
	{
		
		System.out.println("it can be accessed  within the  package and in subclass of outside the package ");
	}
         int b;
private int  i;

 private void m() 
 
 {
	 
	 System.out.println("this is private method it can be accessed only within the class");
 }
 
  void m1()
 {
	 System.out.println("this is default method it can be accessed throughout the package ");
 }
 
 public static void main (String[] args)
 {
	 
	 Access A= new Access();
	 A.i=50;//modified private class var// declare
	 System.out.println(A.i);
	 A.m();//private
	 A.m1();//default
	 A.m2();//protected
	 A.m3();// public
	 
 }


}
