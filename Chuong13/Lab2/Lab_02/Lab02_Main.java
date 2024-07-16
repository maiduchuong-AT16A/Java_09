/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab_02;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Lab02_Main {

    static Scanner sc = new Scanner(System.in);
    static LinkedList<Student> list = new LinkedList<>();
    
    // them sinh vien
    static void choice1()
    {
        int ID = sc.nextInt();
        String FirstName = sc.next();
        String LastName = sc.next();
        //yyyy-mm-dd
        String strBday = sc.next();
        double GPA = sc.nextDouble();
        Student newSt = new Student(ID, FirstName, LastName, LocalDate.parse(strBday), GPA);
        list.add(newSt);
    }
    
    // xoa sinh vien
    static void choice2()
    {
        int field = sc.nextInt(), count=0;
        String str = sc.next();
        if (field==1)
        {
            for (count=0; count<list.size(); count++)
            {
                if (list.get(count).getFirstName().compareTo(str)==0)
                {
                    list.remove(count);
                }
                    
            }
        }
        else
        {
            for (count=0; count<list.size(); count++)
            {
                if (list.get(count).getLastName().compareTo(str)==0)
                {
                    list.remove(count);
                }
                    
            }
        }
    }
    
    // sua thong tin sinh vien
    static void choice3()
    {
        int ID = sc.nextInt();
        // field: 1-firstName, 2-lastName, 3-Birthday, 4-GPA
        int field = sc.nextInt();
        String str = sc.next();
        for (int i=0; i<list.size(); i++)
        {
            
            if (list.get(i).getId()==ID)
            {
                switch (field)
                {
                    case 1 -> {
                        list.get(i).setFirstName(str);
                        break;
                    }
                    case 2 -> {
                        list.get(i).setLastName(str);
                        break;
                    }
                    case 3 -> {
                        list.get(i).setBirthday(LocalDate.parse(str));
                        break;
                    }
                    case 4 -> {
                        list.get(i).setGpa(Double.parseDouble(str));
                        break;
                    }
                    
                }
            }
        }
    }
    
    static void choice4()
    {
        Comparator<Student> comtor;
        int X = sc.nextInt();
        switch (X) {
            case 1 -> {
                comtor = Comparator.comparing(Student::getLastName).
                        thenComparing(Student::getFirstName).
                        thenComparing(Student::getBirthday).
                        thenComparing(Student::getGpa);
                list.sort(comtor);
                break;
            }
            case 2 -> {
                comtor = Comparator.comparing(Student::getBirthday).
                        thenComparing(Student::getLastName).
                        thenComparing(Student::getFirstName).
                        thenComparing(Student::getGpa);
                list.sort(comtor);
                break;
            }
            case 3 -> {
                comtor = Comparator.comparing(Student::getGpa).
                        thenComparing(Student::getLastName).
                        thenComparing(Student::getFirstName).
                        thenComparing(Student::getBirthday);
                comtor = Collections.reverseOrder(comtor);
                list.sort(comtor);
                break;
            }
        }
    }
    
    static void choice5()
    {
        int count=0;
        if (list.isEmpty())
        {
            System.out.println("Khong co gi trong list");
            return;
        }
        for (Student st: list)
        {
            if (count<10)
                System.out.println(st.toString());
        }
        System.out.println("-----");
    }
    
    static void choice6()
    {
        for (Student st: list)
        {
            System.out.println(st.toString());
        }
        System.out.println("-----");
    }
    
    
    public static void main(String[] args) {
        int n, N = sc.nextInt();
        for (n=0; n<N; n++)
        {
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1 -> {
                    choice1();
                    break;
                }
                case 2 -> {
                    choice2();
                    break;
                }
                case 3 -> {
                    choice3();
                    break;
                }
                case 4 -> {
                    choice4();
                    break;
                }
                case 5 -> {
                    choice5();
                    break;
                }
                case 6 -> {
                    choice6();
                    break;
                }
            }
        }
    }
    
}

/*
16
1 2429 NguyenVan A 2001-11-14 9.5
1 2314 NguyenVan A 2002-11-04 9.7
1 7901 TranCong B 2000-01-09 1.5
1 1954 LeVan Nam 1999-05-04 1.6
1 975 MaiDinh Vu 2002-03-08 7.7
1 9926 TrinhVan Cuong 2002-12-19 7.4
6
2 2 Nam
5
4 1
6
4 2
6
3 2314 3 2002-10-04
4 3
6
*/