package Glava_9;

public class Duck {
    int size;
    public Duck(int duckSize) {
        System.out.println("Кря");
        size = duckSize;
        System.out.println("Размер: " + size);
    }
    public void setSize(int newSize) {
        size = newSize;
    }
}
