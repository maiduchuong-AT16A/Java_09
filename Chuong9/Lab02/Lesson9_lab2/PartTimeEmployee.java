/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson9_lab2;

/**
 *
 * @author ADMIN
 */
public class PartTimeEmployee extends Employee{
    int workingHours;

    public PartTimeEmployee(int workingHours, String name, int paymentPerHour) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    public PartTimeEmployee(int workingHours) {
        this.workingHours = workingHours;
    }

    public PartTimeEmployee(){       
    }

    @Override
    public int calculateSalary() {
        return this.paymentPerHour*this.workingHours;
    }

    @Override
    public void showInfor() {
        System.out.println("Part time emplyee:");
        System.out.printf("Name: %s, salary per day: %d\n",getName(),calculateSalary());
    }
    
    
    
}
