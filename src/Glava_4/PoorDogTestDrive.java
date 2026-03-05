package Glava_4;

class PoorDog {
    private int size;
    private String name;
    public int getSize() {
        return size;
    }
    public String getName() {
        return name;
    }
}
public class PoorDogTestDrive {
    static void main(String[] args) {
        PoorDog one = new PoorDog();
        System.out.println("Размер собаки: " + one.getSize());
        System.out.println("Кличка собаки: " + one.getName());
    }
}