package Glava_17.one;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;

public class DailyAdviceClient {
    public void go() {
        InetSocketAddress serverAddress = new InetSocketAddress("127.0.0.1", 5000);
        try (SocketChannel socketChannel = SocketChannel.open(serverAddress)) {
            Reader channelReader = Channels.newReader(socketChannel, "Windows-1251");
            BufferedReader reader = new BufferedReader(channelReader);

            String advice = reader.readLine();
            System.out.println("Сегодняшний совет: " + advice);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new DailyAdviceClient().go();
    }
}
