/*3. 
Character experience is one of the main attractions in the Disneyland.
'Alice' from the movie 'Alice in Wonderland' is one of the famous characters. 
Patrick and Johnny just reached Disneyland and decided to have character
 experience. Since both of them like Alice, they decided to visit Alice
 first.
To their surprise, Alice was missing. 
Then they realized that they have to solve puzzle to meet Alice.
They found many ways numbered from 1,2,3,........18.
They were confused about the way that will lead them to Alice.
They found a cute bird, standing in one of the tree.
The bird was chirping a number. They realised that the number was the
clue to find the correct path.
They also found a note with a message- 'sum the digits'.
 That is, if the bird said 23, then the 5th (2+3=5) way will lead them to
 Alice's place. They were already confused, so pls help Patrick and
 Johnny in finding the correct route... */


import java.util.Scanner;
class task3{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("the bird said is:");
int n=sc.nextInt();
int a=n%10;
int b=n/10;
int sum=a+b;
System.out.println("patrick and johny must go in" +sum+ "to find alice");
}
}