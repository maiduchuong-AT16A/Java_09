
package javaapplication1;

import java.util.Scanner;


public class Lab02_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0;t<T;t++)
        {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int P = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            sc.nextLine();
            SinhVienATTT[] svattt = new SinhVienATTT[M];
            for(int i=0;i<M;i++)
            {
                svattt[i] = new SinhVienATTT(sc.nextLine(), "ATTT", sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
                sc.nextLine();
            }
            SinhVienCNTT svcntt[] = new SinhVienCNTT[N];
            for(int i=0;i<N;i++)
            {
                svcntt[i] = new SinhVienCNTT(sc.nextLine(), "CNTT", sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
                sc.nextLine();
            }
            SinhVienDTVT svdtvt[] = new SinhVienDTVT[P];
            for(int i=0;i<P;i++)
            {
                svdtvt[i] = new SinhVienDTVT(sc.nextLine(), "DTVT", sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
                sc.nextLine();
            }
            svattt[x].hienThiThongTin();
            svcntt[y].hienThiThongTin();
            svdtvt[z].hienThiThongTin();
        }
    }
}
