package Glava_16;

import java.io.*;

public class GameSaverTest {
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50, "Эльф", new String[] {"лук", "меч", "пыльца"});
        GameCharacter two = new GameCharacter(200, "Троль", new String[] {"кулаки", "топор"});
        GameCharacter trhee = new GameCharacter(120, "Маг", new String[] {"заклинания", "невидимость"});

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("/home/cyberpanknout/IdeaProjects/Isu4aemJava/src/Resource/Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(trhee);
            os.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("/home/cyberpanknout/IdeaProjects/Isu4aemJava/src/Resource/Game.ser"));
            GameCharacter oneRestore = (GameCharacter) is.readObject();
            GameCharacter twoRestore = (GameCharacter) is.readObject();
            GameCharacter threeRestore = (GameCharacter) is.readObject();

            System.out.println("1: " + oneRestore.getType());
            System.out.println("2: " + twoRestore.getType());
            System.out.println("3: " + threeRestore.getType());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
