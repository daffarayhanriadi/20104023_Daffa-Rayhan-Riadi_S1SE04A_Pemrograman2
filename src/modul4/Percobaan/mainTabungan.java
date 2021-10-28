package modul4.Percobaan;

public class mainTabungan {
    public static void main(String[] args) {
        Tabungan saya = new Tabungan("Saitama", 12345);
        Tabungan kamu = new Tabungan("Botak", 12467,15000,22222);

        saya.setaldo(10000);
        saya.setPin(11111);

        System.out.println("Saldo awal saya\t: "+saya.getSaldo());
        System.out.println("Saldo awal kamu\t: "+kamu.getSaldo());
        System.out.println("Nomor pin saya\t: "+saya.getPin());
        System.out.println("Nomor pin kamu\t: "+kamu.getPin());
    }
}
