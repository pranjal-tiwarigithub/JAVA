package chap_2;
import java.util.Scanner ;

public class homework2 {

    public static  void main(String[] args){

        System.out.print("Enter the number of months: ");

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month){

            case 1 :
            {
                System.out.println("the month is januarary ");
                break ;
            }

            case 2 :
            {
                System.out.println("the month is Feburary ");
                break ;
            }

            case 3 :
            {
                System.out.println("the month is March ");
                break ;
            }

            case 4 :
            {
                System.out.println("the month is April ");
                break ;
            }

            case 5 :
            {
                System.out.println("the month is May ");
                break ;
            }

            case 6 :
            {
                System.out.println("the month is june ");
                break ;
            }

            case 7 :
            {
                System.out.println("the month is July ");
                break ;
            }

            case 8 :
            {
                System.out.println("the month is August ");
                break ;
            }

            case 9 :
            {
                System.out.println("the month is September ");
                break ;
            }

            case 10 :
            {
                System.out.println("the month is October ");
                break ;
            }

            case 11 :
            {
                System.out.println("the month is November ");
                break ;
            }

            case 12 :
            {
                System.out.println("the month is December ");
                break ;
            }

            default :
            {
                System.out.println("the input is incorrect ");
                break ;
            }
        }

    }
}
