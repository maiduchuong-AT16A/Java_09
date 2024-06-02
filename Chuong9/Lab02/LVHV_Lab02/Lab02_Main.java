/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02;

import java.util.Scanner;

/**
 *
 * @author van
 */
public class Lab02_Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int M = sc.nextInt(); // số nhân viên full time
            int N = sc.nextInt(); // số nhân viên parttime
            int P = sc.nextInt(); // hiển thị số nv full time
            int Q = sc.nextInt(); //hiển thị số nhân viên parttime

            FullTimeEmployee[] nv1 = new FullTimeEmployee[M];
            for (int i = 0; i < M; i++) {
                sc.nextLine();
                String name = sc.nextLine();
                int paymentPerHour = sc.nextInt();
                nv1[i] = new FullTimeEmployee(name, paymentPerHour);
            }

            PartTimeEmployee[] nv2 = new PartTimeEmployee[N];
            for (int j = 0; j < N; j++) {
                sc.nextLine();
                String name = sc.nextLine();
                int paymentPerHour = sc.nextInt();
                int workingHours = sc.nextInt();
                nv2[j] = new PartTimeEmployee(name, paymentPerHour, workingHours);
            }

            System.out.println("Case #" + t + ":");

            for (int p = 0; p < P; p++) {
                System.out.println("Full time employee:");
                int i = sc.nextInt();
                nv1[i].showInfo();
            }
            for (int q = 0; q < Q; q++) {
                System.out.println("Part time employee:");
                int j = sc.nextInt();
                nv2[j].showInfo();
            }
        }
    }
}
