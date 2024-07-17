/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Leson13;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class AgeComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getBirthday().getYear() -  o2.getBirthday().getYear() == 0) {
            if(o1.getBirthday().getMonthValue() - o2.getBirthday().getMonthValue() == 0) {
                if(o1.getBirthday().getDayOfMonth() - o2.getBirthday().getDayOfMonth() == 0) {
                    return 0;
                }else if (o1.getBirthday().getDayOfMonth() - o2.getBirthday().getDayOfMonth() > 0) {
                    return 1;
                } else {
                    return -1;
                }
                
            }else if (o1.getBirthday().getMonthValue() - o2.getBirthday().getMonthValue() > 0) {
                return 1;
            }else {
                return -1;
            }
        }else if (o1.getBirthday().getYear() -  o2.getBirthday().getYear() > 0) {
            return 1;
        }else {
            return -1;
        }
        
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
        
    }
    
    
}
