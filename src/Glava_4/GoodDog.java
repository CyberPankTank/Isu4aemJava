package Glava_4;

class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Гав! Гав!");
        } else if (size > 14) {
            System.out.println("P-p-p! P-p-p!");
        } else {
            System.out.println("Тяв! Тяв!");
        }
    }
}
class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);

        System.out.println("Собака один: " + one.getSize());
        System.out.println("Собака два: " + two.getSize());

        one.bark();
        two.bark();
    }
}
