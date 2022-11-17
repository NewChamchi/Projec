package oop3class2;

public class TestOfEnum02 {
    public static void main(String[] args) {
        for (Season s: Season.values())
            System.out.println(s.getSpan());
    }
}
