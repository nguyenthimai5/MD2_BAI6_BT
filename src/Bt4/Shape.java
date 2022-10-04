package Bt4;

public class Shape {
    private double side1;
    private double side2;
    private double side3;

    public Shape() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public  Shape(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
public void setSide123(double side1,double side2,double side3){
       this.setSide1(side1);
      this.setSide2(side2);
      this.setSide3(side3);
}

    public double getArea() {
        double p = (this.side1 + this.side2 + this.side3) / 2;
        double p2 = p * ((p - this.side1) * (p - this.side2) * (p - this.side3));
        double h = 2 * (Math.sqrt(p2) / this.side1);
        double s = (this.side1 * h) / 2;
            return s;
    }

    public double getPerimeter() {
            double c = this.side3 + this.side1 + this.side2;
            return c;

    }
    public String toString(){
        return "Dien tich hinh tam giac : "+getArea()+" Chu vi hinh tam giac la : "+getPerimeter();
    }
}
