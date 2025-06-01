package cls;

public class BankTest {
    public static void main(String[] args) {
        BankAccount m1 = new BankAccount(1000);
        m1.deposit(1000);
        m1.withdraw(2000);
        m1.withdraw(1000);
    }
}
