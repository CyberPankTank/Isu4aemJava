package Glava_10;

import java.text.Format;

public class TestFormat {
    public static void main(String[] args) {
        long myBillion = 1000000000;
        String s = String.format("%,d", myBillion);
        System.out.println(s);
    }
}
