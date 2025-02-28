import java.util.*;
class Factorial
{
public static void main(String args[])
{
int n,fact=1;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the number for calculate factorial");
n=obj.nextInt();
while(n>=1)
{
fact=fact*n;
n--;
}
System.out.println("Factorial is "+fact);
}
}