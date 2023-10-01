package org.chirvascristina.zooclubservice;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("The cat " + getName() + " says: Meow!");
    }

    public void eat() {
        System.out.println(getName() + " is eating fish!");
    }
}
