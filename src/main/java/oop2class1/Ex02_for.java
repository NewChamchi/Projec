package oop2class1;

public class Ex02_for {
    public static final int INF = 999;
    public static void main(String[] args) {
        analysis(args);
    }

    static void analysis(String... a) {
        int sum = 0;
        int max = 0;
        int min = INF;
        float average = 0;
        for (int i =0; i < a.length; i++) {
            int value = Integer.parseInt(a[i]);
            sum += value;
            if (max < value) {
                max = value;
            }
            if (min > value) {
                min = value;
            }
            average = (float)sum / (float)a.length;
        }
        System.out.println("sum = " + sum);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("average = " + average);
    }
}
