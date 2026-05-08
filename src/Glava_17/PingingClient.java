package Glava_17;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.*;
import java.time.format.FormatStyle;
import java.util.concurrent.TimeUnit;

import static java.nio.charset.StandardCharsets.*;
import static java.time.LocalDateTime.now;
import static java.time.format.DateTimeFormatter.ofLocalizedTime;

public class PingingClient {
    public static void main(String[] args) {
        InetSocketAddress server = new InetSocketAddress("127.0.0.1", 5000);
        try (SocketChannel channel = SocketChannel.open(server)) {
            PrintWriter writer = new PrintWriter(Channels.newWriter(channel, "Windows-1251"));
            System.out.println("Подключение установлено");
            for (int i = 0; i < 10; i++) {
                String message = "ping " + i;
                writer.println(message);
                writer.flush();
                String currentTime = now().format(ofLocalizedTime(FormatStyle.MEDIUM));
                System.out.println(currentTime + " Отправлено:  " + message);
                TimeUnit.SECONDS.sleep(1);
            }
        }catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
