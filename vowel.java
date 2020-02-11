//7.      Write a program to accept an alphabet and display whether its a vowel or consonant


import java.util.Scanner;
class vowel{
public static void main(String args[]){
char ch;
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
{
System.out.println("the entered character is vowel");
}
else
{
System.out.println("the entered character is consonant");
}
}
}