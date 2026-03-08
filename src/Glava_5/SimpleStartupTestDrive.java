package Glava_5;

public class SimpleStartupTestDrive {
    public static void main(String[] args) {
        SimpleStartup dot = new SimpleStartup();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        int userGuess = 2;
        String result = dot.checkYourseIf(userGuess);
        String testResult = "провален";
        if (result.equals("попал")) {
            testResult = "пройден";
        }
        System.out.println(testResult);
    }
}

