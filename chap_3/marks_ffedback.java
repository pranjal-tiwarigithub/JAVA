package chap_3;
import java.util.Scanner;

public class marks_ffedback {

    public  static  void main ( String[] args){

        Scanner sc = new Scanner(System.in);

        int choice ;

        do{

            System.out.println(" Choice between 0 or 1 ");
            choice = sc.nextInt();

            if ( choice == 1) {

                System.out.println("Enter your mark");

                int marks = sc.nextInt();

                if (marks >= 90) {
                    System.out.println("This is good");
                } else if (marks >= 60 && marks < 90) {

                    System.out.println("This is good too");
                } else if (marks >= 0 && marks < 60) {
                    System.out.println(" this is good too as efforts matters truly");
                }

            }

        } while( choice == 1);

    }
}
