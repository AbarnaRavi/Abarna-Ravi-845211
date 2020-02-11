//9.      Write a program to find the reverse of a number. Store the reverse value in a different variable.
 Display the reverse.

import java.util.Scanner;
class reversenum{
public static void main(String args[]){
int n,reverse=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(n!=0)
{
int digit=n%10;
reverse=reverse*10+digit;
n=n/10;
}
System.out.println(reverse);
}
}
