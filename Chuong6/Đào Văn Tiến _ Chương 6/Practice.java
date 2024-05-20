/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson6;


public class Practice {

    public Practice() {}
    
    // y/c 1
    public static final double getSum(double ...x)
    {
        double sum=0;
        for (double a: x)
            sum+=a;
        return sum;
    }
    
    // y/c 2.1
    public static final double getMin(double ...x)
    {
        double min=x[0];
        for (double a: x)
            if (a<min)
                min=a;
        return min;
    }
    
    // y/c 2.2
    public static final double getMax(double ...x)
    {
        double max=x[0];
        for (double a: x)
            if (a>max)
                max=a;
        return max;
    }
    
    // y/c 3
    public static String toUpper(String str)
    {
        char[] ch = str.toCharArray();
        for (short i=0; i<ch.length; i++)
        {
            if ('a'<=ch[i] && ch[i]<='z')
                ch[i] = (char)(ch[i]-'a'+'A');
        }
        return new String(ch);
    }
    
    // y/c 4
    public static String toLower(String str)
    {
        char[] ch = str.toCharArray();
        for (short i=0; i<ch.length; i++)
        {
            if ('A'<=ch[i] && ch[i]<='Z')
                ch[i] = (char)(ch[i]-'A'+'a');
        }
        return new String(ch);
    }
    
    // y/c 5
    public static String toUpperFirstChar(String str)
    {
        String[] word = str.split(" ");
        char firstChar;
        for (short i=0; i<word.length; i++)
        {
            word[i]=toLower(word[i]);
            firstChar = word[i].charAt(0);
            char upperFirstChar = String.valueOf(firstChar).toUpperCase().charAt(0);
            word[i]=upperFirstChar + word[i].substring(1);
            
        }
        String result = String.join(" ", word);
        return result;
    }
    
    // y/c 6
    public static long getFibonacci(int pos)
    {
        if (pos<3)
            return 1;
        return (getFibonacci(pos-2)+getFibonacci(pos-1));
    }
    
}
