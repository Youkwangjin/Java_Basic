package study3;

public class BankAccount {

    // 데이터 필드는 외부에 직접 노출하지 않는다. BankAccount가 제공하는 메서드를 통해서만 접근이 가능하다.
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    // public method : deposit(입금)
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
            System.out.println(amount + "원 입금되었습니다.");
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // public method : withdraw(출금)
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
            System.out.println(amount + "원 출금되었습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
        
    }
    
    // 잔액조회
    public int getBalance() {
        return balance;
    }

    // 입력 금액
    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함
        return amount > 0;
    }
}
