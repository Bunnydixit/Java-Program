import java.util.*;
class Pattern_10
{
public static void main(String args[])
{
int i,j,p;
for(i=1;i<=5;i++)
{
for(j=1;j<=5-i;j++)
{System.out.print(" ");}
p=i;
for(j=1;j<=i;j++)
{
System.out.print(p++);
}
p=p-2;
for(j=1;j<=i-1;j++)
{
System.out.print(p--);

}
System.out.println();
}
}
}