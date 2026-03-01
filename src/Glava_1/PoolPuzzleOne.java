package Glava_1;

public class PoolPuzzleOne {
    public static void main() {
        int x = 0;
        while (x < 4) {
            System.out.println("я");
            if (x < 1) {
                System.out.print(" ");
            }
            System.out.print("ты");
            if (x > 1) {
                System.out.print(" монстр");
                x = x + 2;
            }
            if (x == 1) {
                System.out.println("шум");
            }
            if (x < 1) {
                System.out.println("ус");
            }
            System.out.println();
            x = x + 1;
        }
    }
}
