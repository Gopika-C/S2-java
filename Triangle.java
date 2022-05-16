package Shapes;

public class Triangle {
	int h,b;
	public Triangle(int h,int b){
		this.h=h;
		this.b=b;
	}
	public void TriArea() {
		System.out.println("Area of Triangle : "+(0.5*h*b));
	}
}
