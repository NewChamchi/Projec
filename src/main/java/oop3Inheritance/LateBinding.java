package oop3Inheritance;

public class LateBinding { // Dynamic binding
    public static void main(String[] args) {
        System.out.println("Child c = new Child: ");
        Child c = new Child(); c.who(); c.show();

        System.out.println("Parent p = new Child: ");
        Parent p = new Child(); p.who(); p.show();

        System.out.println("Child c2 = new Child - (Parent)c2:  ");

        Child c2 = new Child(); ((Parent)c2).who(); ((Parent)c2).show();
    }
}
