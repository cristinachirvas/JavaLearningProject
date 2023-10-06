package org.chirvascristina.zooclubservice;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("The Dog " + getName() + " says: Woof!");
    }

    public void eat() {
        System.out.println(getName() + " is eating bones!");
    }
}
