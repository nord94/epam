package javase02.task03;

public class NewbieSet extends Chancellery {
    Chancellery[] chancelleries = new Chancellery[4];

    NewbieSet() {
        super();
        chancelleries[0] = new Eraser();
        chancelleries[1] = new BluePen();
        chancelleries[2] = new RedPen();
        chancelleries[3] = new GreenPen();
        System.out.println("Inside constructor");
    }

    int summPrice() {
        int summ;
        summ = 0;
        for (Chancellery x : chancelleries) summ+=x.price;
            return summ;
    }

    public static void main(String[] args) {
        NewbieSet newbieSet = new NewbieSet();
    }
}
