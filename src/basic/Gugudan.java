package basic;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        //사용자에게 단수를 입력받아서 해당 단수를 출력하는 코드를 작성하세요
        //System.out.print("단수를 입력하세요. --->");
        //Scanner sc = new Scanner(System.in);
        //int dan = sc.nextInt();
        //int n = 1;
        //while(n < 10){
            //System.out.printf("%d x %d = %d\n", dan, n, dan * n);
            //n++;
        //}
            //sc.close();
        Scanner sc = new Scanner(System.in);
        int dan = 1;
        while( true ){
            System.out.print("단수를 입력하세요. --->");
            dan = sc.nextInt();
            if ( dan==0 ) break;

            int n = 1;
            while (n < 10){
                System.out.printf("%d x %d = %d\n", dan, n, dan * n);
                n++;

            }
        }






        sc.close();
    }

}
