package oop3Inheritance.bank;

public interface IAccount {
    public int getAccNum();
    public int getBalance();
    public void deposit(int amount);
    public void withdraw(int amount);

    public void showAccount();
}
