package Glava_5;

class SimpleStartup {
    private int[] locationCells;
    private int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }
    public  String checkYourseIf(int guess) {
        String result = "мимо";
        for(int cell : locationCells) {
            if (guess == cell) {
                result = "попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "потопил";
        }
        System.out.println(result);
        return result;
    }
}
