/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson09.lab02;

/**
 *
 * @author Admin
 */
public class Employee implements IEmployee,IShow{
    public String name;
    public int paymentPerHour;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int calculateSalary() {
        
        return paymentPerHour;
        
    }

    @Override
    public void showInfo() {
        
    }

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public Employee() {
    }

    

    

    
    
}
