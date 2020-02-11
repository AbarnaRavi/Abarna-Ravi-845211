//8.      Write a program to find the sum of all odd numbers from 1 to N. Accept N. Display the sum.


import java.util.Scanner;
class oddnum{
public static void main(String args[]){
System.out.println("enter the length:"+n);
int n,sum=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=1;i<=n;)
{
 sum=sum+i;
  i=i+2;
}
System.out.println(sum);
}
}
