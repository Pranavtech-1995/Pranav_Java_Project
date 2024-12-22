package Packageandaccessmodifierother;

import Packageandaccessmodifier.Access;

public class X extends Access{


	
	
public static void main(String[] args) {
		
		
		X x= new X();
		x.k=40;//protected method 
		System.out.println(x.k);//protected method
		x.m2();//protected method 
		x.z=100;//public
		System.out.println(x.z);//public
		x.m3();//public
		//x.m1();//can't access bcz this is default method 
		//x.m();//can't be access bcz this is private method 
	}

}
