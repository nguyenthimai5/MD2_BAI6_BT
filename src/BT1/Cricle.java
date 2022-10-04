package BT1;

public class Cricle {
    private double radius;
    private String color;

    public Cricle() {
    }

    public Cricle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }
    public String toString(){
        return "radius="+getRadius()+" AreaCricle "+getArea();
    }


}
