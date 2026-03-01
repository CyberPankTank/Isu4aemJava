package Glava_2;

class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Воспроизводиться фильм");
    }
}
public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Унесенные акциями";
        one.genre = "Трагедия";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Затерянные в офисном пространстве";
        two.genre = "Комедия";
        two.rating = 5;

        Movie three = new Movie();
        three.title = "Клуб байтов";
        three.genre = "Трагичный, но в итоге вдохновляющий";
        three.rating = 127;
    }
}