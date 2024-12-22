package Abstraction_Interface;

public class Interfaceimplementclass implements Interface{
	@Override
	public void roi() {
		
		int roi =8;
		System.out.println("interest rate of bank is"+roi);
		
	}

	@Override
	public void ifsccode() {
	String Ifsccode="SBIN003602";
	System.out.println("your ifsc code is "+Ifsccode);
		
	}
	@Override
	public void bal() {
		
		int bal= 25000;
		System.out.println("your balance is "+bal);
	}
		
	void thankmessage()
	{
		System.out.println("Thnak you for using our bank service");
	}
		
	
	public static void main(String[] args) {
		

		
	Interfaceimplementclass I= new Interfaceimplementclass();
	// using var of implementation class during object creation
	
	System.out.println(Interface.i);
	System.out.println(Interface.j);
	System.out.println( "A/C to our policy annual charge is"+Interface.annualcharge);
	String name =I.b_name("Pranav");
	int i= Interface.acc_no(798250);
	System.out.println(name);
	System.out.println(i);
	I.roi();
	I.ifsccode();
	I.bal();
	I.thankmessage();
	
	//Approach 2
	           Interface F =new Interfaceimplementclass();
	System.out.println(" //	F.thankmessage();// this is not the method of parent class \r\n"
			+ "	// as we have stored child class var in interface class var \r\n"
			+ "	}");
	           System.out.println(Interface.i);
	       	System.out.println(Interface.j);
	       	System.out.println( "A/C to our policy annual charge is"+Interface.annualcharge);
	       	String names =I.b_name("Pranav");
	       	int j= Interface.acc_no(798250);
	       	System.out.println(names);
	       	System.out.println(j);
	       	F.roi();
	       	F.ifsccode();
	       	F.bal();
	       //	F.thankmessage();// this is not the method of parent class 
	// as we have stored child class var in interface class var 
	}

	

	

}
