import java.util.*;
class Table
{
public static void main(String args[])
{
int n;
Scanner obj=new Scanner(System.in);
System.out.println("enter your number for calculate table");
n=obj.nextInt();
System.out.println("Table is");
for(int i=1;i<=10;i++)
{
System.out.println(n*i);
}
}
}