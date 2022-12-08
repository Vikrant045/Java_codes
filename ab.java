
import java.util.Scanner;

  class SUm {




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        if(n%2!= 0)
        {
            System.out.println("Weird");
        }
        else if(n>=2 && n<6 && n%2==0 )
        {
                        System.out.println(" Not Weird");

        }
         else if(n>5 && n<21 && n%2==0 )
        {
                        System.out.println("  Weird");

        }
        else if (n>20 && n%2==0){
                                    System.out.println(" Not Weird");

        }
       
    }
}
