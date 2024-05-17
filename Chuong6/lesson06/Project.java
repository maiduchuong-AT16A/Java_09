/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson06;

/**
 *
 * @author quanm
 */
import java.util.Scanner;
public class Project {
   public static final double getSum(double ...x)
   {
       double sum = 0;
       for(double y : x)
       {
           sum += y;
       }
       return sum;
   }
   
   public static final double getMin(double ... x)
   {
       int flag = 0; double min = 0;
       for(double y : x)
       {
           if(flag == 0)
           {
               min = y;
           }
           if(y <= min)
           {
               min = y;
           }
           flag = 1;
       }
       return min;
   }
   
   public static final double getMax(double ... x)
   {
       int flag = 0; double max = 0;
       for(double y : x)
       {
           if(flag == 0)
           {
               max = y;
           }
           if(y >= max)
           {
               max = y;
           }
           flag = 1;
       }
       return max;
   }
   
  public static String toUpper(String str)
  {
      char[] ch = new char[str.length()];
      for(int i = 0; i < str.length(); i++)
      {
          ch[i] = str.charAt(i);
      }
      for(int i = 0; i < ch.length; i++)
      {
          if(ch[i] >= 'a' && ch[i] <= 'z')
          {
              ch[i] -= 32;
          }
      }
      str = new String(ch); return str;
  }
  
  public static String toLower(String str)
  {
      char[] ch = new char[str.length()];
      for(int i = 0; i < str.length(); i++)
      {
          ch[i] = str.charAt(i);
      }
      for(int i = 0; i < ch.length; i++)
      {
          if(ch[i] >= 'A' && ch[i] <= 'Z')
          {
              ch[i] += 32;
          }
      }
      str = new String(ch); return str;
  }
  
  public static String toUpperFirstChar(String str)
  {
      str = toLower(str);
      String[] words = str.split(" ");
      char[] firstChar = new char[words.length];

      for(int i = 0; i < words.length; i++)
      {
          firstChar[i] = words[i].charAt(0);
          String upperFirstChar = String.valueOf(firstChar[i]).toUpperCase();
          words[i] = upperFirstChar + words[i].substring(1);
      }
      String result = String.join(" ", words); return result;
  }
  static long a = 0;
  static long b = 1;
  public static long getFibonacci(int position)
  {
      if(position == 0)
      {
          return 0;
      }
      if(position == 1)
      {
          return b;
      }
      else
      {
          long temp = b;
          b += a;
          a = temp;
          return getFibonacci(position - 1);
      }
  }
}



