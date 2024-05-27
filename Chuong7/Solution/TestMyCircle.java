
package minmax;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(2, 3, 5);
        MyPoint p = new MyPoint(6, 6);
        MyCircle c2 = new MyCircle(p, 8);
        c1.toString();
        c2.toString();
    }
}
