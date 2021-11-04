package com.daffa.pbo.modul4.percobaan;

public class Tabungan {
    private String nama;
    private int noRekening;
    private int saldo;
    private int pin;

    Tabungan(String nama, int noRekening, int saldo, int pin) {
        this.nama = nama;
        this.noRekening = noRekening;
        this.saldo = saldo;
        this.pin = pin;
    }
    Tabungan(String nama, int noRekening) {
        this.nama = nama;
        this.noRekening = noRekening;
    }

    public String getNama() {
        return nama;
    }

    public int getNoRekening() {
        return noRekening;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getPin() {
        return pin;
    }

    public void setaldo(int saldo) {
        this.saldo=saldo;
    }

    public void setPin(int pin) {
        this.pin=pin;
    }
}