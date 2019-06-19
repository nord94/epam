package javase02.task02;

public abstract class Chancellery {
    int price;
}

abstract class Pen extends Chancellery{

}

class RedPen extends Pen{
    RedPen(int price){
        price=100;
    }
}

class GreenPen extends Pen{
    GreenPen(int price){

    }
}

