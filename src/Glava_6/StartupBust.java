package Glava_6;

import java.util.ArrayList;

public class StartupBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<Startup> startups = new ArrayList<Startup>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        Startup one = new Startup();
        one.setName("Поняшки");
        Startup two = new Startup();
        two.setName("Кодзи");
        Startup three = new Startup();
        three.setName("Таксисто");
        startups.add(one);
        startups.add(two);
        startups.add(three);

        System.out.println("Ваша цель - потопить три стартапа");
        System.out.println("Поняшки, Кодзи, Таксисто");
        System.out.println("Постарайтесь потопить за наименьшее количество ходов");

        for (Startup startup : startups) {
            ArrayList<String> new Location helper.plaseStartup(3);
            startup.setLocationCells(newLocation);
        }
    }
    private void startPlaying() {
        while (!startups.isEmpty()) {
            String userGuess = helper.getUserInput("Укажите клетку:");
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "мимо";

        for (Startup startupToTest : startups) {
            result = startupToTest.checkYourseIf(userGuess);

            if (result.equals("попал")) {
                break;
            }
            if (result.equals("потопил")) {
                startups.remove(startupToTest);
                break;
            }
        }
        System.out.println(result);
    }
    private void finishGame() {
        System.out.println("Все стартапы потоплены! Ваши акции теперь бесполезны!");
        if (numOfGuesses <= 18) {
            System.out.println("Вам понадобилось всего " + numOfGuesses + " попыток");
            System.out.println("Вы выбрались, пока ваши акции не пошли ко дну.");
        } else {
            System.out.println("Заняло слишком много времени. " + numOfGuesses + " попыток");
            System.out.println("Теперь рыбки танцуют с вашими стартапами");
        }
    }

    public static void main(String[] args) {
        StartupBust game = new StartupBust();
        game.setUpGame();
        game.startPlaying();
    }
}
