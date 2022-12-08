import java.util.Scanner;
class Vikrant
{
public static void main(String args[])
{
Scanner vk = new Scanner(System.in);
System.out.println("Enter your name ");
String a=vk.next();
System.out.println("Enter your amount ");
int b = vk.nextInt();
System.out.println("Menu ");
System.out.println("1 For withdraw");
System.out.println("2 for deposit");
int f = vk.nextInt();
if(f==1)
{
System.out.println("Slected 1: Enter amount to withdraw");
int m = vk.nextInt();
int x = b-m;

System.out.println("your total amount is after withdraw ="+x);
}
else if(f==2)
{
System.out.println("Slected 2: Enter amount to Deposit");
int g = vk.nextInt();
int q = b+g;

System.out.println("your total amount is after deposit ="+q);

}
System.out.println("Press 1 to continue");
System.out.println("Press 2 to close");
int p = vk.nextInt();
if(p==2)
{
System.out.println("Thank you you have a nice day");
}
else if(p==1)
{
System.out.println("Menu ");
System.out.println("1 For withdraw");
System.out.println("2 for deposit");
}
int f1 = vk.nextInt();
if(f1==1)
{
System.out.println("Slected 1: Enter amount to withdraw");
int m1 = vk.nextInt();
int x1 = b-m1;

System.out.println("your total amount is after withdraw ="+x1);
}
else if(f1==2)
{
System.out.println("Slected 2: Enter amount to Deposit");
int g1 = vk.nextInt();
int q1 = b+g1;

System.out.println("your total amount is after deposit ="+q1);

}
}
}















