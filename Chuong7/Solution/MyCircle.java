
package minmax;


public class MyCircle {
    MyPoint Tam;
    double BanKinh;
    
    public MyCircle() {
        Tam = new MyPoint(0, 0);
        this.BanKinh = 0;
    }
    public MyCircle(double x, double y, double BanKinh)
    {
        this.Tam = new MyPoint(x, y);
        this.BanKinh = BanKinh;
    }
    public MyCircle(MyPoint Tam, double BanKinh) {
        this.Tam = Tam;
        this.BanKinh = BanKinh;
    }

    public MyPoint getTam() {
        return Tam;
    }

    public void setTam(MyPoint Tam) {
        this.Tam = Tam;
    }

    public double getBanKinh() {
        return BanKinh;
    }

    public void setBanKinh(double BanKinh) {
        this.BanKinh = BanKinh;
    }
    public double getCircumference()
    {
        return 2*3.142*BanKinh;
    }
    public double getArea()
    {
        return 3.142*BanKinh*BanKinh;
    }

    @Override
    public String toString() {
        System.out.printf("Circle info: (%.2f, %.2f), radius = %.2f, circumference = %.3f, area = %.3f\n",Tam.x,Tam.y, BanKinh,getCircumference(),getArea());
        return null;
    }
}
