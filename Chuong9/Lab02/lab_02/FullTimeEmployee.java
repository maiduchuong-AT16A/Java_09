/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_02;

/**
 *
 * @author quanm
 */
public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String name, int paymentPerHour){
        super(name, paymentPerHour);
    }
    public int calculateSalary(){
        return 8 * super.paymentPerHour;
    }
    
    public void showInfo(){
        System.out.printf("Full time employee:\nName: %s, salary per day: %d\n", super.name, calculateSalary());
    }
}
