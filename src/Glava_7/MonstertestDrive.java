package Glava_7;

public class MonstertestDrive {
    public static void main(String[] args) {
        Monster[] monsters = new Monster[3];
        monsters[0] = new Vampire();
        monsters[1] = new Dragon();
        monsters[2] = new Monster();
        for (int i = 0; i < monsters.length; i++) {
            monsters[i].frighten(i);
        }
    }
}
class Monster {
    boolean frighten(int d) {
        System.out.println("apppp");
        return true;
    }
}
class Vampire extends Monster {
    boolean frighten(int x) {
        System.out.println("укусить?");
        return false;
    }
}
class Dragon extends Monster {
    boolean frighten(int degree) {
        System.out.println("пыхнуть огнем");
        return false;
    }
}
