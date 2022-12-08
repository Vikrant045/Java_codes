import java.util.*;
class Main
{
public static void main (String[] args)
{
    // 1st Program
    
    float a3 = 7/4.0f * 9/2.0f;
    System.out.println(a3);

  //  2nd Program 
    
    char v1 = 'A';
    v1 =(char)( v1+20); // by using type casting
    System.out.println("Encrypted");
    System.out.println(v1);
     v1 =(char)( v1-20);
     System.out.println("Decrypted");
    System.out.println(v1);
    
    // 3nd Program
    
   int a2 =12;
    	System.out.println("Yourr number is "+a2);
    Scanner vk = new Scanner(System.in);
    	System.out.println("enter your number to check ");
    	int s = vk.nextInt();
    	if(a2<s)
    	{
    	    	System.out.println("Number is greater");
    	}
    		else
    	{
    	    	System.out.println("Number is Lesser");
    	}
    	
 
// 3rd Program

 int v = 2;
  int u = 20;
   int a = 25;
    int S = 12;
 double w =   ( v*v-u*u)/2*a*S ;
  	System.out.println("Value of expression is (v*v-u*u)/2*a*S  = " +w);
    	
 // 4th Program 
  
  int e = 7;
  int a1 = 7*49/7+35/7;
  	System.out.println(a1);
  
  
}
}