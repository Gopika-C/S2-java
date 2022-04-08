package s2java;
import java.util.*;
public class StringManipulation {

	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
		String s1=new String();
		System.out.println("Enter a string");
		s1=sc.next();
		System.out.println("----String Operations---------\n1-String length\n2-String Concatenation\n3-Character Extraction\n4-String Comparison\n5-Searching Substrings\n6-Modifying a string\n7-Exit");
		while(true) {
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch) {
			case 1: System.out.println("Length of string : "+s1.length());
					break;
			case 2:System.out.println("Enter the string to be concatenated");
					String s2=new String();
					s2=sc.next();
					System.out.println("String after concatenation : "+s1.concat(s2));
					break;
			case 3:System.out.println("Enter the position of the character");
					int p;
					p=sc.nextInt();
					System.out.println("Character at the position "+p+" : "+charAt(p));
					break;
			case 4:System.out.println("Enter the string to be compared ");
					String s3=new String();
					s3=sc.next();
					Boolean result=s1.equals(s3);
					System.out.println("Is the two strings "+s1+"and "+s3+" are equal?"+result);
					break;
			case 5:System.out.println("Enter the substring to be searched : ");
					String sub=new String();
					int last_index=s1.lastIndexOf(sub);
					int first_index=s1.indexOf(sub,2);
					System.out.println("Last index = "+last_index+"\nFirst index = "+first_index);
					break;
			case 6:System.out.println("Enter the string to be replaced");
					String s4=new String();
					System.out.println("Enter string for replacing ");
					String s5=new String();
					String replace_string=s1.replace(s4,s5);
					System.out.println("The string after replace : "+replace_string);
					break;
			case 7:System.out.println("Exiting");
					System.exit(0);
			default:System.out.println("Invalid Input");
					break;
		
					
			}
		}

	}

	private static String charAt(int p) {
		// TODO Auto-generated method stub
		return null;
	}

}
