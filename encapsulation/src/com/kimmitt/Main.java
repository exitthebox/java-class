package com.kimmitt;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Player player = new Player();
//        player.name = "Patrick";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaing health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Patrick", 91, "Sword");
        System.out.println("inital health is: " + player.getHitPoints());
    }
}
