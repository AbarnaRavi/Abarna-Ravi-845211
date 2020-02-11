/*2. Write a java program that allows the user to enter 'n' numbers and 
finds the number of positive numbers entered and the sum of all positive */
numbers entered using a for loop.


import java.util.Scanner;
class sum{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter n numbers");
int n=sc.nextInt();
int a[]=new int[10];
int sum=0,count=0;


for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if(a[i]>0){
count++;
sum=sum+a[i];
}}

System.out.println("count of positive num:" +count);
System.out.println("enter the sum value:" +sum);
}
}






