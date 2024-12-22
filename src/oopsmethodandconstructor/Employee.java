package oopsmethodandconstructor;

public class Employee {

   int emp_id;
   String emp_name;
   String emp_desgination;
   
   
   void  emp_data() {
	   
	   
	   System.out.println(emp_id+" "+emp_name+" "+emp_desgination);
   }
   
   void emp_reg(int id,String s,String k) 
   
   {
	   emp_id=id;
	   emp_name=s;
	   emp_desgination=k;
	   
   }
   
   Employee (int a,String b,String c)
   {
	   emp_id=a;
	   emp_name=b;
	   emp_desgination=c;
	   
   }

}
