package Glava_16;

import java.io.*;

public class WriteAFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("/home/cyberpanknout/IdeaProjects/Isu4aemJava/src/Resource/foo.txt");
            writer.write("Привет чуваки!");
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
