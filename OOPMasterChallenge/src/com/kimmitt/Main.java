package com.kimmitt;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Hamburger hamburger = new Hamburger("basic", "tofu", 8.30, "white");

        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("tomato", 4.44);
        hamburger.addHamburgerAddition2("lettuce", 4.44);
        hamburger.addHamburgerAddition3("cheese", 4.44);
        hamburger.addHamburgerAddition4("onion", 4.44);
        price = hamburger.itemizeHamburger();
        System.out.println("price..." + price);

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("egg", 5.55);
        healthyBurger.addHealthAddition1("lentils", 3.33);
        healthyBurger.itemizeHamburger();
        System.out.println("price now..." + healthyBurger.itemizeHamburger());
    }
}
