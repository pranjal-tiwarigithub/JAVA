package chap_2;
import java.util.* ;

public class conditions2 {

    public static void main ( String args[] ){

        Scanner sc = new Scanner(System.in);

        System.out.println("Entere your number: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("number is even");
        }
        else {
            System.out.println("Number is odd");
        }

    }
}
