package Glava_11;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics1 {
    public static void main(String[] args) {
        List<Animal> animals = List.of(new Dog(), new Cat(), new Dog());
        takeAnimals(animals);
    }
    public static void takeAnimals(List<Animal> animals) {
        for (Animal a : animals) {
            a.eat();
        }
    }
}
