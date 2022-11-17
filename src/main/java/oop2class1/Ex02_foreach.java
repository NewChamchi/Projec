package oop2class1;

public class Ex02_foreach {
    public static final int INF = 999;
    public static void main(String[] args) {
        analysis(args);
    }

    static void analysis(String... a) {
        int sum = 0;
        int max = 0;
        int min = INF;
        float average = 0;
        for (String x : a) {
            int value = Integer.parseInt(x);
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
