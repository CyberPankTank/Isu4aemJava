package Glava_9;

public class Duck {
    private int kilos = 6;
    private float floatability = 2.1F;
    private String name = "Generic";
    private long[] feathers = {1, 2, 3, 4, 5, 6, 7};
    private boolean canFly = true;
    private int maxSpeed = 25;

    public Duck() {
        System.out.println("тип 1 утки");
    }
    public Duck(boolean fly) {
        canFly = fly;
        System.out.println("тип 2 утки");
    }
    public Duck(String n, long[] f) {
        name = n;
        feathers = f;
        System.out.println("тип 3 утки");
    }
    public Duck(int w, float f) {
        kilos = w;
        floatability = f;
        System.out.println("тип 4 утки");
    }
    public Duck(float density, int max) {
        floatability = density;
        maxSpeed = max;
        System.out.println("тип 5 утки");
    }
}
