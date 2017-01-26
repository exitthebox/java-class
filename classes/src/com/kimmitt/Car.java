package com.kimmitt;

/**
 * Created by Patrick on 1/21/2017.
 */
public class Car {

    private int doors; //use access modifer 'private' when in classes
    private int wheels;
    private String model;//field
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("careera") || validModel.equals("commodore")){
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }
}
