//5.      Write a program to accept a student’s name and three marks. Display the total and average.
 Display result as First class, Second class, Pass class and Fails.




import java.util.Scanner;
class marks1{
public static void main(String args[]){
String name;
int m1,m2,m3;
float tot, average;
Scanner sc=new Scanner(System.in);
name=sc.nextLine();
m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();
tot=m1+m2+m3;
System.out.println("the total is:"+tot);
average=tot/3;
System.out.println("the average are :"+average); 

if(average>=90)
{
System.out.println("first class");
}
else if(average>=80){
System.out.println("Second class");
}
else if(average>=40)
{
System.out.println("pass");
}
else
{
System.out.println("fail");
}
}}
