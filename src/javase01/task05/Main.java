package javase01.task05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 0;
        size = input.nextInt();
        for (int i =0;i<size;i++){
            for (int j = 0;j<size;j++){
                System.out.print(i==j | i+j==size-1 ? "1 ":"0 ");
                if (j==size-1) System.out.print("\n");
            }
        }
    }
}
