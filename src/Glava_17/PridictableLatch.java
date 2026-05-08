package Glava_17;

import java.util.concurrent.*;

public class PridictableLatch {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        CountDownLatch latch = new CountDownLatch(1);
        executor.execute(() -> waitForLatchPrint(latch));
        System.out.println("продолжаеться в main");
        latch.countDown();
        executor.shutdown();
    }
    private static void waitForLatchPrint(CountDownLatch latch) {
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("в верхней части стека");
    }
}
