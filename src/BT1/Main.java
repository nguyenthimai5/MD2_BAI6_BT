package BT1;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------Cricle-----------");
        Cricle cricle=new Cricle(3.2,"pink");
        System.out.println(cricle.getArea());

        System.out.println("-------Cylinder--------");
        Cylinder cylinder=new Cylinder(5,"blue",7);
        System.out.println(cylinder.getVolume());
    }
}
