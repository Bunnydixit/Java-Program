import java.util.Scanner;

class Nested_if_else
{
public static void main(String args[])
{
int a,b,c,big;
Scanner obj=new Scanner(System.in);
System.out.println("Enter your first number");
 a=obj.nextInt();
System.out.println("Enter your Second number");
b=obj.nextInt();
System.out.println("Enter your Third number");
c=obj.nextInt();
if(a>b)
{
if(a>c)
{
big=a;
}
else
{
big=c;
}
}
else
{
if(b>c)
{
big=b;
}
else
{
big=c;
}
}
System.out.println("greatese number is "+big);
}
}