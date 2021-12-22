package modul9.Percobaan;

public class Percobaan5 {
    public static void main(String[] args) {
        int bil=10;
        String b[] = {"a","b","c"};
        try{
            System.out.println(bil/0);
            System.out.println(b[3]);
        }catch(ArithmeticException e){
            System.out.println("Error Aritmetik");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error Kapasitas Array Melebihi Batas");
        }catch(Exception e){
            System.out.println("Terdapat Error");
        }
    }
}
