import java.io.*;
class Display
{
public static void main(String args[])
{
try
{
int a,b;
DataInputStream ds=new DataInputStream(System.in);
System.out.println("Enter two numbers");
a=Integer.parseInt(ds.readLine());
b=Integer.parseInt(ds.readLine());
int c=a+b;
System.out.println("Sum="+c);
}
catch(IOException e)
{
System.out.println(e);
}
}
}