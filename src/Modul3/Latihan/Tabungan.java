package Modul3.Latihan;

public class Tabungan {
    int saldo;

    public Tabungan(int iniSaldo) {
        this.saldo = iniSaldo;
    }

    public int getSaldo() {
       return saldo;
    }

    public  int simpanUang(int saldoBertambah) {
        return saldo = saldo + saldoBertambah;
    }

    public boolean ambilUang(int saldoBerkurang) {
        if (saldo-saldoBerkurang <= 0) {
            return false;
        } else {
            saldo -= saldoBerkurang;
            return true;
        }
    }
}

