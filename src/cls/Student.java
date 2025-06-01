package cls;

public class Student extends Person {
    private String school;
    private int grade;

    //생성자 : 이름 나이 성별 학교
    //grade는 무조건 1로 설정

    public Student(String name, int age, String gender, String school){
        super(name, age);
        setGender(gender); //person에

        this.school = school;
        grade = 1;
    }

    @Override  //해당 메소드를 재정의 메소드 오버라이드
    public void introduce() {
        super.introduce(); // 부모클래스에서 정의 된 introduce
        System.out.printf("학교는 %s에 다니고 있습니다\n", school);
    }
}
