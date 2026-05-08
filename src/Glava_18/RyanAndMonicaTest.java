package Glava_18;

import java.util.concurrent.*;

public class RyanAndMonicaTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        RyanAndMonicaJob ryan = new RyanAndMonicaJob("Райан", account, 50);
        RyanAndMonicaJob monica = new RyanAndMonicaJob("Моника", account, 100);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(ryan);
        executor.execute(monica);
        executor.shutdown();
    }
}
class RyanAndMonicaJob implements Runnable {
    private final String name;
    private final BankAccount account;
    private final int amountSpend;
    RyanAndMonicaJob(String name, BankAccount account, int amountSpend) {
        this.name = name;
        this.account = account;
        this.amountSpend = amountSpend;
    }
    public void run() {
        goShopping(amountSpend);
    }
    private void goShopping(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(name + " собираеться платить");
            account.spend(amount);
            System.out.println(name + " заканчивает тратить");
        } else {
            System.out.println("Извините, соедств недостаточно, " + name);
        }
    }
}
class BankAccount {
    private int balance = 100;
    public int getBalance() {
        return balance;
    }
    public synchronized void spend(int amount) {
        balance = balance - amount;
        if (balance < 0) {
            System.out.println("Превышен лимит!");
        }
    }
}
