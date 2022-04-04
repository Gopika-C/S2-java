import java.util.*;
public class ComplexNumber{
	double real;
	double img;
	ComplexNumber(double r,double i){
		this.real=r;
		this.img=i;
	}
	ComplexNumber(){}
	ComplexNumber sum(ComplexNumber c1,ComplexNumber c2){
		ComplexNumber temp=new ComplexNumber();
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;
	}
	void display(){
		System.out.println(real+" +i"+img);
	}
	public static void main(String args[]){
		Double r1,r2,i1,i2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter real and imaginary part of first complex number : ");
		r1=s.nextDouble();
		i1=s.nextDouble();
		System.out.println("Enter real and imaginary part of second complex number : ");
		r2=s.nextDouble();
		i2=s.nextDouble();
		ComplexNumber c1=new ComplexNumber(r1,i1);
		ComplexNumber c2=new ComplexNumber(r2,i2);
		System.out.println("First Complex Number : ");
		c1.display();
		System.out.println("Second Complex Number : ");
		c2.display();
		ComplexNumber temp1=new ComplexNumber();
		temp1=temp1.sum(c1,c2);
		System.out.println("Sum = "+temp1.real+" +i"+temp1.img);
	}
}
