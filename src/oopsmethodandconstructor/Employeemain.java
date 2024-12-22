package oopsmethodandconstructor;

public class Employeemain {

	public static void main(String[] args) {
		
		//USing object refernce
		/*Employee e=new Employee();
		
		e.emp_id=20;
		e.emp_name="pranav";
		e.emp_desgination="Senior QA";
		e.emp_data();
		
		//using method
		
		Employee e1= new Employee();
		e1.emp_reg(101, "Himanshu", "Dev");
		e1.emp_data();*/
		
		//using constructor
		
		Employee e= new Employee(102,"faiz","dev");
		e.emp_data();
		 int var=e.emp_id;//this is another way without using method
		 System.out.println(var);
		
		
	}

}
