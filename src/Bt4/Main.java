package Bt4;

public class Main {
    public static void main(String[] args) {
        System.out.println("_______Shape__________");
        Shape shape=new Shape();
        shape.setSide123(2.3,3.2,4.2);
        System.out.println(shape.toString());

        System.out.println("-----------Triangle-----------");
    Triangle triangle=new Triangle();
    triangle.setColor("pink ");
        System.out.println(triangle.toString());
    }
}
