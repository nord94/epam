package javase01.task04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 0;
        size = input.nextInt();
        int[] a = new int[4];
        for (int i =0; i<size; i++) {
            a[i] = input.nextInt();
        }
        int max =0;
        int summ =0;
        for (int i=0;i<size/2;i++){
            summ = a[i]+a[size-i-1];
            if (summ>max) max = summ;
        }
        System.out.println(max);
    }
}
