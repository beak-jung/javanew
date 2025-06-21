package thread;

public class MyBankRunnable implements Runnable{
    private  BankAccount account;

    public MyBankRunnable(BankAccount account) {
        this.account = account;
    }
    @Override
    public void run() {
        for(int i=0; i<20; i++)
            try {
                Thread.sleep(1);
                System.out.printf("[%s]출금 후 잔액 : %d\n", Thread.currentThread().getName(), account.getBalance());
                account.withdraw(200);
                System.out.printf("[%s]출금 후 잔액 : %d\n", Thread.currentThread().getName(), account.getBalance());

            } catch (InterruptedException e) {
                System.out.println( e.getMessage());
            }
    }
}
