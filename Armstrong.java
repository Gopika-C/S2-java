class Armstrong
{
public static void main(String args[])
{
int num=145,rem,sum=0,temp;
temp=num;
while(num>0)
{
rem=num%10;
sum=sum+rem*rem*rem;
num=num/10;
}
if(sum==temp)
{
System.out.println("Number is armstrong");
}
else
{
System.out.println("Number is not an armstrong");
}

}
}