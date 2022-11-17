package oop2class1;

public class Triangle {

    public float findArea(int a, int h) {
        return a * h / 2;
    }

    public float findArea(int a, int b, int c) {
        float s = (a + b + c) / 2;
        return (float)Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
