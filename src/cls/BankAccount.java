package cls;

public class BankAccount {
    public BankAccount() {
        money = 0;
    }
    private int money;

    public BankAccount(int money) {
        this.money = money;
    }

    //외부에서 접근 가능한 view라는 메소드를 작성하세요
    //반환값 없음, 매개변수 없음
    //외부에서 view를 호출하면 다음과 같은 결과를 호출해야 합니다.
    //Balance : xxxxx원
    public void view() {
        System.out.printf("Balance : %d원\n", money);
    }

    //외부에서 접근 가능한 deposit라는 메소드를 만드시오
    // 반환값 없음 , 매개변수 money이고
    // 필드 money의 값은 매개변수 money의 값을 누적 시킵니다.
    //deposit : xxxxx원
    //Balance : xxxxx원
    public void deposit(int money) {
        this.money += money;
        System.out.printf("deposit : %d원\n", money);
        view();
    }
}
