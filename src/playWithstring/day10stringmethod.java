package playWithstring;

import java.util.Arrays;

public class day10stringmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome";
		String s1="pranav";
		String s2="prakash";
		String s3= "Pranav";
		
		int l=s.length();//length of array
		System.out.println(l);
		 char ch=s.charAt(2);//value at index
		 System.out.println(ch);
		 String sr=s.concat(" "+"to the world");
		  System.out.println(sr.trim());//trim
		String info= " "+sr.concat(s1).concat(s2);//concat
		System.out.println(info);
		System.out.println(info.trim());//trim
		 boolean status=s1==s3;//checking value
		 System.out.println(status);
		 System.out.println(s1.equals(s3));//c1;//start with
		 System.out.println(s.indexOf("l"));//index value 
		 System.out.println(s.indexOf('e', 0));//searching e from 0 index
		 //System.out.println(s.indexOf("e", 2, 7));//searching e from starting index to final index
		 System.out.println(s2.substring(3));//return string from this position//starting is considerd
		 System.out.println(s2.substring(2,4));//returning string from starting to ending
		 System.out.println(s3.replace('a', 'z'));//replacing char
		 System.out.println(s3.replaceAll("Pr", "nv"));//replacing all similar substring
		 System.out.println(s3.compareToIgnoreCase(s));//if equal=0;if +ve s3>s and if-ve s3<s
		 String s5="pranav.prakash@gmail.com";
		    
		 String a[] =s5.split("@");
		 System.out.println(a[0]);//pranav.prakash
		 System.out.println(a[1]);//gmail.com
		 String b[]=a[0].split("\\.");//. is special char so we have \\
		 System.out.println("after spliting all word");
		 System.out.println(b[0]);//pranav
		 System.out.println(b[1]);//prakash
		 String c[]=a[1].split("\\.");
		 System.out.println(c[0]);//gmail
		 System.out.println(c[1]);//com
		 String [] e= s5.split("a", 9);//maximum no of split if you want to decide 
		 System.out.println(Arrays.toString(e));
		 
		 //System.out.println(e[1]);
		 ///replacement
		 String z="$1,23,456";
		 String x=z.replaceAll(",", "");
		  String y=x.replace("$", "");
		 System.out.println(y);
		 
		 
		
		 
		 

	}

}
