class calculator
{
int x,y;
void calc()
{
System.out.println("Addition "+(x+y));
System.out.println("substraction "+(x-y));
System.out.println("multiplication "+(x*y));
System.out.println("division "+(x/y));
}
}
class power extends calculator
{
power(int a,int b)
{
x=a;
y=b;
}
void pow()
{
System.out.println("square of x is "+(x*x));
System.out.println("square of y is "+(y*y));
System.out.println("cube of x is "+(x*x*x));
System.out.println("cube of y is "+(y*y*y));
}
}
class Single_inheritance
{
public static void main(String args[])
{
power obj=new power(4,2);
obj.calc();
obj.pow();
}}