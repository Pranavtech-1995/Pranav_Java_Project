package oopsconceptclassandobject;

public class Day11class {

	int eid;
	String e_name;
	String e_desg;
	char rating;
	
	
	void emp_data() 
	{
		
		System.out.println(eid);
		System.out.println(e_name);
		System.out.println(e_desg);
		System.out.println(rating);
	 }
	
	public static void main(String[] args) {
		
	Day11class d=new Day11class();
	d.eid=60;
	d.e_name="pranav";
	d.e_desg="QA";
	d.rating='A';
	System.out.println("data of 1st emp is");
	d.emp_data();
	Day11class d1=new Day11class();// two different object means two diff memory no matter ? is data
	d1.eid=63;
	d1.e_name="pranav";
	d1.e_desg="QA";
	System.out.print("data of 2nd emp is");
	d1.emp_data();
	d.rating='B';// changing var and reassignation
	d.e_desg="dev";//changing var and reassignation
	System.out.println("data of updated 1st emp is");
	d.emp_data();
			
		

	}

}
