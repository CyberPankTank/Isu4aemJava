package Glava_10;

class Player {
    static int playerCount = 0;    //Можно и без = 0... 0 ставиться по умолчанию
    private String name;
    public Player(String n) {
        name = n;
        playerCount++;
    }
}
public class PlayerTestDrive {
    public static void main(String[] args) {
        System.out.println(Player.playerCount);
        Player one = new Player("Tiger woods");
        System.out.println(Player.playerCount);
    }
}
