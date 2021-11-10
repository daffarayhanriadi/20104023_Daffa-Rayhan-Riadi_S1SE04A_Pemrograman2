package modul5.Latihan.Perbankan;

public class Nasabah {
    String namaAwal;
    String namaAkhir;
    Tabungan tabungan;

    public Nasabah(String namaAwal, String namaAkhir) {
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
    }

    public Tabungan getTabungan() {
        return tabungan;
    }

    public void setTabungan(Tabungan tabungan) {
        this.tabungan = tabungan;
    }

    public String getNamaAwal(String namaAwal) {
        this.namaAwal = namaAwal;
        return namaAwal;
    }

    public String getNamaAkhir(String namaAkhir) {
        this.namaAkhir = namaAkhir;
        return namaAkhir;
    }
}
