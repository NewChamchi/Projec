package oop3class2;
import java.io.*;
import oop2class1.bank.Owner;

public class Account implements Serializable {
    private long accountNumber;
    private long balance;
    private static long lastAccountNumber = 0;


    Account(long amount) {
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
    }

}
