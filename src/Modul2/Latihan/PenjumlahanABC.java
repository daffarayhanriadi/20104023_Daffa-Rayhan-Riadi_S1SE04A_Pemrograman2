package Modul2.Latihan;

import java.util.Scanner;

public class PenjumlahanABC {
    static Scanner in = new Scanner(System.in);
    static int A,B,C,t=0,n=0;

    public static void main(String[] args) {
        System.out.print("Jumlah Testcase\t: ");
        t = in.nextInt();
        for (int i = t; i < t+1; i++) {
            penjumlahanABC();
        }
        for (int k = t; k <= t+1; k++) {
            int[] hasil = new int[100];
            hasil[1] = A+B-C;
            System.out.println("Hasil "+ n +" : "+hasil[1]);
        }
    }

    public static void penjumlahanABC() {
            for (int j = t; j <= t+1; j++) {
                n++;
                System.out.print("Nilai A"+n+"\t: ");
                A = in.nextInt();
                System.out.print("Nilai B"+n+"\t: ");
                B = in.nextInt();
                System.out.print("Nilai C"+n+"\t: ");
                C = in.nextInt();
                System.out.println("");
            }
    }
}
