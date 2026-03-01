package Glava_2;

class Episode {
    int seriesNumber;
    int episodeNumber;

    void skipIntro() {
        System.out.println("Пропускаем заставку...");
    }
    void skipToText() {
        System.out.println("Загружаем следующий эпизод...");
    }
}
class EpisodeTestDrive {
    public static void main(String[] args) {
        Episode episode = new Episode();
        episode.seriesNumber = 4;
        episode.skipIntro();
        episode.skipToText();
    }
}