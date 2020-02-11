//14.  Write a program to find the factorial of a number using recursion.

import java.util.Scanner;
public class factrecurse{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,a,b;
System.out.println("enter number:");
n=sc.nextInt();
 factrecurse obj=new factrecurse();
a=obj.fact(n);
System.out.println("Factorial of "+n +":" +a);
}
int fact(int x)
{
if(x>1)
{
return(x*fact(x-1));
}
return 1;
}
}




