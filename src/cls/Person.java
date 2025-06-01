package cls;

//클래스 로보트의 설계도
// 클래스 구성 : 데이터 요소와 행위 요소(기능 요소) ==> 맴버
//맴버 변수 : 필드, Attridute
//맴버 함수 : method

//로봇 청소기 : 움직이기, 바퀴, 흡입기, 걸레, 닦기, 흡입

//접근 제한자 : 맴버를 선언 할 때 맨 처음에 붙어야 한다
//public : 완전공개 어디에서도 이 요소에 잡근할 수 있음
//private : 완전 비공개 해당 클래스 내부 요소에서만 잡근할 수 있음
//protected : 원칙은 비공개 상속받은 자식 클래스와 같은 패키지 다른 클래스 에서는 접근할 수 있음
//default : 원칙은 비공개 패키지 다른 클래스에서 접근할 수 있음

public class Person {

    //생성자|(Constructor)
    //모든 클래스를 하나 이상의 생성자를 갖는다
    //생성자를 정의 할 때에는 클래스 이름과 동일하게 만들어야한다

    //기본 생성자의 모양
    public Person() {
        name = "이름없음";
        age = 1;
        gender = "모름";
    }

    public Person(String name, int age) {
        //this 참조변수 자기자신을 가르키는 키워드
        this.name = name;
        gender = "모름";

        if( age > 0 )
        this.age = age;
    }


    //접근 제한자 데이타타입 변수명;
    private String name;
    private int age;
    private String gender;

    //person class의 기능 요소
    //반환형중에 void는 반환값을 없음을 의미한다
    public void introduce(){
        System.out.printf("안녕하세요, 저는 %s이고 , 나이는 %d이고 %s입니다\n", name, age, gender);
    }

    //메소드: 클래스의 기능을 정의
    // 접근제한자 반환형 메소드_이름([매개변수들...]) { 실행할 명령문들... }
    //반환형이 void가 아닌 메소드에서는 반드시 return을 이용하여 호출한쪽에 결과를 반환해 주어야한다
    //반드시 메소드의 반환형과 return 되는 자료형이 일치해야한다
    public int getAge() {
        return age;
    }

    public void increaseAge() {
        ++age;
    }

    public void decreaseAge() {
        --age;
    }

    // 성별 설정 : 성별은 문자열 "남자" 또는 "여자"로만 입력할 수 있다는 규칙을 정함
    public void setGender(String g) {
        if(g.equals("남자") || g.equals("여자"))
            gender = g;
        else
            System.out.println("성별은 남자 또는 여자로만 입력할 수 있습니다.");
    }


    //setName :이름을 설정하는 메소드를 만드세요
    //getName 이름을 외부에 반환하는 메소드를 만드세요
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("이름 %s 나이 %d 성별 %s", name, age, gender);
    }
}
