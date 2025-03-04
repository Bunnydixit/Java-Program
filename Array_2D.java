import java.util.*;
class Array_2D
{
public static void main(String args[])
{
int arr[][]=new int[3][3];
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter 9 element in array");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
arr[i][j]=sc.nextInt();
}
}
System.out.println("your entered array is :");
for(i=0;i<3;i++)
{for(j=0;j<3;j++)
{
System.out.print(arr[i][j]+ "\t");
}System.out.println();}
System.out.println();
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if(i!=j)
{
System.out.print(" ");
}
else
{
System.out.print(arr[i][j]);
}
}
System.out.println();
}
System.out.println();
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if((i+j)%2==0)
{
System.out.print(arr[i][j]);
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
System.out.println();
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if((i+j)%2==0)
{
System.out.print(" ");
}
else
{
System.out.print(arr[i][j]);
}
}
System.out.println();
}
}
}