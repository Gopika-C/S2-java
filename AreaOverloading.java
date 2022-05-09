package s2java;
import java.util.*;

 class Overloading{
	void area(float a) {
		System.out.println("Area of square = "+Math.pow(a,2));
	}
	int area(int a,int b) {
		System.out.println("Area of Rectangle = "+a*b);
		return 0;
	}
	float area(double a) {
		double r=3.14*a*a;
		System.out.println("Area of circle = "+r);
		return 0;
	}
	double area(float h,int b) {
		System.out.println("Area of traingle = "+0.5*b*h);
		return 0;
	}
	
}

public class AreaOverloading {

	public static void main(String[] args) {
		int l,b,tb,ch;
		double radius;
		float th,s;
		Overloading obj=new Overloading();
		Scanner sc=new Scanner(System.in);
		System.out.println("\n1-Square\n2-Circle\n3-Rectangle\n4-Triangle\n5-Exit");
		while(true) {
		System.out.println("Enter your choice\n");
		ch=sc.nextInt();
		switch(ch) {
		case 1 :System.out.println("Enter the side of square : ");
			s=sc.nextFloat();
			obj.area(s);
			break;
		case 2:System.out.println("Enter the radius of circle :");
			radius=sc.nextDouble();
			obj.area(radius);
			break;
		case 3:System.out.println("Enter the length and breadth of rectangle :");
			l=sc.nextInt();
			b=sc.nextInt();
			obj.area(l,b);
			break;
		case 4:System.out.println("Enter height and breadth of triangle : ");
			th=sc.nextFloat();
			tb=sc.nextInt();
			obj.area(th,tb);
			break;
		case 5:System.out.println("Exiting");
				System.exit(0);
		default:System.out.println("Invalid Choice");
				break;
		}
		
	}

}
}
