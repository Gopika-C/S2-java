package s2java;
import java.util.*;
import java.io.IOException;
class MyException extends Exception{
	public MyException(String str) {
		System.out.println(str);
	}
}
public class SignException {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=s.nextInt();
		int k=0,sum=0;
		int numbers[]=new int[n];
		while(n>0) {
				try {
						System.out.println("Enter number :  ");
						int num=s.nextInt();
						if(num<0) 
							throw new MyException(" Number is negative ");
						else {
								numbers[k]=num;
								sum=sum+num;
								k++;
								
						}
						n--;		
		}
		catch(MyException m) {
				System.out.println(m);
			}
		}
		System.out.println("The average is " +sum/k);
	}

}
