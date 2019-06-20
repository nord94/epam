package javase02.task02;

public class Chancellery {
    int price;
    int number;
    boolean isUsesInk;
    boolean isUsesGraphite;
}

abstract class Pen extends Chancellery{
    Pen(){
        isUsesInk=true;
        isUsesGraphite=!isUsesInk;
    }
}

class RedPen extends Pen{
    RedPen(){
        price=115;
    }
}

class GreenPen extends Pen{
    GreenPen(){
        price=110;
    }
}

class BluePen extends Pen {
    BluePen(){
        price=90;
    }
}

abstract class Pencil extends Chancellery{
    Pencil(){
        isUsesGraphite=true;
        isUsesInk=!isUsesGraphite;
    }
}

class BlackPencil extends Pencil {
    BlackPencil(){
        price=50;
    }
}

class WhitePencil extends Pencil{
    WhitePencil(){
        price=60;
    }
}