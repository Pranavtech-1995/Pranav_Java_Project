package encapsulation;

public class Overloadingmainmethod {

	
	void main()
	{
		System.out.println("hello");
	}
	void main (String s)
	{
	 System.out.println(s);
	}
	
	void main (int i)
	{
		System.out.println(i);
	}
	
	void main(String s1, String s2)
	{
		System.out.println(s1+" "+s2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overloadingmainmethod o= new  Overloadingmainmethod();
		o.main();
		o.main(404);
		o.main("Rahul");
		o.main("welcome","Rahul");

	}

}
