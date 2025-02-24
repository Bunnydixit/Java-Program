import java.util.Scanner;
class Intinput
{

public static void main(String args[])
{
String name;
int roll;
float per;
char grade;

Scanner obj=new Scanner(System.in);
System.out.println("enter your name");
name=obj.next();
System.out.println("enter your roll number");
roll=obj.nextInt();
System.out.println("enter your percentage");
per=obj.nextFloat();
System.out.println("enter your grade");
grade=obj.next().charAt(0);
System.out.println("---------------Student Details is---------------")
System.out.println("Student name is "+name);
System.out.println("Student roll number is "+roll);
System.out.println("Student percentage is "+per);
System.out.println("Student grade is "+grade);


}


}