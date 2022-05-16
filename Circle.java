package Shapes;

public class Circle {
	float r;
	public Circle(float r){
		this.r=r;
	}
	public void CirArea() {
		System.out.println("Area of circle :"+(3.14*r*r));
	}
}