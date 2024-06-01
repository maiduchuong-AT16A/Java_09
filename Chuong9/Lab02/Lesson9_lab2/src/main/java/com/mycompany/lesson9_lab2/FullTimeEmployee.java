/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson9_lab2;

/**
 *
 * @author Admin
 */
public class FullTimeEmployee extends Employee{

    public FullTimeEmployee() {}

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }
    
    @Override
    public int calculateSalary() {
        return 8*paymentPerHour;
    }

    @Override
    public void showInfor() {
        System.out.println("Full time employee:");
        System.out.println("Name: "+name+", salary per day: "+calculateSalary());
    }
    
}
