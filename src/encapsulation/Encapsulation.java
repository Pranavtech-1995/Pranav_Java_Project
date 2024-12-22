package encapsulation;




public class Encapsulation {
	
	//provide security 
	private int i;
	private String s;
	
	//using without return getter and setter 
	  void setdata (int id, String name) 
	{
		i=id;
		s=name;
	}
	
	  void   getdata ()
	  {
		  String result=i+s;
		  System.out.println(s +" "+ "welcome to the company and your id is"+" "+i  );
		  System.out.println(result);
		  
	  }
	  
	  //using getter and setter method

	public int getId() {
		return i;
	}

	public void setId(int i) {
		this.i = i;
	}

	public String getname() {
		return s;
	}

	public void setname(String s) {
		this.s = s;
	}
	
	
	
	
	
	
	
	

}
