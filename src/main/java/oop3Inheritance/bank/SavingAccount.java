package oop3Inheritance.bank;

public class SavingAccount implements IAccount {

    private int accountNumber;
    private int balance;
    private static long lastAccountNumber = 0;

    SavingAccount(int amount) {
        balance = amount;
    }

    public int getAccNum() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("입금 금액 : " + amount);
        System.out.println("계좌 잔액 : " + balance);
    }

    public void withdraw(int amount) {
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
    }
}
