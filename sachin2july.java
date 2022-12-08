import java.util.*;
class Robin {
public static void main(String args[])
{
Scanner rb = new Scanner (System.in);
System.out.println("please enter your name");
String l = rb.next();
String p =rb.next();
String q=rb.next();
Scanner rbn = new Scanner(System.in);
System.out.println("please enter your amount");
int m =rbn.nextInt();
System.out.println("your name is ="+l+p+q);
System.out.println("your total amount is ="+m);
Scanner rbnt=new Scanner(System.in);
System.out.println("please enter amount to withdraw");
int k=rbnt.nextInt();
int j=m-k;
System.out.print("your total amount is ="+j);
}
}


