package Glava_17;

public class ThreadTestDrive {
    public static void main(String[] args) {
        Thread myThread = new Thread(() -> System.out.println("Верхняя часть стека"));
        myThread.start();
        System.out.println("Продолжаеться main");
    }
}
