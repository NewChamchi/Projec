package oop2class1;

public class Account1 {
    private int accountNumber;
    private long balance;
    private static int numberCounter = 0;
    public Account1() {
        accountNumber = nextAccountNumber();
    }

    public Account1(long amount) {
        this();
        balance = amount;
    }

    private int nextAccountNumber() {
        numberCounter += 1;
        return numberCounter;
    }

}
