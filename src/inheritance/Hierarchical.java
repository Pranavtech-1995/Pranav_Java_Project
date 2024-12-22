package inheritance;


class M{
	int d()
	{
		int i=50;
		System.out.println("My name is");
		return i;
	}
}
  class M1 extends M
  {
	  int d1()
	  {
		  int j=50;
		  System.out.println("Pranav");
		  return j;
	  }
  }
  
  class M2 extends M{
	  
	  int d2()
	  
	  {
		  int k=50;
		  System.out.println(" Prakash");
		  return k;
	  }
  }


public class Hierarchical {

	public static void main(String[] args) {
		
		M2 m=new M2();// through M2 (parent)we can access d(Parent method) and d2  (child Method)
		int p=m.d();
		 int o=m.d2();
		 System.out.println(p+o);
		M1 mh= new M1();// through M2 (parent)we can access d(Parent method) and d1  (child Method)
		int q=mh.d();
		int s=mh.d1();
		System.out.println(s+q);
		
		
		

	}

}
