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
switch(f)
{
case 1 :
 System.out.println("Enter amount to withdraw");
int y = vk.nextInt();
int t = b-y;
System.out.println("your amount is after withdraw ="+t);
break;

case 2 :
System.out.println("Enter amount to deposit");
int y1 = vk.nextInt();
int t1 = b+y1;
System.out.println("your amount is after deposit ="+t1);
break;


}

System.out.println("Press 1 to continue");
System.out.println("Press 2 for close");
int w = vk.nextInt();
switch (w)
{
case 1 :
System.out.println("Menu ");
System.out.println("1 For withdraw");
System.out.println("2 for deposit");
int f2 = vk.nextInt();
switch(f2)
{

case 1 :
 System.out.println("Enter amount to withdraw");
int y2 = vk.nextInt();
int t2 = b-y2;
System.out.println("your amount is after withdraw ="+t2);
break;

case 2 :
System.out.println("Enter amount to deposit");
int y3 = vk.nextInt();
int t3 = b+y3;
System.out.println("your amount is after deposit ="+t3);
break;


}
case 2 :
System.out.println("Thankyou for visiting");
break;

}
}
}




