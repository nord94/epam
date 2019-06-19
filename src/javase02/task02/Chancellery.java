package javase02.task02;

public abstract class Chancellery {
    int price;
}

abstract class Pen extends Chancellery{

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