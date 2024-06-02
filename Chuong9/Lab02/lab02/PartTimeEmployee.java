/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson09.lab02;

/**
 *
 * @author PC2
 */
public class PartTimeEmployee extends Employee {
    int workingHours;

    public PartTimeEmployee(int workingHours) {
        this.workingHours = workingHours;
    }

    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }
    @Override
    public int calculateSalary(){
        return getPaymentPerHour() * workingHours;
    }

    @Override
    public void showInfor() {
        System.out.printf("Part time employee:\nName: %s, salary per day: %d\n", getName(), calculateSalary());
    }
    
}
