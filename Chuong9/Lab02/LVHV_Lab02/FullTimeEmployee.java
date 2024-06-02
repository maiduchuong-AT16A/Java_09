/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02;

/**
 *
 * @author van
 */
public class FullTimeEmployee extends Emloyee{
    
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }
    
    @Override
    public int calculateSalary(){
        return paymentPerHour*8;
    }
}
