package s2java;
import java.util.*;
interface Shapes{
	void area();
	void perimeter();
}
class Circle1 implements Shapes{
	int radius;
	Circle1(int r){
		this.radius=r;
	}
	public void area(){
		System.out.println("Area of circle :"+3.14*radius*radius);
	}
	public void perimeter(){
		System.out.println("Perimeter of circle : "+(2*3.14*radius));
	}
	
}
class Rect implements Shapes{
	int l,b;
	Rect(int l,int b){
		this.l=l;
		this.b=b;
	}
	public void area(){
		System.out.println("Area of Rectangle :"+l*b);
	}
	public void perimeter() {
		int p=2*(l+b);
		System.out.println("Perimeter of rectangle :"+p);
	}
	
}

public class ShapesInterface{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch,r,l,b;
		System.out.println("\n1-Circle\n2-Rectangle\n3-Exit");
		while(true) {
		System.out.println("Enter your choice\n");
		ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter the radius of circle :");
			r=sc.nextInt();
			Circle1 cobj=new Circle1(r);
			cobj.area();
			cobj.perimeter();
			break;
		case 2:
			System.out.println("Enter the length and breadth of rectangle :");
			l=sc.nextInt();
			b=sc.nextInt();
			Rect robj=new Rect(l,b);
			robj.area();
			robj.perimeter();
			break;
		case 3:System.out.println("Exiting");
		System.exit(0);
		default:System.out.println("Invalid Choice");
		break;
		
		
		
			}
		}
	}
}


