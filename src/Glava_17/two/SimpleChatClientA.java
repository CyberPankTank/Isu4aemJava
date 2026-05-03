package Glava_17.two;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.*;
import static java.nio.charset.StandardCharsets.*;

public class SimpleChatClientA {
    private JTextField outgoing;
    private PrintWriter writer;

    public void go() {
        setUpNetworking();

        outgoing = new JTextField(20);

        JButton sendButton = new JButton("Отправить");
        sendButton.addActionListener(e -> sendMessage());

        JPanel mainPanel = new JPanel();
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        JFrame frame = new JFrame("Наипростейший чат-клиент");
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(400, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    private void setUpNetworking() {
        try {
            InetSocketAddress serverAddress = new InetSocketAddress("127.0.0.1", 5000);

            SocketChannel socketChannel = SocketChannel.open(serverAddress);
            writer = new PrintWriter(Channels.newWriter(socketChannel, "Windows-1251"));
            System.out.println("Подключение установлено");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void sendMessage() {
        writer.println(outgoing.getText());
        writer.flush();
        outgoing.setText("");
        outgoing.requestFocus();
    }

    public static void main(String[] args) {
        new SimpleChatClientA().go();
    }
}
