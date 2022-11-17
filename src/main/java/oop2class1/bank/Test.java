package oop2class1.bank;

public class Test {
    public static void main(String[] args) {
        Owner owner = new Owner("kim", "seoul", "010-1111-1111");
        Account account = new Account(owner, 50000);
        owner.showOwner();
        owner.setAddress("jeju");
        owner.setPhone("010-2222-2222");
        owner.showOwner();
        account.showAccount();
        account.deposit(10000);
        account.showAccount();
        account.withdraw(1000000);
        account.showAccount();
        account.withdraw(20000);
        account.showAccount();
    }
}
