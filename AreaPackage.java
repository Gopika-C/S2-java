package s2java;
import Shapes.*;
import java.util.*;
public class AreaPackage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s,l,b,h,ch;
		float r;
		System.out.println("\n------Area---------\n1-Circle\n2-Rectangle\n3-Square\n4-Triangle\n5-Exit");
		while(true) {
		System.out.println("Enter your choice\n");
		ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter the radius of circle :");
			r=sc.nextFloat();
			Circle cobj=new Circle(r);
			cobj.CirArea();
			break;
		case 2:System.out.println("Enter the length and breadth of rectangle :");
			l=sc.nextInt();
			b=sc.nextInt();
			Rectangle robj=new Rectangle(l,b);
			robj.RectArea();
			break;
		case 3:System.out.println("Enter the side of square :");
			s=sc.nextInt();
			Square sobj=new Square(s);
			sobj.SquArea();
			break;
		case 4:System.out.println("Enter height and breadth of triangle :");
			h=sc.nextInt();
			b=sc.nextInt();
			Triangle tobj=new Triangle(h,b);
			tobj.TriArea();
			break;
		case 5:System.out.println("Exiting");
			System.exit(0);
		default:System.out.println("Invalid Choice");
			break;
		
		}
	}

}
}