# 20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2
Mata Kuliah Praktikum Pemrograman 2

## Dasar Teori
* Inheritance

Inheritance merupakan suatu konsep yang dimana sebuah class daoat memiliki class turunan. Class yang memiliki Class turunan biasanya dinamakan sebagai parent class. Sedangkan class turunan itu sendiri biasanya disebut dengan subclass atau child class. class turunan dapat mewarisi method, function, atribut dan sebagainya yang ada di dalam parent class nya.

Didalam Java sendiri untuk mendeklarasikan suatu class menjadi child class adalah dengan menambahkan kata kunci extends setelah deklarasi nama class, kemudian diikuti dengan nama parent class nya.

Contoh :
 ````java
 public class B extends A {
...
}
 ````

Java sendiri hanya memperkenankan konsep single Inheritance, yang dimana suatu child class hanya dapat memiliki satu parent class saja. Karena dengan konsep ini, masalah pewarisan akan dapat diamati dengan mudah.

Suatu parent class dapat tidak mewariskan suatu member nya kepada child class, dengan cara mengatur access control dari member nya sendiri.

Access Control berdasarkan access nya dapat diakses pada :
1. private     : class yang sama
2. default     : class yang sama, package yang sama
3. protected   : class yang sama, package yang sama, subclass/child class
4. public      : class yang sama, package yang sama, subclass/child class, class manapun

Kata kunci super dipakai untuk merujuk pada member dari parent class, sebagaimana kata kunci this yang dipakai untuk merujuk pada member dari class itu sendiri.

Ada beberapa hal yang harus diingat ketika menggunakan pemanggil constuktor super :
1. Pemanggilan super() **harus dijadikan pernyataan pertama dalam** constructor.
2. Pemanggil super() hanya dapat digunakan dalam definisi constructor.
3. Termasuk constructor this() dan pemanggil super() **tidak boleh terjadi dalam** constructor **yang sama**.

Contoh :
   ````java
   public class Siswa {
   private int nilai;
   public setNilai(int nilai) {
   this.nilai=nilai;
      }
   }
   ````

<hr>

## Praktikum
* Percobaan 1 :

    * [Class Bentuk](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/blob/modul6/src/modul6/percobaan/Bentuk.java)
    * [Class Persegi](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/blob/modul6/src/modul6/percobaan/Persegi.java)
    * [Class PersegiTest](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/blob/modul6/src/modul6/percobaan/PersegiTest.java)

  Hasil Run :
  ````java
  Luas Super : 50
  Luas : 39
  ````

<hr>

## Kesimpulan

Pada pembahasan kali ini kami membahas mengenai Inheritance, yang dimana Inheritance itu sendiri merupakan suatu konsep pewarisan, atau suatu class dapat memiliki class turunan. class yang memiliki class turunan biasanya disebut dengan parent class. Sedangkan untuk class turunan biasanya disebut dengan subclass atau childclass. child class dapat mewarisi apa saja yang ada di dalam parent class, tetapi bisa juga child class tidak dapat mewarisi sesuatu hal yang ada di dalam parent class, dikarenakan access controlnya.


