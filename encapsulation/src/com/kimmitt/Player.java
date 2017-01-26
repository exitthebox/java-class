package com.kimmitt;

/**
 * Created by Patrick on 1/22/2017.
 */
public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("player knocked out");
            //reduce number of lives for the remaining player
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
