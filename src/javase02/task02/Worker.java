package javase02.task02;

import java.util.Scanner;

public class Worker {
    String name;
    int numberOfChancellery;
    Chancellery[] chancelleries = new Chancellery[numberOfChancellery];
    static Scanner input = new Scanner(System.in);
    private int calculatePriceOfChancellery(Worker obj){
        int summ=0;
        for (int i =0;i<numberOfChancellery;i++) summ+=obj.chancelleries[i].price;
        return summ;
    }

    Worker(){
        System.out.print("Enter worker name: ");
        name=input.nextLine();
        System.out.print("\nEnter number of all chancellery: ");
        numberOfChancellery=input.nextInt();

    }

    void collectChancellery(Worker obj){
        Chancellery[] chancelleries1 = new Chancellery[5];
        chancelleries1[0]=new BluePen();
        chancelleries1[1]=new RedPen();
        chancelleries1[2]=new GreenPen();
        chancelleries1[3]=new BlackPencil();
        chancelleries1[4]=new WhitePencil();

        int overStep=0;
        for (int i=0;i<numberOfChancellery;i++){
            if (overStep==0){
                System.out.println("Enter: 1 - BluePen, 2 - GreenPen, 3 - RedPen" +
                        "4 - BlackPencil, 5 - WhitePencil");
                int itemIndex = input.nextInt();
                System.out.println("Now enter its quantity:");
                obj.chancelleries[i].number = input.nextInt();
                for (int j =0;j<obj.chancelleries[i].number;j++){
                    obj.chancelleries[i+j] = chancelleries1[itemIndex-1];
                    overStep=j;
                }

            }
            else {
                overStep--;
                continue;
            }
        }
    }

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.collectChancellery(worker);
    }
}