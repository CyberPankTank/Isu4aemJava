package Glava_17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorrTestDrive {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> System.out.println("Верхняя часть стека"));
        System.out.println("Продолжаеться main");
        executor.shutdown();
    }
}
