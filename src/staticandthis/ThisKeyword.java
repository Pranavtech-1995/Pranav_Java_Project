package staticandthis;

public class ThisKeyword {
	  
	int i;
	String s;
	
	
	ThisKeyword (int i, String s)
	{
		this.i=i;
		this.s=s;
	}
	
	void data(int i,String s) 
	
	{
		this.i=i;//assign same class variable 
		this.s=s;//var overloading 
	}
	void getdata()
	{
		System.out.println(i);
	       System.out.println(s);
	}

	public static void main(String[] args) {
		
    
       ThisKeyword t= new ThisKeyword(1,"Prakash");
       //t.i=20;//by callig class var dierectly 
       //t.s="Rahul";
       //System.out.println(t.i);
       //System.out.println(t.s);
       //t.data(1, "Pranav");// by using this keyword you can assign same variable
       t.getdata();//by using constructor
       
       
	}

}
