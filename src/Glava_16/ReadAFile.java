package Glava_16;

import java.io.*;

public class ReadAFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("/home/cyberpanknout/IdeaProjects/Isu4aemJava/src/Resource/MyText.txt");
            FileReader fileReader = new FileReader(myFile);

            BufferedReader reader = new BufferedReader(fileReader);

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
