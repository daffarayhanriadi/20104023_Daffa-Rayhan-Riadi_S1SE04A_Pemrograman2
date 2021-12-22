package modul9.Percobaan;

public class Percobaan22 {
    public static void main(String[] args) {
        int a[] = new int[5];
        try{
            a[5] = 100 ;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Indeks Array melebihi batas");
        }
        System.out.println("Setelah blok try-catch");
    }
}
