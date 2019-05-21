package com.company;

import java.lang.ref.PhantomReference;

public class Fan {

    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public  Fan(int speed,boolean on,
                double radius,
                String color){
        this.speed=speed;
        this.on=on;
        this.radius=radius;
        this.color=color;
    }
    public Fan(){

    }
    public int getSpeed(){
        return this.speed;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public boolean on(){
        return on;
    }

    public double getRadius(){
       return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public String getColor(){
        return this.getColor();
    }
    public void setColor(String color){
        this.color=color;
    }
    public  String toStringOn(){
        return "Speed "+this.speed+" Color "+this.color+" Radius "+this.radius+" fan is on";
    }
    public String toStringOff(){
        return "Color "+this.color+" Radius "+this.radius+" fan is off";
    }

}
