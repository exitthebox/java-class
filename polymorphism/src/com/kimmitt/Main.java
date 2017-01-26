package com.kimmitt;

class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        return "Car -> start engine";

    }

    public String accelerate(){
        return "Car -> accelerate()";

    }

    public String brake (){
        return "Car -> brake()";
    }

}

class Mitsubishi extends Car{
    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);//invokes the constructor for the super class, which is car.
    }

    @Override
    public String startEngine() {
        return "Mit -> start engine()";
    }

    @Override
    public String accelerate() {
        return "Mit -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mit -> start brake()";
    }
}

class Holden extends Car{
    public Holden(String name, int cylinders) {
        super(name, cylinders);//invokes the constructor for the super class, which is car.
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> start engine()";
    }

    @Override
    public String accelerate() {
        return "Holden -> accelerate()";
    }

    @Override
    public String brake() {
        return "Holden -> start brake()";
    }
}

class Ford extends Car{
    public Ford(String name, int cylinders) {
        super(name, cylinders);//invokes the constructor for the super class, which is car.
    }

    @Override
    public String startEngine() {
        return "Ford -> start engine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> start brake()";
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car car = new Car("Base Care", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi("Mit", 8);
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford("Ford", 8);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden("Holden", 8);
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());


    }


}
