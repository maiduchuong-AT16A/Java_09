
package com.mycompany.oop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution 
{
    static void insertValue(MyPoint arr[],int n,Scanner sc)
    {
        double x,y;
        for(int i = 0; i < n; i++)
        {
            x = sc.nextDouble();
            y = sc.nextDouble();
            MyPoint p = new MyPoint(x, y);
            arr[i] = p;
        }
    }
    static void insertCircle(MyCircle arr[],int m,Scanner sc)
    {
        byte n = 0;
        double x,y,r;
        double arr1[] = new double[m*2];
        double arr2[] = new double[m];
        for(int i = 0; i < m*2; i++)
        {
            arr1[i] = sc.nextDouble();
        }
        for(int i = 0; i < m; i++)
        {
            arr2[i] = sc.nextDouble();
        }
        for(int i = 0; i < m; i++)
        {
            MyCircle c = new MyCircle(arr2[i],arr1[n],arr1[n+1]);
            arr[i] = c;
            n = (byte)(n + 2);
        }
    }
    static void circleDistance(MyCircle arr[],int i,int j)
    {
        double sumR = arr[i].getR() + arr[j].getR();
        double Idis = arr[i].getDistance(arr[j].getX(),arr[j].getY());
        if(sumR > Idis)
        {
            System.out.printf("Circle %d intersects with Circle %d",i,j);
        }
        else if(sumR < Idis)
        {
            System.out.printf("Circle %d does not intersects with Circle %d",i,j);
        }
        else
        {
            System.out.printf("Circle %d is inside Circle %d",i,j);
        }
    }
    public static void main(String[] args) throws FileNotFoundException
    {
        System.setIn(new FileInputStream("Input.txt"));
        Scanner sc = new Scanner(System.in);
        byte T = sc.nextByte();
        byte n,k,p,m,q,i,j;
        double x,y,x1,y1,distance;
        for(byte t = 0; t < T; t++)
        {
            System.out.printf("Case #%d:\n",t+1);
            n = sc.nextByte();
            MyPoint arr[] = new MyPoint[n];
            insertValue(arr, n, sc);
            k = sc.nextByte();
            x1 = sc.nextDouble();
            y1 = sc.nextDouble();
            System.out.printf("distance = %.3f\n",arr[k].getDistance(x1, y1));
            p = sc.nextByte();
            System.out.println(arr[p].toString());
            m = sc.nextByte();
            MyCircle arrc[] = new MyCircle[m];
            insertCircle(arrc, m, sc);
            q = sc.nextByte();
            System.out.println(arrc[q].toString());
            i = sc.nextByte();
            j = sc.nextByte();
            circleDistance(arrc, i, j);
        }
    }
}
