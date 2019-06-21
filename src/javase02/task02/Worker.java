package javase02.task02;

import java.util.Scanner;

public class Worker {
    String name;
    Chancellery[] chancelleries;
    int summ;
    static Scanner input = new Scanner(System.in);

    private void calculatePriceOfChancellery() {
        int summ = 0;
        for (int i = 0; i < chancelleries.length; i++) summ += chancelleries[i].price;
        this.summ=summ;
    }

    Worker(String name, int number) {
        this.name = name;
        chancelleries = new Chancellery[number];
    }

    void collectChancellery() {
        int index;
        Chancellery[] allPossibleChancellery = new Chancellery[5];
        allPossibleChancellery[0] = new BluePen();
        allPossibleChancellery[1] = new GreenPen();
        allPossibleChancellery[2] = new RedPen();
        allPossibleChancellery[3] = new BlackPencil();
        allPossibleChancellery[4] = new WhitePencil();
        index=0;
        /*
        In this cycle i'm filling 'chancelleries' for Worker with elements from
        all allPossibleChancellery.
        I used 'overStep'-variable to skip elements in Worker's chancellery that are  filled with similar object.
         */
        for (int i = 0; i < chancelleries.length; i++) {
            System.out.printf("Enter: 1 - BluePen(%d$), 2 - GreenPen (%d$), 3 - RedPen(%d$)" +
                    ", 4 - BlackPencil(%d$), 5 - WhitePencil(%d$)", allPossibleChancellery[0].price,
                    allPossibleChancellery[1].price, allPossibleChancellery[2].price, allPossibleChancellery[3].price,
                    allPossibleChancellery[4].price);
            index= input.nextInt();
            while ((index<=0)|(index>5)){
                System.out.println("0 < x < 6");
                index= input.nextInt();
            }
            chancelleries[i] = allPossibleChancellery[index - 1];
        }
        calculatePriceOfChancellery();
    }

    public static void main(String[] args) {
        System.out.println("Enter name -> press 'Enter' -> enter number of chancellery");
        String name = input.nextLine();
        int numOfChancellery = input.nextInt();
        Worker worker = new Worker(name, numOfChancellery);
        worker.collectChancellery();
        System.out.println(worker.summ);
    }
}