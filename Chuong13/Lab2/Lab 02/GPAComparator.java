/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Leson13;

import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class GPAComparator implements Comparator<Student>{

    

    @Override
    public int compare(Student o1, Student o2) {
        
        if(o2.getGpa() - o1.getGpa() < 0) {
            return -1;
        }else if(o2.getGpa() - o1.getGpa() > 0) {
            return 1;
        }
        return 0;
        
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
