class A{
	int a,b;
	int area(int a){
		this.a=a;
		return(a*a);
	}
	int area(int a,int b){
		this.a=a;
		this.b=b;
		return(a*b);
	}
}
class Ab{
	public static void main(String args[]){
		A obj=new A();
		System.out.println("Area of square = "+obj.area(24));
		System.out.println("Area of rectangle = "+obj.area(4,6));
	}
}
		