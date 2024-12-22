package loopingstatement;

public class Jumpingstatement {

	public static void main(String[] args) {
		
		// Break
		
		
		for (int i=1;i<=10;i++)
		{
			if (i==5) 
			{
			//break;// break the loop 
			continue;// for not including the particular thing and continue the remaining part
			}
			System.out.println(i);}
			
			for (int j=1;j<=10;j++)
			{
				if (j==7) 
				{
				break;// break the loop 
				//continue;// for not including the particular thing and continue the remaining part
				}
				System.out.println(j);

	            }

}}
