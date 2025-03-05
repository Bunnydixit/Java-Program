import java.util.*;
class Array_Sum
{
public static void main(String args[])
{
int a[][]=new int[3][3];
int b[][]=new int[3][3];
int sum[][]=new int[3][3];
int i,j;
Scanner obj=new Scanner(System.in);
System.out.println("Enter 9 element in first array");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
a[i][j]=obj.nextInt();
}
}
System.out.println("Enter 9 element in second array");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
b[i][j]=obj.nextInt();
}
}
System.out.println("First matrix is :");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]);
}
System.out.println();
}
System.out.println("Second matrix is :");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(b[i][j]);
}
System.out.println();
}
System.out.println("Sum of matrix is :");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
sum[i][j]=a[i][j]+b[i][j];
}
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(sum[i][j]);
}
System.out.println();
}

}}
