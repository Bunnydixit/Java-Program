import java.util.*;
class Demo
{
int x,y;
float z;
void display(int a)
{
x=a;
System.out.println("Square of x is "+ (x*x));
}
void display(float b)
{
z=b;
System.out.println("Square of z is "+(z*z));
}
void display(int a,int b)
{
x=a;
y=b;
System.out.println("add of x and y is "+(x+y));
System.out.println("sub of x and y is "+(x-y));
System.out.println("mul of x and y is "+(x*y));
System.out.println("div of x and y is "+(x/y));
}
void display(int a,float b)
{
x=a;
z=b;
System.out.println("value of x is "+x);
System.out.println("value of z is "+z);
System.out.println("Square of x is "+(x*x));
System.out.println("Square of z is "+(z*z));


}
void display(float a,int b)
{
z=a;
x=b;
System.out.println("value of x is "+x);
System.out.println("value of z is "+z);
System.out.println("cube of x is "+(x*x*x));
System.out.println("cube of z is "+(z*z*z));


}
}
class Method_overloading
{
public static void main(String args[])
{
int a,b;
float c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter two integer type value");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Enter one float type value");
c=sc.nextFloat();
Demo obj=new Demo();
obj.display(a);
obj.display(c);
obj.display(a,b);
obj.display(a,c);
obj.display(c,a);

}}