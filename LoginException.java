package s2java;
import java.util.*;
import java.lang.Exception.*;
class UsernameException extends Exception{
	UsernameException(String msg){
		System.out.println(msg);
	}
}
class PasswordException extends Exception{
	PasswordException(String msg){
		System.out.println(msg);
	}
}
public class LoginException {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String username,password;
		System.out.println("Enter username : ");
		username=s.nextLine();
		System.out.println("Enter password : ");
		password=s.nextLine();
		
		try {
			if(username.length()<8)
				throw new UsernameException("Username length must be greater than 8 characters\n");
			else if(!password.equals("admin"))
				throw new PasswordException("Incorrect password\n");
			else
				System.out.println("Login Successfull");
		}
		catch(UsernameException u) {
			System.out.println(u);
		}
		catch(PasswordException p) {
			System.out.println(p);
		}
		
	}

}
