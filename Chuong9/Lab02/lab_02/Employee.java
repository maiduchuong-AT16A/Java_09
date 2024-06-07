/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_02;

/**
 *
 * @author quanm
 */
public class Employee implements IEmployee, IShow{
    protected String name;
    protected int paymentPerHour;
    public Employee(String name, int payment){
        this.name = name; paymentPerHour = payment;
    }
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public int calculateSalary(){
        return 0;
    }
     
    
    public void showInfo(){
        
    }

   
}
