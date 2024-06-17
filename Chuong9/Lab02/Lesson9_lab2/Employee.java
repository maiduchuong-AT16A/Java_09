/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson9_lab2;

/**
 *
 * @author ADMIN
 */
public abstract class Employee implements IEmployee,IShow{
    String name;
    int paymentPerHour;
    
    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }
    
    public Employee(){
        
    }
    
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public abstract int calculateSalary();

    @Override
    public abstract void showInfor();
}
