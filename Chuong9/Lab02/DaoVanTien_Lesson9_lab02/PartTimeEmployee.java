/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoVanTien_Lesson9_lab02;

/**
 *
 * @author DELL
 */
public class PartTimeEmployee extends Employee{
    int workingHours;

    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }
    
    @Override
    public int calculateSalary() {
        return paymentPerHour*workingHours;
    }

    @Override
    public void showInfor() {
        System.out.println("Part time employee:");
        System.out.println("Name: "+name+", salary per day: "+calculateSalary());
    }
    
}
