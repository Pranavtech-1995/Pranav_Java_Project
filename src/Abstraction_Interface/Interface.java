package Abstraction_Interface;

public interface Interface {


  String i="Welcome to RBI";//var must be static and final 
  String j= "Your bank is SBI";
  int annualcharge =8;
  
  
  void roi();// all method are public so during implement use keyword as public in class
  void ifsccode();
  void bal();
  
   default String b_name (String s)
  {
	  return s;
  }
   
   static int acc_no (int acc)
   {
	   
	   return acc;
   }
  
  
 
 
}