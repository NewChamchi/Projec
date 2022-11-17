package oop3class2;
import java.io.*;
public class ObjectWriteTest {
    public static void main(String[] args) {
        Account account = new Account(50000);
        account.withdraw(10000);
        account.deposit(20000);
        account.withdraw(10000);
        account.deposit(20000);
        account.withdraw(10000);
        account.deposit(20000);
        account.showAccount();
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("account.dat"));
            out.writeObject(account);
            out.flush();
            out.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
