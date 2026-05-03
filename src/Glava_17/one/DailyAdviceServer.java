package Glava_17.one;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.*;
import java.util.Random;

public class DailyAdviceServer {
    final private String[] adviceList = {
            "Бери больше, кидай дальше!",
            "Терпение и труд... Всё я устал!",
            "Сделал дело - гуляй смело.",
            "Пора домой!",
            "Гоу бухать?"
    };
    private final Random random = new Random();

    public void go() {
        try (ServerSocketChannel serverChannel = ServerSocketChannel.open()) {
            serverChannel.bind(new InetSocketAddress(5000));

            while (serverChannel.isOpen()) {
                SocketChannel clientChannel = serverChannel.accept();
                PrintWriter writer = new PrintWriter(Channels.newOutputStream(clientChannel));

                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    private String getAdvice() {
        int nextAdvice = random.nextInt(adviceList.length);
        return adviceList[nextAdvice];
    }

    public static void main(String[] args) {
        new DailyAdviceServer().go();
    }
}
