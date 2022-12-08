import java.util.*;
class Vikrant
{
public static void main( String args[])
{
Scanner vk=new Scanner(System.in);
System.out.println("please enter your name");
String s=vk.next();
Scanner vkr=new Scanner(System.in);
System.out.println("please enter your amount");
int b=vkr.nextInt();
System.out.println("your name is="+s);
System.out.println("your total amount is ="+b);
Scanner vkn=new Scanner(System.in);
System.out.println("please enter amount to withdraw");
int c=vkn.nextInt();
int d=b-c;
System.out.println("your total amount is ="+d);
}
}