import java.util.*;
class Demo
{
int len,br;
Demo(int l,int b)
{
len=l;
br=b;
}
void display()
{
int res=len*br;
System.out.println("Area of rectangular is "+res);

}
}
class Parameterized
{
public static void main(String args[])
{
int x,y;
Scanner sc=new Scanner(System.in);
System.out.println("Enter lenght of rectengular");
x=sc.nextInt();
System.out.println("Enter width of rectengular");
y=sc.nextInt();
Demo rec=new Demo(x,y);
rec.display();
}
}