package oopsmethodandconstructor;

public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student S= new Student();
       
       S.npnr();
       
       String stat=S.np();//return should be stored
       System.out.println(stat);
       String str =S.tptr("Take param & give return");//return should be stored
       System.out.println(str);
       S.tp("Take param","No return");
	}

}
