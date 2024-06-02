/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson09.lab01.leson09.lab02;

/**
 *
 * @author ACER
 */
public class FullTimeEmployee extends Employee{
 
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }
    public int calculateSalary(){
        return 8*this.paymentPerHour;
    }
 @Override
    public void showInfo() {
        System.out.printf("Full time employee:\n");
        System.out.println("Name: " + this.name + ", salary per day: " + calculateSalary());
    }
    
    
}
