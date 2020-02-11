//2.      Write a program to accept three numbers and find the largest of three numbers using ternary operator.



import java.util.Scanner;
class largest{
public static void main(String args[]){
int a,b,c,d;
Scanner sc=new Scanner(System.in);
 a=sc.nextInt();
 b=sc.nextInt();
 c=sc.nextInt();
d=c > (a > b ? a : b) ? c : ((a > b) ? a : b);

System.out.println("the largest number is:"+d);

}
}																														
