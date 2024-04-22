package study3;

public class BankAccountMain {

    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        ba.deposit(10000);
        ba.withdraw(3000);
        System.out.println(ba.getBalance());
    }
}
