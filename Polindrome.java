import java.util.*;
class Polindrome
{
public static void main(String args[])
{
int n,r,reverse=0;
Scanner obj=new Scanner(System.in);
System.out.println("Enter your for find Product of digits");
n=obj.nextInt();
int num=n;
 while(n!=0)
{
r=n%10;
reverse=r+reverse*10;
n=n/10;
}
if(reverse==num)
{
System.out.println("polindrome number");
}
else
{
System.out.println(" Not polindrome number");
}}
}
