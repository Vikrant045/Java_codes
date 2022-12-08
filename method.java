class Vikrant
{
int num1,num2;
public int sum ( int a, int b)
{
this.num1 = a;
this.num2 =b;
return a+b;
}
public static void main( String args [])
{
Vikrant obj = new Vikrant( );
   obj.sum(3,5);
obj.display();
}
void display ()
{
System.out.print( num1+num2);
}
}