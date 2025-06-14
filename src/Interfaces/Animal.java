package Interfaces;

//추상 메소드들로만 구성된 특별한 클래스 ===> 인터페이스
public interface Animal {
    public static final String name = "동물"; //공개된 공통의 상수만 속성으로 가질 수 있다!!!

    public void cry();
    public void go();
}
