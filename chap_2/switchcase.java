package chap_2;
import java.util.Scanner ;

public class switchcase {

    public  static  void main( String[] args){
        System.out.println("enter user input");
        Scanner sc = new Scanner(System.in);

        int button = sc.nextInt();

        /*
        if( button == 1 ){
            System.out.println("Hello");
        }
        else if(button == 2){
            System.out.println("Namaste");
        }
        else if (button == 3) {
            System.out.println("Bonjour");
        }
        else{
            System.out.println(" eneter a valid number ");
        }


         */

        // switch

        // variable can either be a number or   a character case 'a' , 'b'

        switch (button){
            case 1:
            {
                System.out.println("Hello");
                break;
            }

            case 2:
            {
                System.out.println("Namaste");
                break;
            }
            case 3:
            {
                System.out.println("Bonjour");
                break;
            }
            default:
            {
                System.out.println("Emter a valid number");
                //break;
            }

        }
    }



}
