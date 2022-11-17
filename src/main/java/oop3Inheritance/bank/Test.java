package oop3Inheritance.bank;

import oop2class1.bank.Account;
import oop2class1.bank.Owner;

public class Test {
    public static void main(String[] args) {
        SavingAccount account = new SavingAccount(50000);
        account.showAccount();
        account.deposit(10000);
        account.showAccount();
        account.withdraw(1000000);
        account.showAccount();
        account.withdraw(20000);
        account.showAccount();
    }
}
