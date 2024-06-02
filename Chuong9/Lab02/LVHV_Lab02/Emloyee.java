/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02;

/**
 *
 * @author van
 */
public class Emloyee implements IEmployee, IShow{
    String name;
    int paymentPerHour;

    public Emloyee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }
    
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public int calculateSalary(){
        return 1;
    }
    
    @Override
    public void showInfo(){
        System.out.println("Name: "+name+", salary per day: "+calculateSalary());
    }
}
