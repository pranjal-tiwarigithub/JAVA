package chap_3;

public class while_vs_dowhile {

    public  static  void main ( String[] args){
        int i = 12 ;

        while(i < 11 ){
            System.out.println(i);
            i = i + 1;
        }

        do{
            System.out.println("do while");
            System.out.println(i);
            i = i + 1;
        } while(i<11);
    }


}
