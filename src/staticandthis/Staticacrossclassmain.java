package staticandthis;

public class Staticacrossclassmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Accesing static var and static method through obj ref
		/*Staticacrossclass sc= new Staticacrossclass();
	    sc.i=200;
		sc.j=100;
		sc.k=50;
		System.out.println(sc.i);
		System.out.println(sc.j);
		System.out.println(sc.k);
		sc.sum(100, 50, 50);*/
		//Accesing static var and static method DIRECTLY BY USING CLASS	
		int a=Staticacrossclass.i=200;
		 int b =Staticacrossclass.j=300;
		int c=Staticacrossclass.k=500;
		 String st=Staticacrossclass.s="HELLO";
		Staticacrossclass.sum(a, b, c);
		
	//Accesing non static var and non static method DIRECTLY BY USING CLASS
		Staticacrossclass sc= new Staticacrossclass();
		/*sc.sum(a, b, c);*/
		sc.diff(b, c);
	 String	stri=sc.name(st);
	 System.out.println(stri);
		
		
		
		
	}

}
