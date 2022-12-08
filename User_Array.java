/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vikrant
 */
import java.util.Scanner;
 class Main {
    public static void main(String args [])
    
    {
        
        Scanner vk= new Scanner(System.in);
        System.out.println("Enter number of matrices you want to create.... ");
        int d = vk.nextInt();
        
		System.out.println("enter rows ");
		int row  = vk.nextInt();
		System.out.println("enter columns ");
		int column  = vk.nextInt();
    int    a[][]= new int [row][column];
         
          
       
                
         
      for(int t =0;t<d;t++)  
      {
        System.out.println("Enter Matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column ; j++) {
                  a[i][j] = vk.nextInt();
            
            }
			 
        
        }
        System.out.println("Display  Matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                  System.out.print(a[i][j] +" ");
            
            }
                              System.out.println(" ");
        
        }
      }
           
        
   
        
        
            
    }
}

