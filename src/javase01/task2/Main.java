package javase01.task2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = 0.5;
        double i=0;
        b = 1/((i+1)*(i+1));
        while (a<b){
            b = 1/((i+1)*(i+1));
            System.out.println(b);
            i++;
            if (a>b) System.out.println("element number - " + i);
        }
    }
}
