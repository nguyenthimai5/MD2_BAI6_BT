package BT1;

import BT1.Cricle;

public class Cylinder extends Cricle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return Math.PI*Math.pow(getRadius(),2)*height;
    }
    public String toString(){
       return super.toString()+getVolume();
    }

}
