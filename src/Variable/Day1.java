package Variable;

public class Day1 {

	
	
	static int data=201; // directly decl and initaization at same place 
	static int b;// can't call class variable directly in main var without using static keyword  
	
	public static void main(String[] args) {
		//Approach -1// same type of var 
		long c=10, d=30, e=20; // declaration &initalization both step in single line ,
		c=60;
		b=404; //declration of class var here  
		//Approach -2//for diff type of variable
		int f ;//declration
		f=40;// initalization//limit 2147483647
		float h=45.987f;// up to7 decimal 
		double m=789.9099009090;//declaration &initalization//up to 15 decimal
        byte t=78;//123 limit
        char Grade = 'A';
        boolean binary =true;
        short w=2345;//33700 beyond limit
        int a=200;// local variable with same name 
        //Approach 3// same type of var
        int x,v,n;//// declaration variable in single line 
        x=767; v=300;n=450;//initalization variable in single line
       // x="lol"// can store other type as declared
		long  var=12345678993467878l;
		String name= "pranav";
		//String ch= 'A';//INVALID 
		//char letter='abc'//invalid
		String ch= "Z";//INVALID 
		//bollean bv="false";//invalid
		//String bl =true// INVALID
		String bl ="true";// TReat as string 
		System.out.println ( "float"+f);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println( "float"+ " "+f);
		System.out.println(t);
		System.out.println(h);
		System.out.println(m);
		System.out.println(w);
		System.out.println(x);
		System.out.println(v);
		System.out.println(n);
		System.out.println(c+" "+d+" "+e);
		System.out.println(Grade+" " +"student grade is");
		System.out.println(binary);
		System.out.println (a);
		System.out.println( "class variable is"+ b);
		System.out.println(var);
		System.out.println("my name is " +""+ name );
		System.out.println (bl);
		System.out.println(ch);
		System.out.println(data);
		System.out.println(a+b);
		System.out.println (a+" "+b);
	
	
	
	
	}

}
