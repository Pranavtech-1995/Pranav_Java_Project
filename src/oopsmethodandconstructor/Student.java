package oopsmethodandconstructor;

public class Student {

	int id;
	int name;
	

	//No param No return
	
	void npnr ()
	{
		System.out.println("no param and no return");
	}
	//No param give return
		
	String np()
		
	{
		return ("No param but return type is available");
	}
	//take param  no return
	void tp( String sno,String sname) 
	{
		System.out.println(sno);
		System.out.println(sname);
		
	}
	//Take param give return
	String tptr(String s) 
	{
		return s;
	}
	

}
