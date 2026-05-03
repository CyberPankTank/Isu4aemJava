package Glava_17.two;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.*;
import java.util.*;
import java.util.concurrent.*;

import static java.nio.charset.StandardCharsets.*;

public class SimpleChatServer {
    private final List<PrintWriter> clientWriters = new ArrayList<>();

    public static void main(String[] args) {
        new SimpleChatServer().go();
    }
    public void go() {
        ExecutorService threeadPool = Executors.newCachedThreadPool();
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.bind(new InetSocketAddress(5000));

            while (serverSocketChannel.isOpen()) {
                SocketChannel clientSocket = serverSocketChannel.accept();
                PrintWriter writer = new PrintWriter(Channels.newWriter(clientSocket, "Windows-1251"));
                clientWriters.add(writer);
                threeadPool.submit(new ClientHandler(clientSocket));
                System.out.println("Подключение выполнено.");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    private void tellEveryone(String message) {
        for (PrintWriter writer : clientWriters) {
            writer.println(message);
            writer.flush();
        }
    }
    public class ClientHandler implements Runnable {
        BufferedReader reader;
        SocketChannel socket;

        public ClientHandler(SocketChannel clientSocket) {
            socket = clientSocket;
            reader = new BufferedReader(Channels.newReader(socket, "Windows-1251"));
        }
        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    System.out.println("Прочитано: " + message);
                    tellEveryone(message);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
