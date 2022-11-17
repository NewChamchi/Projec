package oop3Inheritance;

class Child extends Parent {
    static void who() { System.out.println("Child’s static who"); }	// 숨김
    void show() { System.out.println("Child’s instance show"); } 	// 재정의
}
