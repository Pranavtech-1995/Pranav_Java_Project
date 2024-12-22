package oopsconceptclassandobject;

public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s=new Student() ;
        s.id=1;
        s.name="pranav";
        s.lastname="prakash";
        s.std= 8;
        //s.school="rsm public school";//declaration of var at class label then no need to declare it in each class
        System.out.println("data of 1st  student");
        s.student_list();
       Student s1=new Student() ;
        s1.id=2;
        s1.name="rahul";
        s1.lastname="parihar";
        s1.std=10;
      //s.school="rsm public school";// no need to call each and every time declare it in class
        System.out.println("data of 2nd student");
        s1.student_list();
       
        
	}

}
