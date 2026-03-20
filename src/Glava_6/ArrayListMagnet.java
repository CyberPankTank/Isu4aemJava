package Glava_6;

import java.util.ArrayList;

public class ArrayListMagnet {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add(0, "ноль");
        a.add(1, "один");
        a.add(2, "два");
        a.add(3, "три");
        printList(a);
        if (a.contains("три")) {
            a.add("четыре");
        }
        a.remove(2);
        printList(a);
        if (a.indexOf("четыре") != 4) {
            a.add(4, "4.2");
        }
        printList(a);
        if (a.contains("два")){
            a.add("2.2");
        }
        printList(a);
    }
    public static void printList(ArrayList<String> list) {
        for (String element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
