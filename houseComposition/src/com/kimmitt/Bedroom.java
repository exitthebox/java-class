package com.kimmitt;

/**
 * Created by Patrick on 1/22/2017.
 */
public class Bedroom {
    private String name;
    private Wall wal1;
    private Wall wal2;
    private Wall wal3;
    private Wall wal4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall wal1, Wall wal2, Wall wal3, Wall wal4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wal1 = wal1;
        this.wal2 = wal2;
        this.wal3 = wal3;
        this.wal4 = wal4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp(){
        return this.lamp;
    }

    public void makeBed(){
        System.out.println("bedroom -> making bed");
        bed.make();
    }
}
