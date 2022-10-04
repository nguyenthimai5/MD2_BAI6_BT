package bt3;

import BT2.Point2D;
import BT2.Point3D;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Point point=new Point();
      point.setXY(2.0f,3.3f);
        System.out.println(point.toString());

        MovablePoint movablePoint=new MovablePoint();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập x speed");
        float xSpeed=Float.parseFloat(scanner.nextLine());
        System.out.println("nhập y speed");
        float ySpeed=Float.parseFloat(scanner.nextLine());
        movablePoint.setSpeed(xSpeed,ySpeed);
        System.out.println(movablePoint.toString());
    }
}
