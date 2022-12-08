import java.util.*;
public class Main 
{
    public static void main(String args[])
{
    int a,b,c,d;
    a=10;
    b=90;
    c=45;
    d=35;
boolean f = (a>b) &&(c>d);// logical AND(&&)
{
        System.out.println(f);
    }
    boolean k = (a>b) ||(b<d);// Logical OR(||)
{
        System.out.println(k);
    }
    boolean h =a>d;
{
        System.out.print(!h);// Logical NOT(!)
    }
    
}    
}