package errorhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//checked exception
public class Throwcompiletimerror {

	public static void main(String[] args) throws InterruptedException {
		 //if one type of error is found then after it will not excute program during run time 
		System.out.println("Program Started");
		Thread.sleep(1000);
		System.out.println("Program finished");
		
		// throws FileNotFoundException we can use 
		try //also we can use  above declaration for this  but after this program will not run
		{
			FileInputStream f= new FileInputStream ("C:\\Users\\Lenovo\\Pictures\\Screenshots");
		} catch (FileNotFoundException e) {
			System.out.println("error");
			e.printStackTrace();
		}
		System.out.println("Program Started");
		Thread.sleep(1000);
		System.out.println("Program finished");
		
	}

}
