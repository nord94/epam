package javase02.task03;

public class NewbieSet extends Chancellery{
    NewbieSet(){
        super();
        Chancellery[] chancelleries = new Chancellery[4];
        chancelleries[0] = new Eraser();
        chancelleries[1] = new BluePen();
        chancelleries[2] = new RedPen();
        chancelleries[3] = new GreenPen();
        System.out.println("Inside constructor");
    }

    public static void main(String[] args) {
        NewbieSet newbieSet = new NewbieSet();
        System.out.println();
    }
}
