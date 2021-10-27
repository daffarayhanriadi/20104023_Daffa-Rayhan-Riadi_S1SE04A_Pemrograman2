package Modul3.Percobaan;

public class Test_Tabungan {
    public static void main(String[] args) {
        Tabungan t = new Tabungan(5000);
        System.out.println("Saldo awal tabungan anda : "+t.saldo);
        t.ambilUang(1500);
        System.out.println("Jumlah uang yang diambil : 1500");
        System.out.println("Saldo tabungan anda sekarang adalah : "+t.saldo);

    }
}
