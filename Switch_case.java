import java.util.*;
class Switch_case
{
public static void main(String args[])
{
char choice;
Scanner sc=new Scanner(System.in);
System.out.println("Enter character to be check");
choice=sc.next().charAt(0);
switch(choice)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
System.out.println("vowel");
break;
default:
System.out.println("consonent");
}
}
}