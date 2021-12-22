# 20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2
Mata Kuliah Praktikum Pemrograman 2

---

## Dasar Teori
* **Exeption**

Exeptioan adalah suatu kondisi abnormal yang terjadi pada saat menjalankan program. Teknik yang dipakai dalam Java untuk menangani kondisi yang tidak biasa saat menjalankan operasi normal dalam program dinamakan exception handling. Karena dalam java segala sesuatu merupakan objek, maka exception juga direpresentasikan dalam sebuah objek yang menjelaskan tentang exception tersebut. Contoh exception adalah pembagian bilangan dengan 0, pengisian elemen array diluar ukuran array, kegagalan koneksi database, file yang akan dibuka tidak ada, dan mengakses objek yang belum diinisialisasi. Terdapat dua penanganan exception yaitu :
  1. Menangani sendiri exception tersebut.
  2. Meneruskannya ke luar dengan cara membuat objek tentang exception tersebut dan melemparkannya (throw) keluar agar ditangani oleh kode yang memanggil method (method yang  didalamnya terdapat exception) tersebut.

Ada lima keyword yang digunakan oleh Java untuk menangani exception yaitu try, catch, finally, throw dan throws.

---


* **Tipe-Tipe Exception**

Pada exception, superclass tertinggi adalah class Throwable, tetapi kita hampir tidak pernah menggunakan class ini secara langsung. Dibawah class Throwable terdapat dua subclass yaitu class Error dan class Exception. 

---

* **Penggunaan Blok try-catch**
  
Untuk menangani exception dalam program, dengan meletakkan kode program yang memungkinkan terjadinya exception didalam blok try, diikuti dengan blok catch yang menentukan jenis exception yang ingin ditangani. Contoh :

````java
public class Percobaan2 {
public static void main(String[] args){ 
int a[] = new int[5];
try{
a[5] = 100 ;
}catch(ArrayIndexOutOfBoundsException e){
System.out.println("Indeks Array melebihi batas");
}
System.out.println("Setelah blok try-catch"); 
  }
}

````

Hasil Run: 
````java
Terjadi exception karena Indeks Array melebihi batas Setelah blok
try-catch
```` 

Dapat terjadi kode yang terdapat dalam blok try mengakibatkan lebih dari satu exception. Dalam hal ini, kita dapat menuliskan lebih dari satu blok catch. Contoh :

````java
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
````
---

**Menggunakan Keyword ”finally”**

Terdapat kode yang harus dijalankan walaupun terjadi atau tidak terjadi exception, misalkan kita membuka file, hal ini memungkinkan terjadinya exception misal file tidak ada, file tidak bisa dibuka, selanjutnya yang harus dilakukan adalah menutup file tersebut.

````java
public class Percobaan2 {
public static void main(String[] args) {
  int a[] = new int[5];
  try{
  a[5] = 100 ;
  }catch(ArrayIndexOutOfBoundsException e){
  System.out.println("Terjadi exception karena Indeks
  Array melebihi batas");
  }finally{
  System.out.println("Selalu Dijalankan");
  } System.out.println("Setelah blok try-catch");
  }
}
````
---

**Menggunakan Keyword ”throw ” dan ”throws”**

Secara eksplisit, kita dapat melempar (throw) exception dari program menggunakan keyword throw. Jika exception tersebut adalah checked exception, maka pada method harus ditambahkan throws. Jika exception tersebut adalah unchecked exception, maka pada method tidak perlu ditambahkan throws.
````java
public class Percobaan6 {
public static void method1() throws
  FileNotFoundException{
  throw new FileNotFoundException("File Tidak Ada");
  } public static void main(String[] args) {
  try {
  method1();
  } catch (FileNotFoundException ex) {
  System.out.println(ex.getMessage());}
  } 
}
````
---
<hr>

## Praktikum
* Percobaan **1** :

    * [Class Percobaan22](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/blob/modul9/src/modul9/Percobaan/Percobaan22.java)

Hasil Run : 
````java
Indeks Array melebihi batas
Setelah blok try-catch
````
* Percobaan **2** : 

    * [Class Percobaan2](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/blob/modul9/src/modul9/Percobaan/Percobaan2.java)
    * [Class Percobaan3](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/blob/modul9/src/modul9/Percobaan/Percobaan3.java)

Hasil Run : 
````java
java.lang.ArithmeticException: / by zero

Tidak boleh membagi bilangan dengan 0
````
* Percobaan **3** :

    * [Class Percobaan4](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/blob/modul9/src/modul9/Percobaan/Percobaan4.java)

Hasil Run : 
````java
Tidak boleh membagi bilangan dengan 0
````
* Percobaan **4** :

    * [Class ExepTest](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/blob/modul9/src/modul9/Percobaan/ExceptTest.java)

Hasil Run : 
````java
Exception throw : java.lang.ArrayIndexOutOfBoundsException: 3
First elemeent value : 6
The Finally statement is executed
````
---
## Latihan 
* Latihan 1 **Method yang melempar checked exception**

    * [Class Percobaan7](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/blob/modul9/src/modul9/Latihan/Percobaan7.java)

Hasil Run :
````java
File Tidak Ada
````

* Latihan 2 **Method yang melempar unchecked exception**

    * [Class Percobaan](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/blob/modul9/src/modul9/Latihan/Percobaan.java)

Hasil Run :
````java
Masukan Angka : (Sudah Berjalan)
````

* Latihan 3 **Menggunakan konsep Inheritance untuk membuat superclass dan subclass exception. Program menangani exception dengan menangkap subclass exception dengan superclass.**

    * [Class Demo](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/blob/modul9/src/modul9/Latihan/Demo.java)

Hasil Run :
````java
Tidak dapat ditampilkan, Hasil dari Run langsung menjadi notifikasi pada Java Exeption
````

<hr>

## Kesimpulan

Pada pembahasan kali ini kami membahas mengenai Exeption, Exeptioan itu sendiri adalah suatu kondisi abnormal yang terjadi pada saat menjalankan program. Selain itu juga ada Tipe-tipe Exeption, Penggunaan Blok try-catch, Menggunakan keyword "finally", dan Menggunakan Keyword ”throw ” dan ”throws”.
