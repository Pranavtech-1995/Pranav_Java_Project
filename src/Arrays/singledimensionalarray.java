package Arrays;

public class singledimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//single dimensional array 
				String sr[] = new String[5];// Declaration 
				sr[0]="aman";//assign
				sr[1]="suraj";
				sr[2]="raman";
				sr[3]= "govind";
				sr[4]="jyoti";
				
				System.out.println(sr[3]);//print
				
				
				int a[]= {2,3,4,5,6,7};// Declaration and assign/initialization in the same line
				
				//System.out.println(a[3]);// normal printing single value 
				
				for (int i=0;i<=a.length-1;i++)
		           { 
			         
					System.out.println(a[i]);
		           
		           }
				//Enhanced for loop
				 for(int print:a) 
				 {
					 System.out.println("enhanced"+print);
				 }
				}
				
			}
