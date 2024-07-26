/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import static java.io.File.separator;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Lab01_Main {

    static Scanner sc = new Scanner(System.in);

    static String READ_PATH = "C:" + separator + "JavaCore" + separator + "Bai14" + separator + "Lab01" + separator + "diemthi_input.csv";
    static String WRITE_PATH = "C:" + separator + "JavaCore" + separator + "Bai14" + separator + "Lab01" + separator + "diemthi_output.csv";
//    static String READ_PATH = "D:\\Learning Java\\CSV_input.csv";
//    static String WRITE_PATH = "D:\\Learning Java\\CSV_output.csv";
    static List<ThiSinh> dsachThiSinh = new LinkedList<>();
    static String firstLine;

    static void Read_CSV_File() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(READ_PATH));
            firstLine = br.readLine();
            String strThiSinh;
            String[] infor;
            ThiSinh ts;
            while ((strThiSinh = br.readLine())!=null)
            {
                infor = strThiSinh.split(",");
                ts = new ThiSinh(infor[0], infor[1], infor[2], infor[3], Double.parseDouble(infor[4]));
                dsachThiSinh.add(ts);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab01_Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lab01_Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                if (br!=null)
                    br.close();
            } catch (IOException ex) {
                Logger.getLogger(Lab01_Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    static void Write_CSV_File() {
        BufferedWriter bw = null;
        
        try {
            bw = new BufferedWriter(new FileWriter(WRITE_PATH));
            if (firstLine.charAt(firstLine.length()-1) != '\n') {
                firstLine += '\n';
            }
                
            bw.write(firstLine);
            for (ThiSinh t: dsachThiSinh){
                bw.append(String.format("%s,%s,%s,%s,%s\n", t.getSBD(), t.getHoTen(), t.getGioiTinh(), 
                        t.getTinh(), (new DecimalFormat("0.0#")).format(t.getTongDiem())));
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Lab01_Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (bw!=null)
            {
                try {
                    bw.flush();
                    bw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Lab01_Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
    
    
    static void func1() {
        String Gioi_Tinh = sc.next();
        List<ThiSinh> gender_list = new ArrayList<>();
        for (ThiSinh t: dsachThiSinh)
        {
            if (t.getGioiTinh().equals(Gioi_Tinh)){
                gender_list.add(t);
            }
        }
        Comparator<ThiSinh> comtorName = Comparator.comparing(ThiSinh::getHoTen);
        gender_list.sort(comtorName);
        for (ThiSinh t: gender_list)
        {
            System.out.println(t.toString());
        }
    }

    static void func2() {
        String Tinh = sc.next();
        List<ThiSinh> tinh_list = new ArrayList<>();
        for (ThiSinh t: dsachThiSinh)
        {
            if (t.getTinh().equals(Tinh)){
                tinh_list.add(t);
            }
        }
        Comparator<ThiSinh> comtorName = Comparator.comparing(ThiSinh::getHoTen);
        tinh_list.sort(comtorName);
        for (ThiSinh t: tinh_list)
        {
            System.out.println(t.toString());
        }
    }

    static void func3() {
        String SBD = sc.next();
        int Y = sc.nextInt();
        String X = sc.next();
        for (int i=0; i<dsachThiSinh.size(); i++)
        {
            if (dsachThiSinh.get(i).getSBD().equals(SBD))
            {
                if (Y==1)
                {
                    dsachThiSinh.get(i).setTinh(X);
                    return;
                }
                dsachThiSinh.get(i).setTongDiem(Double.parseDouble(X));
            }
        }
    }

    static void func4() {
        String SBD = sc.next();
        int check=0;
        for (int i=0; i<dsachThiSinh.size(); i++)
        {
            if (dsachThiSinh.get(i).getSBD().equals(SBD))
            {
                dsachThiSinh.remove(i);
                System.out.println(check=1);
                return;
            }
        }
        System.out.println(check);
    }

    static void func5() {
        int y=0, Y = sc.nextInt();
        Comparator<ThiSinh> cmp_score = Comparator.comparing(ThiSinh::getTongDiem);
        cmp_score = Collections.reverseOrder(cmp_score);
        dsachThiSinh.sort(cmp_score);
        List<ThiSinh> highScore_list = new ArrayList<>();
        while (y<Y && y<dsachThiSinh.size())
        {
            highScore_list.add(dsachThiSinh.get(y++));
        }
//        for (ThiSinh t: highScore_list)
//        {
//            System.out.println(t.toString());
//        }
//        System.out.println("--------");
        
        Comparator<ThiSinh> comtorName = Comparator.comparing(ThiSinh::getHoTen);
        highScore_list.sort(comtorName);
        for (ThiSinh t: highScore_list)
        {
            System.out.println(t.toString());
        }
    }

    static void func6() {
        Comparator<ThiSinh> cmp = Comparator.comparing(ThiSinh::getTongDiem)
                .thenComparing(ThiSinh::getHoTen)
                .thenComparing(ThiSinh::getTinh);
        cmp = Collections.reverseOrder(cmp);
        dsachThiSinh.sort(cmp);
        Write_CSV_File();
    }

    public static void main(String[] args) {

        int n, N = sc.nextInt(), function;
//        Read_CSV_File();
//        Write_CSV_File();
        
        if (N > 0) {
            Read_CSV_File();
            for (n = 0; n < N; n++) {
                function = sc.nextInt();
                switch (function) {
                    case 1 ->
                        func1();
                    case 2 ->
                        func2();
                    case 3 ->
                        func3();
                    case 4 ->
                        func4();
                    case 5 ->
                        func5();
                    case 6 ->
                        func6();
                }
            }
        }

    }

}
