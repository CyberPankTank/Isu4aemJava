package Glava_2;

class StreamingSong {
    String title;
    String artist;
    int duration;

    void play() {
        System.out.println("Играет песня");
    }
    void printDetails() {
        System.out.println("Это " + title + " в исполнении " + artist);
    }
}
class StreimingSongTestDrive {
    public static void main(String[] args) {
        StreamingSong song = new StreamingSong();
        song.artist = "The Beatles";
        song.title = "Come Together";
        song.play();
        song.printDetails();
    }
}
