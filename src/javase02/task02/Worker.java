package javase02.task02;

import java.util.Scanner;

public class Worker {
    String name;
    int numberOfChancellery;
    Chancellery[] chancelleries;
    static Scanner input = new Scanner(System.in);

    private int calculatePriceOfChancellery(Worker obj) {
        int summ = 0;
        for (int i = 0; i < numberOfChancellery; i++) summ += obj.chancelleries[i].price;
        return summ;
    }

    Worker(String name, int number) {
        this.name = name;
        chancelleries = new Chancellery[number];
    }

    void collectChancellery() {
        Chancellery[] allPossibleChancellery = new Chancellery[5];
        allPossibleChancellery[0] = new BluePen();
        allPossibleChancellery[1] = new RedPen();
        allPossibleChancellery[2] = new GreenPen();
        allPossibleChancellery[3] = new BlackPencil();
        allPossibleChancellery[4] = new WhitePencil();

        int overStep = 0;
        /*
        In this cycle i'm filling 'chancelleries' for Worker with elements from
        all allPossibleChancellery.
        I used 'overStep'-variable to skip elements in Worker's chancellery that are  filled with similar object.
         */
        for (int i = 0; i < numberOfChancellery; i++) {
            if (overStep == 0) {
                System.out.println("Enter: 1 - BluePen, 2 - GreenPen, 3 - RedPen" +
                        "4 - BlackPencil, 5 - WhitePencil");
                int itemIndex = input.nextInt();
                System.out.println("Now enter its quantity:");
                chancelleries[i].number = input.nextInt();
                for (int j = 0; j < chancelleries[i].number; j++) {
                    chancelleries[i + j] = allPossibleChancellery[itemIndex - 1];
                    overStep = j;
                }

            } else {
                overStep--;
                continue;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter name -> press 'Enter' -> enter number of chancellery");
        Worker worker = new Worker(input.nextLine(), input.nextInt());
        worker.collectChancellery();
    }
}