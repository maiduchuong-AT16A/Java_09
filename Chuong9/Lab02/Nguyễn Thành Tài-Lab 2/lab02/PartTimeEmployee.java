/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson09.lab01.leson09.lab02;

/**
 *
 * @author ACER
 */
public class PartTimeEmployee extends Employee{
    int workingHours;
     public int calculateSalary(){
        return workingHours*paymentPerHour;
    }

    public PartTimeEmployee( String name, int paymentPerHour,int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public void showInfo() {
        System.out.printf("Part time employee:\n");
        System.out.println("Name: " + this.getName()+ ", salary per day: " + calculateSalary());
    }

  
    
    
    
}
