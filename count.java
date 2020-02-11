/*8. Drona normally trains his disciples using a board which consists of 
concentric circles. When the student correctly hits the center of the 
concentric circles, his score is 100. The score gets reduced depending on
 where the students hit on the board. When the student hits outside the board,
 his score is 0. Drona will not allow a student to have his food unless he 
scores 100. Arjuna will always hit the target in his first attempt and he
 will leave early.
Others may take more turns to reach the score of 100.
Can you write a program to determine the number of turns a disciple takes
 to reach the target score of 'n' ?*/
 

import java.util.Scanner;
class count{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sum=0,count=0;
int n=sc.nextInt();
int a =sc.nextInt();
for(int i=0;i<n;i++)
{
sum=sum+a;
count++;
if(sum>=n)
{
break;
}
}
System.out.println("the number of count:"+count);
}
}
