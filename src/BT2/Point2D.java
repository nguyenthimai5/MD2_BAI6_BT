package BT2;

public class Point2D {
    private  float x;
    private  float y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
        this.x=0.0F;
        this.y=0.0F;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
  float[] floats=new float[2];
  return floats;
    }
    public String toString(){
        return "("+"x= "+this.x+", y= "+this.y+")";
    }

}
