package chap_3;
import java.util.Scanner ;

public class table {

    public static void main (String[] args){

        System.out.println("enter n : ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1 ;  i <= 10 ; i++){
            System.out.println(i + " * " + n + " = " + (i*n));
        }
    }
}
