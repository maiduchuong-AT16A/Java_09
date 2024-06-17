/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson9_lab2;

/**
 *
 * @author ADMIN
 */
public class FullTimeEmployee extends Employee{

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    public FullTimeEmployee() {
    }

    @Override
    public int calculateSalary() {
        return this.paymentPerHour*8;
    }

    @Override
    public void showInfor() {
        System.out.println("Full time employee:");
        System.out.printf("Name: %s, salary per day: %d\n",getName(),calculateSalary());
    }
    
    
}
