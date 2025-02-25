import java.util.*;
class Student_percentage
{
public static void main(String args[])
{
int m1,m2,m3,m4,per;
Scanner obj=new Scanner(System.in);
System.out.println("Enter Student 4 Subject Marks");
m1=obj.nextInt();
m2=obj.nextInt();
m3=obj.nextInt();
m4=obj.nextInt();
per=(m1+m2+m3+m4)/4;

if(per>=75)
{
System.out.println("HONOURS");
}
else if(per>=60)
{
System.out.println("first");
}
else if(per>=50)
{
System.out.println("second");
}
else if(per>=40)
{
System.out.println("third");
}
else
{
System.out.println("fail");
}}
}