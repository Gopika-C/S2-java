class BoolTest
{
	public static void main(String args[])
	{
		Boolean b;
		b=false;
		System.out.println("b is : "+b);
		b=true;
		System.out.println("b is :"+b);
		if (b)
			System.out.println("This is executed");
		b=false;
		if(b)
			System.out.println("This is not executed");
		System.out.println("10>9 "+(10>9));
	}
}