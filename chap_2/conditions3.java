package chap_2;
import  java.util.Scanner ;

public class conditions3 {

    public static void main( String args[]){
        Scanner sc =  new Scanner(System.in) ;

        System.out.println(" enter a ");
        int a  = sc.nextInt();
        System.out.println(" enter b ");
        int b =  sc.nextInt() ;

        if ( a == b){
            System.out.println("a is equal to b");
        }
        else if(a > b){
                System.out.println("a is greater than b");
            }
        else{
                System.out.println("b is greater than a ");
            }


    }
}
