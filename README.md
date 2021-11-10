# 20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2
Mata Kuliah Praktikum Pemrograman 2
## Dasar Teori
* Package
  
Package merupakan suatu cara untuk memanegement class-class yang kita miliki di dalam suatu project yang dibuat, karena semakin besar project yang akand dibuat maka kemungkinan akan memiliki class yang sangat banyak. Sehingga  untuk menghandle hal terebut dapat menggunakan cara yag satu ini. Agar class-class yang dibuat tersebut dapat di kategorikan dengan sesuai. Yang harus diperhatikan adalah biasanya nama class utama harus sama dengan nama package. Berikut ini adalah sintak pernyataan package untuk meletakkan hasil kompilasi sebuah kelas ke dalam paket :
````java
package nama-paket;
<identifier> class <nama_class sama dengan package>
Contoh : package Utama;
public class Utama{ }
````

* Import Class

Perintah import digunakan untuk memberitahukan kepada program untuk mengacu pada class-class yang terdapat dalam package tertentu, buka menjalankan class-class tersebut.
  Deklarasi import class :
````java
import <nama_package>.*;
Contoh : import matematik.*;
````
Sedangkan untuk mengimpor class tertentu anda dapat menuliskan nama class setelah nama package. Deklarasi import :
````java
import <nama_package>.<nama_class>;
Contoh : import matematik.bilangan;
````
Contoh penggunaan import (dengan implementasinya) :
````java
import matematik.bilangan;
class Utama {
   public static void main(String[] args) {
   Bilangan x = new Bilangan(); x.setDesimal(-44); 
   System.out.println("Bilangan binerdari "+x.getDesimal() + " adalah "+ x.biner()); 
   }
}
````

* Kata kunci this

Kata kunci ini digunakan dalam sebuah class untuk menyatakan object sekarang. Kata kunci this sangat berguna untuk menunjukkan suatu member dalam class-nya sendiri. this dapat digunakan baik untuk data member maupun untuk function member, serta dapat juga digunakan untuk konstruktor. Adapun format penulisannya adalah :
1. this.data_member      => merujuk pada data member
2. this.functio_member() => merujuk pada function member
3. this()                => merujuk pada konstruktor
<hr>

## Praktikum
Soal :
1. Mengimplementasikan UML class diagram dalam program untuk package perbankan

Jawaban :
1. [Jawaban Soal 1](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/tree/modul5/src/modul5/Latihan)
````java
        Nasabah atas nama : Agus Daryanto 
        Saldo awal : 5000
        Jumlah uang yang disimpan : 3000
        Jumlah uang yang diambil : 6000 ok
        Jumlah uang yang disimpan : 3500
        Jumlah uang yang diambil : 4000 ok
        Jumlah uang yang diambil : 1600 gagal
        Jumlah uang yang disimpan : 2000
        Saldo sekarang = 3500
````

<hr>

## Kesimpulan
Package dapat disarankan untuk digunakan seseorang dalam melakukan suatu pekerjaan project yang besar. Sehingga nantinya dapat mempermudah orang tersebut dalam memanegement letak-letak dari suatu class-class yang dibuat, karena sudah dikategorikan. Import Class, fungsi dari import class sendiri adalah agar program yang sedang dikerjakan hanya menggunakan class-class yang ada di dalam package tertentu/yang telah dikategorikan oleh orang yang melakukan project. Kemudian kata kunci this ini digunakan dalam sebuah class untuk menyatakan object yang sekarang.his dapat digunakan baik untuk data member maupun untuk function member, serta dapat juga digunakan untuk konstruktor. Adapun format penulisannya adalah :

1. this.data_member => merujuk pada data member
2. this.functio_member() => merujuk pada function member
3. this() => merujuk pada konstruktor
