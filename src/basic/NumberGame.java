package basic;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Random rand = new Random ();
        int num = rand.nextInt( 10) + 1;
        int n = 0;
        System.out.println(n);


        int num = 1;
        Scanner sc = new Scanner(System.in);
        while (num != n) {
            System.out.print("숫자를 입력하세요 ===>");
            num = sc.nextInt();
            //if(num == n) break;

            if(num > n ) {
                System.out.println("숫자는 큽니다.");
            }
            else {
                System.out.println("숫자는 작습니다.");
            }
        }
        System.out.println("정답입니다.");

        sc.close();

    }
}
