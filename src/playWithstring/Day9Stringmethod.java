package playWithstring;

import java.util.Arrays;
import java.util.Scanner;

public class Day9Stringmethod {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reading and writing of an array
		
		int a[]= new int [5];
		 Scanner sc= new Scanner (System.in);
		for (int i=0;i<=a.length-1;i++)
		{
		
		System.out.println("enter a"+i+" value");
		 a[i]=sc.nextInt();
		 System.out.println();
		 
		}
		System.out.println(Arrays.toString(a));
		
		boolean m=false;
		for(int b:a) 
		{
			if (b==20)
			{
				System.out.println("got full marks");
				m=true;
				break;
					
			}
		}
		if (m==false) 
		{
			Arrays.sort(a);
			System.out.println(Arrays.toString(a)+"sorting");
		}
             sc.close();
		}
	

	}


