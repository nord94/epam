package javase02.task03;

public class Chancellery {
    String function;
    int price;
    String name;
}

class Eraser extends Chancellery {
    Eraser() {
        super();
        name = "eraser";
        function = "erase";
        price = 10;
    }
}

abstract class Pen extends Chancellery {
    String color;

    Pen() {
        super();
        function = "write";
    }
}

class BluePen extends Pen {
    BluePen() {
        name = "bluepen";
        color = "blue";
        price = 50;
    }
}

class RedPen extends Pen {
    RedPen() {
        super();
        name = "redpen";
        color = "red";
        price = 60;
    }
}

class GreenPen extends Pen {
    GreenPen() {
        super();
        name = "greenpen";
        color = "green";
        price = 60;
    }
}

