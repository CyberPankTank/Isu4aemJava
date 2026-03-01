package Glava_1;

public class BottleSong {
    static void main(String[] args) {
        int bottlesNum = 10;
        String word = "бутылок";
        while (bottlesNum > 0) {
            if (bottlesNum == 1) {
                word = "бутылка";
            }
            System.out.println(bottlesNum + " зеленых " + word + ", на стене");
            System.out.println("И если одна бутылка случайно упадёт,");
            bottlesNum--;

            if (bottlesNum > 0) {
                System.out.println("Останеться " + bottlesNum + " зеленых " + word + ", на стене");
            } else {
                System.out.println("Не осталось зеленых бутылок");
            }
        }
    }
}
