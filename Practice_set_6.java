
public class Main
{
	public static void main(String[] args) {
	    
	/*    
	    // Question No 1( Array of floating point numbers and their sum..)
		

	float a[] = {2.3032f,3.5032f,6.022f,6.032f,2.023f};
	float sum =0;
 
for (float vkv:a)
{
  sum = sum + vkv;
		
	
	}
	System.out.print(sum);	
	
	
	// Question No 2 ( Given integer is present in array or not...)
	
		float a[] = {2.3032f,3.5032f,6.022f,6.032f,2.023f};
	boolean d = false ;
	float f = 2.023f;
for (float elements:a)
{
  
if (elements==f)		
{
 d = true ;
    break ;
}
	
	}
	if (d)
	{
	    System.out.print("Element is present in Array..");
	    
	}
		else
	{
	    System.out.print("Element is not present in Array..");
	    
	}
	
	
	
	
	
	// Question No 3 ( Average marks of students containing in array )
	int sum = 0;
	int a [] = {45,54,54,35,65,89,};
	System.out.println("Number of students in physics");
	for(int elements:a)
	{
	    sum = sum +elements;
	  
	}
   int avg = sum/6;
	System.out.println("Sum of numbers of students in physics = "+sum);
	System.out.print("Average marks of students in physics = "+avg);
	
	
		
		
			// Question No 4 ( Add two matrics of sizes 2x3 )
	int sum [][] = new int [2][3];
	int a [][] ={ {45,54,54}, { 35,65,89}};
		int a1 [][] = {{4,584,74},  { 35,65,89}};
	System.out.println( "First Matrix ");
	
	for(int i = 0 ; i<2;i++)
	{
	    	for(int j = 0 ; j<3;j++)
	{
	    
	  System.out.print(a[i][j] + " ");
	
	}
	    System.out.println(" ");
	
	  
	}
	System.out.println( " Second Matrix ");
   
   	for(int i = 0 ; i<2;i++)
	{
	    	for(int j = 0 ; j<3;j++)
	{
	    
	  System.out.print(a1[i][j]+ " ");
	
	}
	    System.out.println(" ");
	    
	}
	
System.out.println(" Sum of the matrics is ... ");
	
	  	for(int i = 0 ; i<2;i++)
	{
	    	for(int j = 0 ; j<3;j++)
	{
	    
	 sum[i][j]=a[i][j]+a1[i][j] ;
	 System.out.print(sum[i][j]+" ");
	    
	
	}
		System.out.println(" ");
	    
	    
	}
		
	    
	
// Question No 5  ( Reverse the elements of an array)	

int [] a4 = {23,12,12,45,6,56,6};
	 System.out.print("Reverse order of an array [ ");

	  	for(int i = 6 ; i>=0;i--)
	{
	   
	
	    
	 
	 System.out.print(a4[i]+",");
	    
	
	}
	System.out.print("] ");
	
	
	
	    // Question No  6 and 7 (  maximum and Minimum element of an array)	

int [] a4 = {23,12,12,45,6,56,6};
	 
int max =0;
int min = 56;
	  	for(int i:a4)
	{
	    if(i>max)
	    {
	        max = i;
	    }
	    if(i<min)
	    {
	        min = i;
	    }
	}
	 
	 System.out.println ("Maximum number is : "+max);
	    
	System.out.println("Minimum number is : "+min);
	    
	*/
	
	 // Question No 8 ( Check an Array is sorted or not)
	 
        boolean isSorted = true;
        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }

	 
}
}
