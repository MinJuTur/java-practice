package OPP_practice.OOP_4th;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("장민주", 10113, 10000);
        account.withdraw(4000);
        System.out.println(account);
        account.deposit(1000);
        System.out.println(account);
        account.withdraw(10000);
        System.out.println(account);
    }
}
