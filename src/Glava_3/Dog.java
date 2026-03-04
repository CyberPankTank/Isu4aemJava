package Glava_3;

class Dog {
    String name;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Барт";

        Dog[] myDog = new Dog[3];
        myDog[0] = new Dog();
        myDog[1] = new Dog();
        myDog[2] = dog1;

        myDog[0].name = "Фред";
        myDog[1].name = "Мардж";

        System.out.print("Имя последней собаки: ");
        System.out.println(myDog[2].name);

        int x = 0;
        while (x < myDog.length) {
            myDog[x].bark();
            x = x + 1;
        }
    }
    public void bark() {
        System.out.println(name + " говорит : Гав!");
    }
    public void eat(){

    }
    public void chaseCat(){

    }
}
