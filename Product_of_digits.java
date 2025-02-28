import java.util.*;
class Product_of_digits
{
public static void main(String args[])
{
int n,r,sum=1;
Scanner obj=new Scanner(System.in);
System.out.println("Enter your for find Product of digits");
n=obj.nextInt();
 while(n!=0)
{
r=n%10;
sum=sum*r;
n=n/10;
}
System.out.println("sum = "+sum);
}
}