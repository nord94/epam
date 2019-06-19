package javase02.task03;

abstract public class Chancellery {
    String function;
    int price;
}

class Eraser extends Chancellery{
    Eraser(){
        function="erase";
        price=10;
    }
}

abstract class Pen extends Chancellery{
    String color;
    Pen(){
        function="write";
    }
}

class BluePen extends Pen{
    BluePen(){
        color="blue";
        price=50;
    }
}

class RedPen extends Pen{
    RedPen(){
        color="red";
        price=60;
    }
}

class GreenPen extends Pen{
    GreenPen(){
        color="green";
        price=60;
    }
}

