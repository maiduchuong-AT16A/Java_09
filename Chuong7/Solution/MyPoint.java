
package minmax;


public class MyPoint {
    double x;
    double y;

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public double getDistance(double x1, double y1)
    {
        return Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }
    
}
