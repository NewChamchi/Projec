package oop2class1;

public class Account2 {
    private int accountNumber;
    private long balance;
    private static int numberCounter = 0;
    {
        accountNumber = nextAccountNumber();
    }
    public Account2() {
    }

    public Account2 (long amount) {
        balance = amount;
    }

    private int nextAccountNumber() {
        numberCounter += 1;
        return numberCounter;
    }

}
