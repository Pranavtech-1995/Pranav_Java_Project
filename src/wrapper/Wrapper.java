package wrapper;

public class Wrapper {

	public static void main(String[] args) {
		
		
		
		//CONVERSION OF PRIMITIVE TYPE INTO STRING 
       // CONVERSION  OF STRING INTO PRIMITVE TYPE/
		String v="welcome";//can't convert it into int bcz  it is string
		String s="7982504226";//long
		String x="10";//int
		String y="20";//int
		String a="12345.8976";//double
		String status= "true";
		System.out.println(Double.parseDouble(a));
		System.out.println(Short.parseShort(y));
		System.out.println(Integer.parseInt(x)+Integer.parseInt(y));
		long i= Long.parseLong(s);
     	System.out.println(i);
     	System.out.println(Byte.parseByte(x));
     	System.out.println(Boolean.parseBoolean(v));
     	System.out.println(Boolean.parseBoolean(status));
     	
     	//cannot convert string to char 
    	//CONVERSION OF PRIMITIVE TYPE INTO STRING
     	
     	int v1=10;
     	long v2=7982504226l;
     	byte v3=34;
     	short v4=945;
     	boolean v5= false;
     	boolean v6= true;
     	char V7='A';
     	  System.out.println("CONVERSION OF PRIMITIVE TYPE INTO STRING");  
     	System.out.println(String.valueOf(v1));
     	 System.out.println(String.valueOf(v2));
     	 System.out.println(String.valueOf(v3));
     	 System.out.println(String.valueOf(v4));
     	 System.out.println(String.valueOf(v5));
     	 System.out.println(String.valueOf(v6));
     	 System.out.println(String.valueOf(V7));
     	 System.out.println(String.valueOf(v1));
     	 
     	 
     	
     	
     	
     	
     	
     	
     	
		
		
		
	}

}
