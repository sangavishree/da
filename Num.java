import java.util.*;
public class Num
{
public static void main(  String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println(n);
if(n>0)
{
System.out.println("positive number");
}
else if(n<0)
{
System.out.println("negative number");
}
else
System.out.println("zero");
}
}
