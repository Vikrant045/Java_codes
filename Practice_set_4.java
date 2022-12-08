
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 /*   // Question No 1
	    
	    int a =10;
	    if ( a==11)
	    {
		System.out.println("I am 11");
	    }
	    else 
	    {
	        System.out.println("I am  not 11");
	        
	    } */
	    
	    
	    // Question No 2
	    
	 /*   Scanner vk =new Scanner(System.in);
	    System.out.println("Vikrant");
	    System.out.print("Your marks in Java (out of 100) = ");
	    int a = vk.nextInt();
	     System.out.print("Your marks in C++  (out of 100) = ");
	    int a1 = vk.nextInt();
	     System.out.print("Your marks in Python  (out of 100) = ");
	    int a2 = vk.nextInt();
	    float avg = a+a1+a2/3.0f;
System.out.println(" average ="+avg);	    	   
	    if(avg>=40 && a>=33 && a2>=33 && a1>=33 )
	    {
	        System.out.println(" Vikrant Your are Pass and promoted to next class...Good Job");
	    }
	     else
	    {
	        System.out.println(" Vikrant Your are Fail... You need to do work Hard ");
	    }
	    */
	    
	    // Question No 3
	    

/*   Scanner vk = new Scanner (System.in);
   System.out.println("Vikrant Please  Enter your salary ");
   long g =vk.nextLong();
    if(0<=g && g<250000)
{
    System.out.println(" Now you have to pay No Tax ");

    
	    
    
	    
}   
else   if(250000<=g && g<500000)
{
    System.out.println(" Now you have to pay 5 % Tax ");
    double d = 5/100.0f*g;
    System.out.println(" Vikrant Tax paid by you = "+d);
	    
    
	    
}   
 else if(500000<=g && g<1000000)
{
    System.out.println(" Now you have to pay 10 % Tax ");
    double d1 = 10/100.0f*g;
    System.out.println(" Vikrant Tax paid by you = "+d1);
	    
    
	    
}   
  else
{
    System.out.println(" Now you have to pay 30 % Tax ");
    double d2 = 30/100.0f*g;
    System.out.println(" Vikrant Tax paid by you = "+d2);
	    
    
	    
}   */

// Question No 4

/* Scanner vk = new Scanner(System.in);
   System.out.println("Vikrant Please  Enter number from 1 to 7 to find day");
   int g =vk.nextInt();
   switch(g)
   {
       case 1:
           {
               System.out.println("Monday");
           break ;
           }
       
	   case 2:
	       {
	           System.out.println("Tuesday");
	       break ;
	       }
	   
	   case 3: 
	       { 
	       System.out.println("Wednesday");
	   break ;
	   }
	   
	   case 4: 
	       {
	           System.out.println("Thursday");
	   break ;
	   }
	   
       case 5:
           {
               System.out.println("Friday");
       break ;
       }
       
	   case 6:
	       {
	           System.out.println("Saturday");
	   break ;
	   }
	   
	   case 7:
	       { 
	       System.out.println("Sunday");
	   
	   }
   }*/
   
   // Question No 5
   /*
   Scanner vk = new Scanner ( System.in);
    System.out.println("Enter Year to find Year is Leap or Not");
    int year = vk.nextInt();
    if(year %4==0 && year %100!=0 || year %400==0)
    {
        System.out.println("This Year is a Leap year (366 days) ");
       
    }
    else 
    {
        System.out.println("Year is not a Leap  Year");
    }
   */
   
   // Question No 6
   
   Scanner vkl = new Scanner ( System.in);
    System.out.println("Enter website to find its type");

       String a =vkl.next();  
         if(a.endsWith(".com"))
{
    System.out.println(" This is a Commercial Website");

}   
     else   if(a.endsWith(".org"))
{
    System.out.println(" This is a Organization Website");

}   
 else  
{
    System.out.println(" This is an Indian Website");

}   
 
	}
}
