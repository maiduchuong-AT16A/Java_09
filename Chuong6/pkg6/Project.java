
package bai.pkg6;


public class Project {
    public static double Sum(double ...arr)
    {
        double S = 0;
        for(double x : arr){
            S+=x;
        }
        return S;
    }
    public static double getMin(double... x) {
        double t = 1000000000.0;
        for (double i : x) {
            if (i < t) {
                t = i;
            }
        }
        return t;
    }
    public static double getMax(double...x)
    {
        double t = -1000000000.0;
        for (double i : x) {
            if (i > t) {
                t = i;
            }
        }
        return t;
    }
    public static String VietHoa(String str) {
       char a[] = new char[str.length()];
       for(int i=0; i<str.length();i++)
       {
          a[i] = str.charAt(i);
       }
       for(int i=0;i<a.length;i++)
       {
           if(a[i]>='a' && a[i]<='z')
           {
               a[i]-=32;
           }
       }
       str = new String(a);
       return str;
    }
    public static String VietThuong(String str) {
       char a[] = new char[str.length()];
       for(int i=0; i<str.length();i++)
       {
          a[i] = str.charAt(i);
       }
       for(int i=0;i<a.length;i++)
       {
           if(a[i]>='A' && a[i]<='Z')
           {
               a[i]+=32;
           }
       }
       str = new String(a);
       return str;
    }
    public static String toUpperFirstChar(String a) {
        String str = VietThuong(a);
        String[] word = str.split(" ");
        char[] firstChar = new char[word.length];
        for (int i = 0; i < word.length; i++) {
            firstChar[i] = word[i].charAt(0);
            String upperFirstChar = String.valueOf(firstChar[i]).toUpperCase();
            word[i] = upperFirstChar + word[i].substring(1) + " ";
        }
        String result = String.join("", word);
        return result;
    }
    public static int f1=1;
    public static int f2=1;
    public static int fp=2;
    public static int dequy(int n)
    { 
        f1 = f2;
        f2 = fp;
        fp = f1+f2;
           if(n==4)
           {
               return fp;
           }
           return dequy(n-1); 
    }
}
