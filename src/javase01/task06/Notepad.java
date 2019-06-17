package javase01.task06;

import java.util.Scanner;

public class Notepad {
    static Scanner input = new Scanner(System.in);
    Record[] records;
    public void addRecord(){

    }

    public void deleteRecord(){

    }

    public void showInfoMessage(){
        System.out.println("1 - Add record; 2 - Delete record;" +
                "\n3 - Change record; 4 - Show all records; 0 - Exit");
    }

    public static void main(String[] args) {
        int code=-1;
        Notepad notepad = new Notepad();
        String[] records = new String[0];
        while(code!=0) {
            notepad.showInfoMessage();
            code = input.nextInt();

        }

    }
}
