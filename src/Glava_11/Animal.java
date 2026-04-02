package Glava_11;

abstract class Animal {
    void eat() {
        System.out.println("Кошачья хавка");
    }
}
class Dog extends Animal {
    void bark() { }
}
class Cat extends Animal {
    void bark() { }
}
