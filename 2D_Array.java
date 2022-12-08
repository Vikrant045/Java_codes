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
		System.out.println("enter rows ");
		int row  = vk.nextInt();
		System.out.println("enter columns ");
		int column  = vk.nextInt();
    int    a[][]= new int [row][column];
         
          
          int a2[][] = new int[row][column];
            int  sum[][] = new int [row][column];
                     
                
         
        
        System.out.println("Enter first Matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column ; j++) {
                  a[i][j] = vk.nextInt();
            
            }
			 
        
        }
        System.out.println("Display first Matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                  System.out.print(a[i][j] +" ");
            
            }
                              System.out.println(" ");
        
        }
           
        
        System.out.println("Enter Second Matrix");
         
           for (int i = 0; i < row; i++)
           {
            for (int j = 0; j < column; j++)
            {
                 a2[i][j] = vk.nextInt();
                
            }
            
            
        }
        System.out.println("Display Second Matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                  System.out.print(a2[i][j] +" ");
            
            }
                              System.out.println(" ");
        
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                 sum [i][j] = a[i][j] + a2[i][j] ;
            
            }
                              
        
        }
        System.out.println(" Sum of these two matrices is ...");
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j]+" ");
            
            }
            System.out.println(" ");
                              
        
        }
        
        
        
            
    }
}
