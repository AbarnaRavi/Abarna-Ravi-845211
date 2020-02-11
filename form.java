/*9. Write a java program to print all numbers between a and b
 (a and b inclusive) using a for loop.*/


import java.util.Scanner;
class form{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("enter the value of a:" +a);
System.out.println("enter the value of b:" +b);
for(int i=a;i<=b;i++)
{
System.out.println("value of i:"+i);
}
}
}

