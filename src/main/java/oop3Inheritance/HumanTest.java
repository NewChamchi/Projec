package oop3Inheritance;

public class HumanTest {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.eat();
        h1.think();

        IAnimal h2 = new Human();
        h2.eat();
//        h2.think();
    }
}
