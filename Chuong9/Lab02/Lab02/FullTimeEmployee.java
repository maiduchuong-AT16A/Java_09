/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leson09.lab02;

/**
 *
 * @author tuan anh
 */
public class FullTimeEmployee extends Employee{
    
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }
    public int calculateSalary()
    {
        return paymentPerHour*8;
    }
    public void showInfo()
    {
                System.out.printf("Full time employee:\nName: %s, salary per day: %d\n", name,calculateSalary());
    }
}
