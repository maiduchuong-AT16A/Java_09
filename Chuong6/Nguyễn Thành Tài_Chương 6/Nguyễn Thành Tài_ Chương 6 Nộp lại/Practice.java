/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package javacore.basic.lesson06;

/**
 *
 * @author ACER
 */
public class Practice {

     public static double sum(double ...x){
         double tong = 0;
         for(double a:x){
             tong += a;
         }
         return tong;
    }
     public static final double getMin(double ...x){
           double min = x[0];
           for(double a:x){
               if(a <= min){
                   min = a;
               }
           }
           return min;
     }
       public static final double getMax(double ...x){
           double max = x[0];
           for(double a:x){
               if(a >= max){
                   max = a;
               }
           }
           return max;
     }
      public static String toUpper(String str){
         char ch[] = str.toCharArray();
         
          int i;
          for(i = 0; i < ch.length;i++){
             if(ch[i] >= 'a' && ch[i] <= 'z'){
              ch[i] = (char)(ch[i] - 32);
          }
              
          }
          
          
          return  new String(ch);
      
      }
       public static String toLower(String str){
         char ch[] = str.toCharArray();
         
          int i;
          for(i = 0; i < ch.length;i++){
             if(ch[i] >= 'A' && ch[i] <= 'Z'){
              ch[i] = (char)(ch[i] + 32);
             }
              
          } 
          return  new String(ch);
      
      }
 public static String toUpperFirstChar(String str) {
     str = toLower(str);
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            char firstChar = words[i].charAt(0);
            String upperFirstChar = String.valueOf(firstChar).toUpperCase()+"";
            words[i] = upperFirstChar + words[i].substring(1);
        }
        String result = String.join(" ", words);
        return result;
    }  
      
     public static long getFibonacci(int position){
         if(position == 0){
             return 0;
           }
         if(position == 1){
             return 1;
         }
         return getFibonacci(position - 1) + getFibonacci(position - 2);
}
}
     

