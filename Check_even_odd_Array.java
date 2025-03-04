import java.util.*;
class Check_even_odd_Array
{
public static void main(String args[])
{
int arr[]=new int[10];
int i,even_count=0,odd_count=0,even_sum=0,odd_sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter element in array");
for(i=0;i<10;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("In array");
for(i=0;i<10;i++)
{
if(arr[i]%2==0)
{
even_count++;
even_sum=even_sum+arr[i];
}
else
{
odd_count++;
odd_sum=odd_sum+arr[i];
}
}
System.out.println("even number is "+even_count);
System.out.println("odd number is "+odd_count);
System.out.println(" Sum of even number is "+even_sum);
System.out.println("sum of odd number is "+odd_sum);
}
}