package chap_3;
import java.util.Scanner;

public class check_prime {

    public static void main(String[] args){

        System.out.print("enter n: ");
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();

        boolean prime = true ;

        for ( int i = 2 ; i <= (n/2) ; i ++){
            if ( n % i == 0){
                prime = false;
            }
        }

        if(n ==  1){
            System.out.println("neither prime nor composite");
        }
        else if (prime == true){
            System.out.println(n + " is prime");
        }else{
            System.out.println(n + " is not prime");
        }

    }
}
