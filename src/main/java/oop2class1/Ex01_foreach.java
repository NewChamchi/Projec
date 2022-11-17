package oop2class1;
public class Ex01_foreach {
    public static final int INF = 999;
    public static void main(String[] args) {
        analysis(11,22,33);
        analysis(11,22,33,44,55);
        int[] scores1 = {11,22,33,44};
        analysis(scores1);
        int[] scores2 = {11,22,33,44,55,66};
        analysis(scores2);
    }

    static void analysis(int... a) {
        int sum = 0;
        int max = 0;
        int min = INF;
        float average = 0;
        for (int x: a) {
            sum += x;
            if (max < x) {
                max = x;
            }
            if (min > x) {
                min = x;
            }
            average = (float)sum / (float)a.length;
        }
        System.out.println("sum = " + sum);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("average = " + average);
    }
}
