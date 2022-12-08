import java.util.Scanner;
 class Main
{
	public static void main(String[] args) 
{
               Scanner vk = new Scanner( System.in );
		System.out.println("Enter Name of student ");

                String e = vk.next();
		
		System.out.println("Marks in English( Out of 100)   ");
		int a =vk.nextInt();
				System.out.println("Marks in Hindi( Out of 100)   ");
		int b =vk.nextInt();
				System.out.println("Marks in Maths( Out of 100)  ");
		int c =vk.nextInt();
				System.out.println("Marks in Science( Out of 100)   ");
		int a1 =vk.nextInt();
				System.out.println("Marks in Java( Out of 100)   ");
		int a2 =vk.nextInt();
		int total =  a+b+c+a1+a2;
		System.out.println(" Total Marks of  Sachin( Out of 500) = "+total);
		
	float	percentage = total*100/500;
	
		System.out.println(" Percentage of Sachin = "+percentage);
		if (percentage<33)
		{
		    	System.out.println("  Sachin is @Fail  ");
		    
		}
			else 
		{
		    	System.out.println("  Sachin is @Pass ");
		    
		}
	
		
		
	}
}
