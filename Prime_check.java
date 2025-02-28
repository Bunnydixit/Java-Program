import java.util.*;
class Prime_check
{
public static void main(String args[])
{
int n,count=0;
Scanner obj=new Scanner(System.in);
System.out.println("enter number for check prime or not");
n=obj.nextInt();
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
count+=1;
}
}
if(count==2)
{
System.out.println("prime number "+n);
}
else
{
System.out.println(" Not prime number "+n);
}
}
}