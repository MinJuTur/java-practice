package OPP_practice.OOP_4th;

public class BankAccount {
    private String owner;
    private int accountNumber;
    private int balance;

    public BankAccount(String owner, int accountNumber, int balance) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액이 부족합니다.");
        } else {
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "현재 잔액은 " + balance;
    }
}
