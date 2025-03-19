import java.util.*;
class Student
{
String name;
int roll;
char grade;
Student(int roll,String name,char grade)
{
this.roll=roll;
this.name=name;
this.grade=grade;
}
void disp()
{
System.out.println("Student roll is "+this.roll);
System.out.println("Student name is "+this.name);
System.out.println("Student grade is "+this.grade);

}

}
 class This_variable
{
public static void main(String args[])
{
int r;
String n;
char g;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the roll number");
r=sc.nextInt();
System.out.println("Enter the name");
n=sc.next();
System.out.println("Enter the grade");
g=sc.next().charAt(0);
Student st=new Student(r,n,g);
st.disp();

}

}

