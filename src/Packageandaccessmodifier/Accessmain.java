package Packageandaccessmodifier;

public class Accessmain {

	public static void main(String[] args) {
		
		Access A= new Access();
		
		//A.m();//can be accessed bcz this is private 
		A.m1();// default method within package 
		int c=A.b=30;//default var within package
		A.k=30;//this is protected  var
	    A.m2();// this is protected method 
		System.out.println(c);// default var
		System.out.println(A.k);//protect var 
		A.z=40;// public
		System.out.println(A.z);//public
		A.m3();//public

	}

}
