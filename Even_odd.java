import java.util.Scanner;
 
class Even_odd
{
public static void main(String args[])
{
 int a;
 Scanner obj=new Scanner(System.in);
 System.out.println("enter your  number");
 a=obj.nextInt();
if(a%2==0)
{
System.out.println("Even number "+a);
}
else
{
System.out.println("odd number "+a);
}
}
}