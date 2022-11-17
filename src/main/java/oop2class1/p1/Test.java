package oop2class1.p1;
import oop2class1.p1.Point;

public class Test {
    public static void main(String[] args) {
        Point p = new Point(0,0);
        p.setXY(3,4);
        System.out.print(p.getX());
//        System.out.print(p.x);
    }
}