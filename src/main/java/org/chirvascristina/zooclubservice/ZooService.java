package org.chirvascristina.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Baical");

        Cat cat1 = new Cat("Sonic");

        Dog dog2 = new Dog("Laika");

        dog1.eat();
        dog1.makeSound();

        System.out.println();
        dog2.eat();
        dog2.makeSound();

        System.out.println();
        cat1.makeSound();
        cat1.eat();
    }


}
