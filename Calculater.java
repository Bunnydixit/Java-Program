import java.util.*;
class Calculater
{
public static void main(String args[])
{
int a,b;
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your first number");
a=sc.nextInt();
System.out.println("Enter your second number");
b=sc.nextInt();
System.out.println("enter your symbol which you want to perform");
ch=sc.next().charAt(0);
switch(ch)
{
case '+':
System.out.println("a+b "+(a+b));
break;
case '-':
System.out.println("a-b "+(a-b));
break;
case '*':
System.out.println("a*b "+(a*b));
break;
case '/':
System.out.println("a/b "+(a/b));
break;
default:
System.out.println("not exist");
}
}}