/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson09.lab02;

/**
 *
 * @author PC2
 */
public class FullTimeEmployee extends Employee{

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
       return 8* getPaymentPerHour();
    }

    @Override
    public void showInfor() {
        System.out.printf("Full time employee:\nName: %s, salary per day: %d\n", getName(), calculateSalary());
    }
    
}
