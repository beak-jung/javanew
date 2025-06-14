package clsex;

//추상 클래스(abstract class)
public abstract class Animal  {

    private String name;

    //생성자(Constructor)
    public Animal(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    //추상 메소드
    public abstract void cry();

}

//animal 클래스를 상속하는 pig dog cat클래스를 만들고 cry를 각각구현하시오
