package staticandthis;

public class Staticacrossclass {

	
	
	static int i;
	static int j;
	static int k;
	 static String s;
	
	
	static void sum (int i,int j,int k)
	{
		
		System.out.println("sum of all is"+" "+(i+j+k));
		
	}
	
	void diff (int i,int j)
	{
		System.out.println("addition of two is "+" " +(i-j));
	}
	
	String name (String sr)
	{
		return sr;
		
	}
	 
	void main()
	{
		i=j=k=90;
		sum(20, 30, 50);
		diff(100, 20);
		name("Welcome");
		
		
		
	}

}
