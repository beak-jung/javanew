package basic;

public class Controlstmt {
    public static void main(String[] args) {
        //if 문
        /*

        if (조건식, 논리식) {
        조건식 논리식이 참인 경우 실행되는 명령문들
        }

        if(조건식, 논리식){

        }else{
        조건식이 거짓일때 실행되는 명령문
        }
         */

        Scanner sc = new Scanner(System.in);
        int age = 0;
        System.out.print("나이를 입력하세요");
        age = sc.nextInt();

        if(age > 10){
            System.out.println("당신은 성인입니다");
        }else{
            System.out.println("당신은 성인이 아닙니다");
        }
        sc.close();
    }
}
