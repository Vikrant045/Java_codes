class Mukesh 
{

public static void main (String args[])
{

int a =8;
int b= 6;
int a1 =8;
int b1= 6;
System.out.println("A = "+a);
System.out.println("B = "+b);

System.out.println("Arithmetic ");
System.out.println();


System.out.println("sum = "+(a+b));
System.out.println("Multiplication = "+(a*b));
System.out.println("Substraction = "+(a-b));
System.out.println("Modulus = "+(a%b));
System.out.println("Division = "+(a/b));
System.out.println();
System.out.println();



System.out.println("Assignment ");
System.out.println();

System.out.println("add "+(a+=b));
System.out.println("subs "+(a-=b));
System.out.println("multi "+(a*=b));

System.out.println();

System.out.println("Relational ");

System.out.println();


System.out.println("A<B "+(a<b));
System.out.println("A==B "+(a==b));
System.out.println("A>B "+(a>b));


System.out.println("Logical ");

System.out.println();


System.out.println(" AND...A<B && A<B "+(a<b && a<b));
System.out.println("OR..A<B || A<B "+(a>b || a<b));

System.out.println("NOT..!A<B && A<B "+!(a<b && a<b));

System.out.println();
System.out.println("Ternary ");
int tr = (a1>b1)? b1:a1;

System.out.println(tr);















}
}
