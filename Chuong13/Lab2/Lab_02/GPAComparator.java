/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_02;

import java.util.Comparator;

/**
 *
 * @author DELL
 */
public class GPAComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGpa()-o2.getGpa()>0)
            return 1;
        else if (o1.getGpa()-o2.getGpa()==0)
            return 0;
        else
            return -1;
    }
    
}
