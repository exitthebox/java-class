package com.kimmitt;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("yorki", 8,20, 2, 4, 1, 20,"long");
        dog.eat();//calls override method eat()
        //dog.walk();
        dog.run();
    }
}
