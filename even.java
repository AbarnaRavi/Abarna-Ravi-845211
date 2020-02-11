//3.      Write a program to accept a number and display whether the number is odd or even using the ternary operator.



import java.util.Scanner;
class even{
public static void main(String args[]){
int a;
Scanner sc =new Scanner(System.in);
a=sc.nextInt();
String b=(a%2==0)?"even":"odd";

System.out.println("the number is:"+b);
}
}
