/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai8;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        PhanSo ps = new PhanSo();
        ps.nhapphanso();
        ps.rutGon();
        System.out.println("phan so rut gon la:");
        ps.showPhanSo();
        ps.nghichDaoPs();
        System.out.println("phan so nghich dao la:");
        ps.showPhanSo();
    }
}
