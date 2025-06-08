package cls;

import java.util.Arrays;

public class MyStack {
    private int [] arr; // 맴버변수
    private int count; //  배열의 길이를 저장하는 속성
    private int position;


    public MyStack() {
        arr = new int [5];
        count = 5;
        position = 0;
    }



    // int count를 매개변수로 받는 추가 생성자를 만드시오
    //arr배열을 count만큼의 길이를 갖도록 코드를 작성하시오

    public MyStack(int count) {
        arr = new int[ count ];
        //필드 카운트를 매개변수 카운트로 설정
        this.count = count;
    }

    //
    public int getCount() {
        return count;
    }

    //add
    public void add(int value){
        if (position > count-1){
            System.out.println("더이상 데이터를 추가할 수 없습니다");
            return;
        }

        arr[position++] = value; // arr의 position 위치에 value를 대입고 possition 1 증가 시킴
    }

    //pop
    public int pop(){
        if (position == 0){
            System.out.println("값을 가져올 수 없습니다");
            return 0;
        }
        return arr[--position];

    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public int getPosition() {
        return position;
    }
}
//클래스
//제목(문자열), 날짜(문자열), 내용(문자열)

//클래스
//직업(문자열), 스킬(문자열), hp(int), mp(int)

//직원 클래스를 만드세요
//Person 클래스로부터 상속받아서 만든다
//회사명(문자열), 직급(문자열), 부서(문자열)를 추가 필드로 정의하세요
//각각의 필드에 대해 setter 와 getter를 정의하세요
//introduce 메소드를 재정의(Override) 하야 이름 회사 부서 직급  순으로 출력오도록 정의

