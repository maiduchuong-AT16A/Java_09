
package minmax;

import java.util.Scanner;



public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0;t<T;t++)
        {
            int n = sc.nextInt();
            MyPoint point[] = new MyPoint[n];
            for(int i=0;i<n;i++)
            {
                point[i] = new MyPoint(sc.nextDouble(), sc.nextDouble());
            }
            int k = sc.nextInt();
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            System.out.printf("distance = %.3f\n",point[k].getDistance(x1, y1));
            int p = sc.nextInt();
            System.out.println(point[p].toString());
            int m = sc.nextInt();
            MyCircle dt[] = new MyCircle[m];
            for(int i=0;i<m;i++)
            {
                dt[i] = new MyCircle();
                dt[i].Tam = new MyPoint(sc.nextDouble(), sc.nextDouble());
            }
            for(int i=0;i<m;i++)
            {
                dt[i].BanKinh = sc.nextDouble();
            }
            int q = sc.nextInt();
            dt[q].toString();
            int i = sc.nextInt();
            int j = sc.nextInt();
            double d = dt[i].Tam.getDistance(dt[j].Tam.x, dt[j].Tam.y);
            if((dt[i].BanKinh-dt[j].BanKinh)<d && d<(dt[i].BanKinh+dt[j].BanKinh))
            {
                System.out.println("Circle i intersects with Circle j");
            }
            else if(d<(dt[i].BanKinh-dt[j].BanKinh))
            {
                System.out.println("Circle i is inside Circle j");
            }
            else
            {
                System.out.println("Circle i does not intersect Circle j");
            }
        }
    }
}
