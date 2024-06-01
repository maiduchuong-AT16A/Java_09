/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson9;

/**
 *
 * @author Admin
 */
public class PartTimeEmployee extends Employee{
    private int workingHours;

    public PartTimeEmployee(String name,int paymentPerHour,int workingHours ) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    public PartTimeEmployee() {
    }
    

    @Override
    public void setName(String name) {
        super.setName(name); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    

    @Override
    public int calculateSalary() {
        return workingHours*super.getPaymentPerHour();
    }

    @Override
    public void showInfor() {
        System.out.print("Part time employee: \n");
        super.showInfor(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public void setPaymentPerHour(int paymentPerHour) {
        super.setPaymentPerHour(paymentPerHour); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
}
