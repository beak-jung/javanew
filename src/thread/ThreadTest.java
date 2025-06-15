package thread;

import java.util.Scanner;

public class ThreadTest {
    public static void exceptionTest() {
        int [] arr ={1, 2,3};
//        System.out.println(arr[3]);

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("정수를 입력하세요 :");
            int number = sc.nextInt();
            System.out.println("입력된 값 : " + number);

            System.out.println(10 / 0); //잘 못해서 분모에 0이 들어가도록 살수한 상황
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println( e.getMessage() ); //ArrayIndexOutOfBoundsException의 기본 메세지
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다."); //개발자 커스텀 메세지를 출력
        } catch (Exception e) {
            System.out.println(" 알 수 없는 에러가 발생했습니다"); //개발자 커스텀 메세지를 출력
        }finally {
            //try를 진입하면 무조건 마지막에 실행되는 블록
            sc.close();
        }
    }

    public static void main(String[] args) {
        //예외(Exception) 처리
        //exceptionTest();

        MyThread th1 = new MyThread("서브 스레드1");
        MyThread th2 = new MyThread("서브 스레드2");

        th1.start(); //스레드를 시작시키는 메소드 ===> run()메소드가 자동으로 실행됨
        th2.start();

        for(int i=0; i<20; i++) {
            System.out.printf("[메인 스레드] : %d\n", i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("프로그램 정상 종료됨");
    }
}
