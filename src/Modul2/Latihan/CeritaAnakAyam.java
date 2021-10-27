package Modul2.Latihan;

public class CeritaAnakAyam {
    public static void main(String[] args) {
        int i;
        for (i = 10; i > 1; i--) {
            System.out.print("Anak ayam turun " +i);
            i-=1;
            System.out.println(", Mati 1 tinggal "+i);
            i+=1;
        }
        System.out.println("Anak ayam turun "+i+", Mati "+i+" tinggal Induknya");
    }
}
