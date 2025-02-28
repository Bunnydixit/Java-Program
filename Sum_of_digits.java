import java.util.*;
class Sum_of_digits
{
public static void main(String args[])
{
int n,r,sum=0;
Scanner obj=new Scanner(System.in);
System.out.println("Enter your for find sum of digits");
n=obj.nextInt();
 while(n!=0)
{
r=n%10;
sum=sum+r;
n=n/10;
}
System.out.println("sum = "+sum);
}
}