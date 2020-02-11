/*7. A maths teacher asks her students to give 3 examples for positive odd
 numbers. When the student specifies a correct answer, his/her score is
 incremented by 1. When the student specifies a positive even number, 
his/her score is decremented by 0.5. When the student specifies a negative
 number, he/she will not be given any more chances to correct his or her
 mistake and his/her score will be decremented by 1. So a student's turn 
comes to an end when he/she has correctly specified 3 positive odd numbers 
or when the student has specified a negative number.
  
Few students didn't know the difference between odd numbers and even numbers
 and they made many mistakes and so it was difficult for the teacher to 
maintain the scores. The teacher asks for your help.
  
Can you please help her by writing a  program to calculate the score?*/

import java.util.Scanner;	
class Positiveodd{
public static void main(String args[]){
int i=0;
Scanner sc=new Scanner(System.in);
double sum=0.0;
while(i<3){
int num=sc.nextInt();
if(num%2!=0 && num>0)
{
sum=sum+1;
i=i+1;
}
if(num%2==0 && num>0){
sum=sum-0.5;
i=i;
}
 if(num<0){
sum=sum-1;
break;
}
}
System.out.println(sum);
}}
