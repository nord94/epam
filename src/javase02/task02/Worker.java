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
        for (int i=0;i<numberOfChancellery;i++){
            int code=-1;
            while (code!=-1){
                System.out.println("Enter: 1 - BluePen, 2 -");
            }
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
