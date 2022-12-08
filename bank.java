package india;
import java.util.Scanner;
class Vikrant
{
public static void main(String args[])
{
public void bank1(){
Scanner vk = new Scanner(System.in);
System.out.println("Enter your name ");
String a=vk.next();
System.out.println("Enter your amount ");
int b = vk.nextInt();
System.out.println("MENU ");
System.out.println("Press 1 For withdraw");
System.out.println("Press 2 for deposit");
int f = vk.nextInt();
if(f==1)
{
System.out.println(" You Slected 1: Enter amount to withdraw");
int m = vk.nextInt();
int x = b-m;

System.out.println(" After Withdraw "+a+" your Balance  is ="+x);
}
else if(f==2)
{
System.out.println(" You Slected 2: Enter amount to Deposit");
int m = vk.nextInt();
int x = b+m;

System.out.println(" After Deposit "+a+" your Balance  is ="+x);
}
System.out.println("Press 1 to continue");
System.out.println("Press 2 to close");
int p = vk.nextInt();
if(p==2)
{
System.out.println("Thank you you have a nice day");
}
}
}
}














