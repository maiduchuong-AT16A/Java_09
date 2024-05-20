
package bai.pkg6;

import java.util.Scanner;

/**
 *
 * @author tuan anh
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t = 1; t<=T;t++)
        {
            System.out.printf("Case #%d:\n", t);
            int n = sc.nextInt();
            double[]a = new double[n];
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextDouble();
            }
            System.out.printf("Sum: %f\n",Project.Sum(a));
            System.out.printf("Min: %f\n",Project.getMin(a));
            System.out.printf("Max: %f\n",Project.getMax(a));
            sc.nextLine();
            String str = sc.nextLine();
            System.out.printf("To upper: %s\n",Project.VietHoa(str));
             String str1 = sc.nextLine();
            System.out.printf("To lower: %s\n",Project.VietThuong(str1));
            System.out.printf("To upper first char: %s - %s\n", Project.toUpperFirstChar(str),Project.toUpperFirstChar(str1));
            int fb = sc.nextInt();
            sc.nextLine();
            System.out.printf("Fibonacci(%d): %d\n", fb, Project.dequy(fb));
        }
    }
}
