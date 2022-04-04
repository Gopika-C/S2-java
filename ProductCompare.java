import java.util.*;
class Product{
	int pcode;
	String pname;
	int price;
	Product(){
		pcode=123;
		pname="Pen";
		price=10;
	}
	Product(int pcode,String pname,int price){
		this.pcode=pcode;
		this.pname=pname;
		this.price=price;
	}
	void display(){
		System.out.println("Pcode = "+pcode+"\nName = "+pname+"\nPrice = "+price);
	}

}
class ProductCompare{
	public static void main(String args[]){
		Product p1=new Product();
		Product p2=new Product(234,"Book",48);
		System.out.println("First Product");
		p1.display();
		System.out.println("Second Product");
		p2.display();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the third product's product code,product name,product price");
		int pcode=s.nextInt();
		String pname = s.next();
		pname+=s.nextLine();
		int price=s.nextInt();
		System.out.println("Third Product");
		Product p3=new Product(pcode,pname,price);
		p3.display();
		if(p1.price<p2.price && p1.price<p3.price){
			System.out.println("\n\nProduct with Lowest price = "+p1.pname+"-"+p1.price);
		}
		else if(p2.price<p1.price && p2.price<p3.price){
			System.out.println("\n\nProduct with Lowest price = "+p2.pname+"-"+p2.price);
		}
		else{
			System.out.println("\n\nProduct with Lowest price = "+p3.pname+"-"+p3.price);
		}
	}
}




		 