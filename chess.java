/*5.All kids were asked the same question ""How many bishops can be placed on a 
chessboard without threatening each other? The Chess Board size is N*N".
Mahirl wanted to participate in this game too.
Sita knows that a bishop's moves are quite complicated and it is difficult to
 make a 4—year kid understand the bishop moves. A bishop can move to any 
distance in any of the four diagonal directions. A bishop threatens another
 bishop if it can move to the other bishop's position.
Sita needs to find a way in which Mahirl could give the correct anwer to this 
question. Mahirl is good at addition and subtraction. She is not familiar
 with other arithmetic operations yet.
Help Sita to compute the maximum number of bishops that can be placed on a chessboard in such a way that no two bishops threaten each other and to make Mahirl win in this game too.*/


import java.util.Scanner;
class chess{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int possible=x+(x-2);
System.out.println("number of bishop that could be place"+possible);
}
}
