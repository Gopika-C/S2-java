package s2java;
import java.util.Arrays;
import java.util.Scanner;
public class Sort {

	public static void main(String[] args) {
		int ch,n,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		n=s.nextInt();
		String arr[]=new String[n];
		System.out.println("------Menu------\n1-Read\n2-Sort using inbuilt sort functions\n3-Sort without using inbuilt sort function\n4-Exit");
		while(true)
		{
			System.out.println("Enter your choice : ");
			ch=s.nextInt();
			switch(ch) {
			case 1:System.out.println("Enter the values into array");
					for(i=0;i<n;i++) {
						arr[i]=s.next();
					}
					break;
			case 2:Arrays.sort(arr);
					System.out.println("Sorted String  : "+Arrays.toString(arr));
					break;
			case 3:for(i=0;i<n;i++) {
					for(int j=i+1;j<n;j++) {
						if(arr[i].compareTo(arr[j])>0){
							String temp=new String();
							temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
							}
						}
					}
					System.out.println("Sorted String :");
					for(i=0;i<n;i++) {
						System.out.println(arr[i]+" ");
					}
					break;
			case 4: System.out.println("Exiting .......");
					System.exit(0);
			default:System.out.println("Invalid choice");
					break;
			}
			
		}

	}

}
