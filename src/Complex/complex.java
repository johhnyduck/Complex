package Complex;

import javax.swing.*;

public class complex {
    public static void main(String[] args) {

        int i = 0;

        Box box = new Box();
        box.width = 10;
        System.out.println(box.width);

        Box largeBox = new Box();
        largeBox.height = 100;
        largeBox.length = 20;
        largeBox.width = 30;

        System.out.println(box.width);

        System.out.println(largeBox.height);
        System.out.println(largeBox.length);
        System.out.println(largeBox.width);

        String string = "This is a String";
        String string2 = "";
        String string3 = new String();
    }
}

class Box {
    int width;
    int height;
    int length;
}