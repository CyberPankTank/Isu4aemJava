package Glava_2;

class DrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playSnare() {
        System.out.println("бум-бум ба-бум");
    }

    void playTopHat() {
        System.out.println("динь-динь да-динь");
    }


}
class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.playTopHat();
        d.snare = false;
        if (d.snare == true) {
            d.playSnare();
        }
    }
}
