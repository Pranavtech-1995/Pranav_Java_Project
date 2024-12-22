package Packageandaccessmodifierother;

import Packageandaccessmodifier.Access;

public class X2 {


	
	
public static void main(String[] args) {
		
		
		//X2 x= new X2();
		Access A= new Access();
		//x.k=40;//protected method 
		//System.out.println(x.k);//protected method
		//x.m2();//protected method 
		A.z=100;//public
		System.out.println(A.z);//public
		A.m3();//public
		//x.m1();//can't access bcz this is default method 
		//x.m();//can't be access bcz this is private method 
	}

}
