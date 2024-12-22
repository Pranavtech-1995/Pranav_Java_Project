package loopingstatement;

public class Day5 {

	public static void main(String[] args) {
		//for loop
		int result;
		for (int i=1;i<=10;i++)//int//condition//increment
		{
			result =2*i;
			//System.out.println(result);
			System.out.println("2*"+i+"="+result);
		}
		// Do while loop
		int a=10;//ini
		do //at least once 
		{ 
			System.out.println("printing table of 4");
			a++;//incr //if incr not haapen it will continue 
		}
		//while (a>=10);//   falsecondition check after execution of do code
		while (a<=10);// true condition
		//while loop
		int c=1;
		while(c<=10)//condition
			
			{
			if (c%2==0) {
			System.out.println("4"+"*"+c+"="+(4*c)+"even");}
			else 
			{System.out.println("4"+"*"+c+"="+(4*c)+"odd");}
			c++;//incr
			}
		int b=10;
		//while loop
		while (b>=0) 
		{
			System.out.println(b);
			b--;
		}

	}

}
