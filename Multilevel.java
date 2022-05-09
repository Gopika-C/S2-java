package s2java;
import java.util.*;
class Person{
	String name,gender,address;
	int age;
	Person(String name,String gender,String address,int age){
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age;
	}
}
class Emp extends Person{
	int empid;
    String company_name,qualification;
    float salary;
    Emp(String name,String gender,String address,int age,int empid,String company_name,String qualification,float salary){
    	super(name,gender,address,age);
    	this.empid=empid;
    	this.company_name=company_name;
    	this.qualification=qualification;
    	this.salary=salary;
    }
	
}
class Teacher extends Emp{
	String subject,department;
	int teacher_id;
	Teacher(String name,String gender,String address,int age,int empid,String company_name,String qualification,float salary,String subject,String department,int tid){
		super(name,gender,address,age,empid,company_name,qualification,salary);
		this.subject=subject;
		this.department=department;
		this.teacher_id=tid;
	}
	void display() {
		System.out.println("Name :"+name+"\nGender : "+gender+"\nAddress : "+address+"\nAge : "+age+"\nEmployee id : "+empid+"\nCompany Name : "+company_name+"\nQualification : "+qualification+"\nSalary : "+salary+"\nSubject : "+subject+"\nDepartment : "+department+"\nTeacher id : "+teacher_id);
		
	}
}
public class Multilevel {

	public static void main(String[] args) {
		String n,g,add,cname,quali,sub,dept;
		int age,eid,tid;
		float s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int ch=sc.nextInt();
		Teacher t[]=new Teacher[ch];
		for(int i=0;i<ch;i++) {
		
		System.out.println("\nEnter the name ");
		n=sc.next();
		n+=sc.nextLine();
		System.out.println("Enter gender ");
		g=sc.next();
		g+=sc.nextLine();
		System.out.println("Enter address ");
		add=sc.next();
		add+=sc.nextLine();
		System.out.println("Enter age ");
		age=sc.nextInt();
		System.out.println("Enter Employee id ");
		eid=sc.nextInt();
		System.out.println("Enter Company name ");
		cname=sc.next();
		cname+=sc.nextLine();
		System.out.println("Enter Qualification ");
		quali=sc.next();
		quali+=sc.nextLine();
		System.out.println("Enter Salary ");
		s=sc.nextFloat();
		System.out.println("Enter Subject ");
		sub=sc.next();
		sub+=sc.nextLine();
		System.out.println("Enter Department");
		dept=sc.next();
		dept+=sc.nextLine();
		System.out.println("Enter teacher id");
		tid=sc.nextInt();
		t[i]=new Teacher(n,g,add,age,eid,cname,quali,s,sub,dept,tid);
		}
		for(int i=0;i<ch;i++) {
			t[i].display();
		}

	}

}
