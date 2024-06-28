/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompantes.bai_13_baitap;

/**
 *
 * @author quanm
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Lab01_Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x;
        int y;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int e = 0; e < n; e++) {
             int choice = sc.nextInt();
             sc.nextLine();
             switch(choice)
             {
                 case 1:
                     char c = sc.next().charAt(0);
                     
                     sc.nextLine();
                     if(c == 'F'){
                         x = sc.nextInt();
                         sc.nextLine();
                         list.add(0, x);
                     }
                     else if(c == 'L'){
                         x = sc.nextInt();
                         sc.nextLine();
                         list.add(list.size(), x);
                     }
                     else if(c == 'P'){
                         y = sc.nextInt();
                         x = sc.nextInt();
                         sc.nextLine();
                         if(list.size() < y)
                         {
                             list.add(list.size(), x);
                         }
                         else{
                             list.add(y, x);
                         }
                     }
                     break;
                 case 2:
                     x = sc.nextInt();
                     sc.nextLine();               
                     for(int i = 0; i < list.size(); i++){
                         if(list.get(i) == x){
                             list.remove(i);
                             count++;
                         }
                     }
                     System.out.println(count);
                     count = 0;
                     break;
                 case 3:
                     x = sc.nextInt();
                     for(int i = 0; i < list.size(); i++){
                         if(list.get(i) == x){
                             count++;
                         }
                     }
                     System.out.println(count);
                     count = 0;
                     break;
                 case 4:
                     x = sc.nextInt();
                     y = sc.nextInt();
                     for(int i = x; i <= y; i++){
                         System.err.printf("%d ", list.get(i));
                         
                     }System.out.println("");
                     break;
                 case 5:
                     for(int i = 0; i < list.size(); i++){
                         System.out.printf("%d ", list.get(i));
                         
                     }System.out.println("");
             }
        }
    }
}
