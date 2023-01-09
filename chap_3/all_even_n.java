package chap_3;
import java.util.Scanner ;

public class all_even_n {

    public static void main ( String[] args){

        System.out.print("enter n: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for ( int i = 1 ; i <= n ; i++ ){

            if(i%2 == 0){
                System.out.println(i);

            }
        }
    }
}
