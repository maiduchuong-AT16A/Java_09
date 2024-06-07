/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_02;

/**
 *
 * @author quanm
 */
public class PartTimeEmployee extends Employee{
    int workingHours;
    public PartTimeEmployee(String name, int paymentPerHour, int workHours){
        super(name, paymentPerHour);
        workingHours = workHours;
    }
    public int calculateSalary(){
        return super.paymentPerHour * this.workingHours;
    }
    
    public void showInfo(){
        System.out.printf("Part time employee:\nName: %s, salary per day: %d\n", super.name, calculateSalary());
    }
}
