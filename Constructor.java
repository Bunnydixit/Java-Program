class Demo
{
Demo()
{
System.out.println("Default constructor invoked");
}
void display()
{
System.out.println("normal method define");
}
}
class Constructor
{
public static void main(String args[])
{
Demo obj=new Demo();
obj.display();
}
}