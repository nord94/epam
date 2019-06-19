package javase02.task02;

import java.util.Scanner;

public class Worker {
    String name;
    int numberOfChancellery;
    Chancellery[] chancelleries = new Chancellery[numberOfChancellery];
    static Scanner input = new Scanner(System.in);
    private int calculatePriceOfChancellery(Chancellery[] obj){
        return 100;
    }

    Worker(){
        System.out.print("Enter worker name: ");
        name=input.nextLine();
        System.out.print("\nEnter number of chancellery: ");
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
                int code=-1;
                while (code!=-1){
                    System.out.println("Enter: 1 - BluePen, 2 - GreenPen, 3 - RedPen" +
                            "4 - BlackPencil, 5 - WhitePencil");
                    int itemIndex = input.nextInt();
                    System.out.println("Now enter its quantity:");
                    for (int j =0;j<input.nextInt();j++){
                        chancelleries[i+j] = chancelleries1[itemIndex];
                        overStep=j;
                    }
                }
            }
            else continue;

        }
    }

    public static void main(String[] args) {

        int code=-1;
        while (code!=-1){
            System.out.print("Enter name of Worker:");
            Worker worker = new Worker();
        }
    }
}
