package javase02.task01;

public class Pen {
    String color;
    Integer size;

    Pen (String color, Integer size){
        this.color=color;
        this.size=size;
    }

    Pen (Pen obj) {
        color=obj.color;
        size=obj.size;
    }

    public boolean equals(Pen obj) {
        if ((obj.color.equals(color))&(obj.size.equals(size))) return true;
        else return false;
    }

    public int hashCode(Pen obj) {
        return obj.color.hashCode() + obj.size.hashCode();
    }

    public String toString(Pen obj) {
        return obj.getClass().getName() + '@'+ Integer.toHexString(obj.hashCode());
    }

    public static void main(String[] args) {
        Pen pen1 = new Pen("black", 2);
        Pen pen2 = new Pen(pen1);
        Pen pen3 = new Pen("white",1);
        System.out.println("pen1 and pen 2");
    }
}
