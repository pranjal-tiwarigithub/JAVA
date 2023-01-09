package chap_2;
import java.util.Scanner;

public class homework1 {

    public static  void main( String[] args){

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the first number");

        int a = sc.nextInt();

        System.out.println("Enter the second number");

        int b = sc.nextInt();

        System.out.println("Enter the symbol for calculation");

        char button = sc.next().charAt(0);
        String name = sc.next(); // word
        String fullname = sc.nextLine() ;

        // https://www.geeksforgeeks.org/difference-between-next-and-nextline-methods-in-java/
        System.out.println("Hello" + name);
        System.out.println("Hello" + fullname);

        if( button == '+')
        {
            System.out.println(a + b );
        }
        else if ( button == '-')
        {
            System.out.println(a - b );
        }
        else if ( button == '*')
        {
            System.out.println(a * b );
        }
        else if ( button == '/')
        {
            System.out.println(a / b );
        }
        else if ( button == '%')
        {
            System.out.println(a % b );
        }
        else
        {
            System.out.println(" eneter a valid symbol " );
        }


    }

}
