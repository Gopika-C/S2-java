import java.util.*;
class Arr
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The Elements in the array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
