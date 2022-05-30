package s2java;

public class NestedTry {

	public static void main(String[] args) {
		int number[]= {20,40,60,80,100};
		int denom[]= {5,0,0,10};
		try {
			for(int i=0;i<number.length;i++) {
				try {
					int q=number[i]/denom[i];
					System.out.println(number[i]+"/"+denom[i]+"="+q);
					
				}
			
				catch(ArithmeticException e) {
					System.out.println("Divide by 0 : "+e);
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Array index oob : "+e);
					System.out.println("Program terminated.");
				}
			}
		}
	
		finally {
			System.out.println("Final block");
		}
	}

}
