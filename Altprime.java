class Altprime
{
public static void main(String args[])
{
int count=0,e=2;
System.out.println("Prime numbers between 1 and 100 ");
for(int i=1;i<=100;i++)
{
for(int j=1;j<=i;j++)
{
if(i%j==0)
{
count++;
}
}
if(count==2)
{
if(e%2==0)
{
System.out.println(i);
}
e++;
}
count=0;
}
}
}