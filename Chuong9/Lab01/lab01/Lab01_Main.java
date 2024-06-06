
package lesson09.lab01;

import java.util.Scanner;


public class Lab01_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=1;t<=T;t++)
        {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int P = sc.nextInt();
            int Q = sc.nextInt();
            Rectangle[] hcn = new Rectangle[M];
            Circle[] ht = new Circle[N];
            for(int i=0;i<M;i++)
            {
                hcn[i] = new Rectangle(sc.nextDouble(), sc.nextDouble());
            }
            for(int i=0;i<N;i++)
            {
                ht[i] = new Circle(sc.nextDouble());
            }
            System.out.println("Case #"+t+":");
            int j;
            for(int i=0;i<P;i++)
            {
                j = sc.nextInt();
                hcn[j].show();
            }
            int k;
            for(int i=0;i<Q;i++)
            {
                k = sc.nextInt();
                ht[k].show();
            }
        }
    } 
}
