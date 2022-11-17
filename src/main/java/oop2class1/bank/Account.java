package oop2class1.bank;

public class Account {
    private long accountNumber;
    private long balance;
    private Owner owner;
    private static long lastAccountNumber = 0;

    Account(Owner owner) {
        this.owner = owner;
    }

    Account(Owner owner, long amount) {
        this.owner = owner;
        balance = amount;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(long amount) {
        balance += amount;
        System.out.println("입금 금액 : " + amount);
        System.out.println("계좌 잔액 : " + balance);
    }

    public void withdraw(long amount) {
        if (balance < amount) {
            System.out.println("출금 금액이 계좌 금액을 초과");
        } else {
            balance -= amount;
            System.out.println("출금 금액 : " + amount);
            System.out.println("계좌 잔액 : " + balance);
        }

    }

    public void showAccount() {
        System.out.println("accountNumber = " + accountNumber);
        System.out.println("balance = " + balance);
        showOwner();
    }

    public void showOwner() {
        owner.showOwner();
    }
}
