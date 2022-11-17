package oop3class2;
import java.io.*;

public class ObjectReadTest {
    public static void main(String[] args) {

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("account.dat"));
            Account account = (Account)in.readObject();
            account.showAccount();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
