package Modul8.Percobaan;

public class Tes {
    public static void main(String[] args) {
        Parent kelas = new Child();
        System.out.println("Nilai x : " + kelas.x);
        kelas.info();
    }
}
