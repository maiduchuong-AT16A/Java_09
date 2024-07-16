/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Leson13;

import Lab_02.AgeComparator;
import Lab_02.FirstNameComparator;
import Lab_02.GPAComparator;
import Lab_02.LastNameComparator;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import javacore.sort.comperable.Student;

/**
 *
 * @author Admin
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    static void addObj(Student ob) {
        String object = sc.nextLine();

//        String object1 = object.strip();
        // dùng trim() để cắt vị trí " " ở đầu chuỗi và cuối chuỗi 
        String[] attribute = object.trim().split(" ");
        attribute[0].strip();
        attribute[4].stripTrailing();
//        for (int i = 0; i < attribute.length; i++) {
//            System.out.print(attribute[i] + " ");
//        }

        System.out.println();
        String[] date = attribute[3].split("-");
//        for (int i = 0; i < date.length; i++) {
//            System.out.println(date[i]);
//        }
        LocalDate birth = LocalDate.of(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
        ob.setId(Integer.parseInt(attribute[0]));
        ob.setFirstName(attribute[1]);
        ob.setLastName(attribute[2]);
        ob.setBirthday(birth);
        ob.setGpa(Double.parseDouble(attribute[4]));
    }

    static void deleteObj(ArrayList<Student> list) {
        String infDelete = sc.nextLine();
        String[] infDelete1 = infDelete.trim().split(" ");
        int field = Integer.parseInt(infDelete1[0]);
        if (field == 1) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getFirstName().compareTo(infDelete1[1]) == 0) {
                    list.remove(i);
                }
            }
        }
        if (field == 2) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getLastName().compareTo(infDelete1[1]) == 0) {
                    list.remove(i);

                }
            }
        }

    }

    static void customizeObj(ArrayList<Student> list) {

        String infCustomize = sc.nextLine();
        String[] infCustomize1 = infCustomize.strip().split(" ");
        int id = Integer.parseInt(infCustomize1[0].trim());
        int field = Integer.parseInt(infCustomize1[1]);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                switch (field) {
                    case 1:
                        list.get(i).setFirstName(infCustomize1[2]);
                        break;
                    case 2:
                        list.get(i).setLastName(infCustomize1[2]);
                    case 3:
                        String[] date = infCustomize1[2].split("-");
                        int year = Integer.parseInt(date[0]);
                        int month = Integer.parseInt(date[1]);
                        int day = Integer.parseInt(date[2]);
                        LocalDate customizeDate = LocalDate.of(year, month, day);
                        list.get(i).setBirthday(customizeDate);
                        break;
                }
            }
        }

    }
//Comparator<Student> com = Comparator.comparing(Student::getLastName)
//        .thenComparing(Student::getFirstName)
//        .thenComparing(Student::getAge)
//        .thenComparing(Student::GPA);

    static void arrangeObj(ArrayList<Student> list) {
        int option = sc.nextInt();
        switch (option) {
            case 1:
                LastNameComparator LastN = new LastNameComparator();
                FirstNameComparator firstN = new FirstNameComparator();
                AgeComparator age = new AgeComparator();
                GPAComparator gpa = new GPAComparator();
                Comparator<Student> com = LastN.thenComparing(firstN).thenComparing(age).thenComparing(gpa);
                Collections.sort(list, com);
                break;
            case 2:
                Collections.sort(list, new AgeComparator()
                        .thenComparing(new LastNameComparator())
                        .thenComparing(new FirstNameComparator())
                        .thenComparing(new GPAComparator()));
                break;
            case 3:
                Collections.sort(list, new GPAComparator()
                        .thenComparing(new LastNameComparator())
                        .thenComparing(new FirstNameComparator())
                        .thenComparing(new AgeComparator()));
                break;
        }

    }

    static void showTop10(ArrayList<Student> list) {
        if (list.size() >= 10) {
            for (int i = 0; i < 10; i++) {
                System.out.println(list.get(i));
            }
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
        System.out.println("-----------------");
    }

    static void showAllList(ArrayList<Student> list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        ArrayList<Student> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int t_h = sc.nextInt();
            switch (t_h) {
                case 1:
                    Student std = new Student();
                    addObj(std);
                    list.add(std);
                    
                    break;
                case 2:
                    deleteObj(list);
                    
                    break;
                case 3:
                    customizeObj(list);
                    
                    break;
                case 4:
                    arrangeObj(list);
                    
                    break;
                case 5:
                    showTop10(list);
                    
                    break;
                case 6:
                    showAllList(list);
                    
                    break;

            }
        }
    }

}
