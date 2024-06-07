/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson09.lab02;

/**
 *
 * @author Admin
 */
public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    public FullTimeEmployee() {
    }

    @Override
    public String getName() {
        return name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
    @Override
    public int calculateSalary(){
        return paymentPerHour;
    }

    /**
     *
     */
    @Override
    public void showInfo(){
        System.out.println("FULL time employee:");
        System.out.printf("Name: %s,salary per day: %d",this.name,this.calculateSalary());
        System.out.println("");
    }
}
