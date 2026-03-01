package Glava_1;

public class Loopy {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Перед циклом");
        while (x < 4) {
            System.out.println("В цикле");
            System.out.println("Значение х равно " + x);
            x = x + 1;
        }
        System.out.println("После цикла");
    }
}
