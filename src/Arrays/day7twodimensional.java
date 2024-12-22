package Arrays;

public class day7twodimensional {

	public static void main(String[] args) {
		int ar1[][]=new int[2][3];//declration
		ar1[1][1]=98;//assign
		ar1[0][0]=87;
		System.out.println(ar1[1][1]);//one by one 
		
		int  ar[][]= {{2,3},{5,6} ,{9,11} ,{12,15}};
		
		System.out.println("lenth of row is"+" "+ar.length);
		System.out.println("length of column  is"+" "+ar[0].length);
		System.out.println(ar[0][0]);
		
		for (int i = 0;i<=ar.length-1;i++)
		{
			for(int j=0;j<=ar[0].length-1;j++) {
			System.out.print(ar[i][j]+ " ");
			}
			System.out.println();
		 }
		
		//enhanced for loop for two dimensional
		for (int a[]:ar)// first store two data so it is array
		{
			
			for(int x:a)// column data //single data
			{ 
				System.out.print(x+" ");
				
			}
			System.out.println();
		}
			}
		
		
					
		}

	


