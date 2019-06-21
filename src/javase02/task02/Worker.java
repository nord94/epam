package javase02.task02;

import java.util.Scanner;

public class Worker {
    String name;
    Chancellery[] chancelleries;
    int summ;
    static Scanner input = new Scanner(System.in);
    static Scanner inputNames = new Scanner(System.in);

    private void calculatePriceOfChancellery() {
        int summ = 0;
        for (int i = 0; i < chancelleries.length; i++) summ += chancelleries[i].price;
        this.summ = summ;
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
        index = 0;

        for (int i = 0; i < chancelleries.length; i++) {
            System.out.printf("Enter: 1 - BluePen(%d$), 2 - GreenPen (%d$), 3 - RedPen(%d$)" +
                            ", 4 - BlackPencil(%d$), 5 - WhitePencil(%d$)", allPossibleChancellery[0].price,
                    allPossibleChancellery[1].price, allPossibleChancellery[2].price, allPossibleChancellery[3].price,
                    allPossibleChancellery[4].price);
            index = input.nextInt();
            while ((index <= 0) | (index > 5)) {
                System.out.println("0 < x < 6");
                index = input.nextInt();
            }
            chancelleries[i] = allPossibleChancellery[index - 1];
        }
        calculatePriceOfChancellery();
    }

    public static void main(String[] args) {
        int numOfWorkers;
        System.out.println("Enter number of workers");
        numOfWorkers = input.nextInt();
        Worker[] workers = new Worker[numOfWorkers];
        for (int k = 0; k < workers.length; k++){
            System.out.println("Enter number of chancellery -> press 'Enter' -> Enter name");
            int numOfChancellery;
            numOfChancellery = input.nextInt();
            //String name = inputNames.nextLine();
            String name = input.nextLine(); //If ill use this, java will throw InputMismatchException
            workers[k]= new Worker(name,numOfChancellery);
            workers[k].collectChancellery();
            System.out.println(workers[k].summ);
        }


    }
}