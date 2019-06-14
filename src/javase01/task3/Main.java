package javase01.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double step = input.nextDouble();
        for (int i = 0; a<b;i++) {
            System.out.printf("%d   %2.1f   %f %n", i, a, Math.atan(a));
            a+=(double) step;
        }
    }
}
