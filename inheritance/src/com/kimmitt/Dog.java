package com.kimmitt;

/**
 * Created by Patrick on 1/21/2017.
 */
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tails, int teeth, String coat) {
        super(name, 1, 1, size, weight);//initialize base characteristics from Animal class
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("dog.chew()");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat()super");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("walk(0");
        super.move(5);//animal move class
    }

    public void run(){
        move(10);

    }

    private void moveLegs(int speed){
        System.out.println("dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("dog.move called");
        moveLegs(speed);
        super.move(speed);

    }
}
