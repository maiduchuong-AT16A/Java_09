/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson09.lab01.leson09.lab02;

/**
 *
 * @author ACER
 */
public class Employee implements IEmployee,IShow{
    String name;
   int paymentPerHour;

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

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
    
    
}
