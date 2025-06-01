package cls;

//필드 : 맴버 변수 정수형으로 hp, power
//메소드 : 맴버 함수
//매개변수,(paramter, Argument, 인수, 인자) : 메소드에서 외부부터 주어지는 입력값으로 초기화 되는 변수
//매개변수가 정의되는 곳은 메소드명([매개변수들])

//Marine : steampack
//Tank :

public class MyUnit {
    private int hp;
    private int power;
    private String name;

    // hp는100 power는 100으로 설정하는 기본 생성자를 만드세요
    public MyUnit() {
        hp = 100;
        power = 100;
    }

    //외부로부터 hp와 power를 입력받아서 맴버 hp와 power를 설정하는 생성자

    public MyUnit(String name, int hp, int power ) {
        this.name = name;
        this.hp = hp;
        this.power = power;

    }

    //외부에서 호출 가능
    //반환값이 없는 메소드를 damage를 만드세요
    // 매개변수로 power가 주어지고
    //매개 변수 hp를 매개 변수 power만큼 차감합니다
    // hp에서 power를 차감한 값이 음수이면 hp 를 0으로 만듭니다
    public void damage(int power) {
        hp -= power;
        if ( hp< 0 )
            hp = 0;
    }

    public void attack(MyUnit target) {
        target.damage(power);
    }

    //hp와 power을 출력하는 메소드 info를 만드세요
    public void info() {
        System.out.printf("[%s] hp가 %d  power %d \n", name, hp, power );
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
