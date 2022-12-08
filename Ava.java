/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Abstraction;


/**
 *
 * @author Vikrant
 */
public class Ava implements NewInterface
{
    public static void main (String args[])
    {
        Ava obj = new Ava ();
        obj.fun();
    
}
public void fun(){
System.out.print("hello interface");
}
}
