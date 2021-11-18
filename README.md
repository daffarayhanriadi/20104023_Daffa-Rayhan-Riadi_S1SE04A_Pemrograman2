# 20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2
Mata Kuliah Praktikum Pemrograman 2

## Dasar Teori
* **Overloading**

Overloading merupakan suatu keadaan dimana ada beberapa method dengan nama yang sama pada suatu class tetapi dengan parameter yang berbeda (mempunyai implementasi dan return value).Tujuan dibuatnya overloading yaitu memudahkan pengguna method dengan fungsi yang hampir sama.

Contoh :
````java
public void print( String temp ){
    System.out.println("Name:" + name);
    System.out.println("Address:" + address);
    System.out.println("Age:" + age);
}
  
public void print(double eGrade, double mGrade, doublesGrade){
    System.out.println("Name:" + name);
    System.out.println("Math Grade:" + mGrade);
    System.out.println("English Grade:" + eGrade);
    System.out.println("Science Grade:" + sGrade);
}
  ````

Overloading ini dapat terjadi pada class yang sama atau pada suatu parent class dan subclass-nya. Overloading mempunyai ciri-ciri sebagai berikut :

1. Nama Constructor atau Method harus sama
2. Daftar Parameter harus berbeda
3. Return type boleh sama atau berbeda

* **Overrriding**

Overriding tidak sama dengan overloading, Overriding merupakan mekanisme dimana sebuah metode dapat dideklarasikan ulang pada kelas turunannya. Overriding mempunyai ciri-ciri sebagai berikut :
  
1. Nama Constructor atau Method harus sama
2. Daftar Parameter harus sama
3. Return type harus sama

Berikut ini contoh terjadinya overriding dimana method RupiahVsDolar() pada class Sekarang meg-override method RupiahVsDolar() pada class Dulu.

````java
class Dulu { 
    public String RupiahVsDolar() {
        System.out.println("Rp 10.000");
    }
}
class Sekarang extends Dulu { 
    public String RupiahVsDolar() {
        System.out.println("Rp 14.000");
    }
}
  ````

Method yang terkena override (overiden method) diharuskan tidak boleh mempunyai modifier yang lebih luas aksesnya dari method yang meng-overide (overriding method).
<hr>

## Praktikum
* Percobaan 1 (Overloading) :

    * [Class A](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/blob/modul7/src/modul7/percobaan/A.java)
    * [Class B](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/blob/modul7/src/modul7/percobaan/B.java)
    * [Class C](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/blob/modul7/src/modul7/percobaan/C.java)
    * [Class Overload](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/blob/modul7/src/modul7/percobaan/C.java)

  Hasil Run :
  ````java
  Overload.myOverload(A a)
  Overload.myOverload(B b)
  ````
  
* Percobaan 2 (Overloading) :
    * [Class Overload1](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/blob/modul7/src/modul7/percobaan/Overload1.java)

  Hasil Run :
  ````java
  short
  ````
  
* Percobaan 3 (Overloading) : 
    * [Class Mahasiswa](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/blob/modul7/src/modul7/percobaan/Mahasiswa.java)
    * [Class Main](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/blob/modul7/src/modul7/percobaan/Main.java)

  Hasil Run : 
  ````java
  Halo.. Aku Mahasiswa!
  Haloo.. Namaku Daffa
  ````

* Percobaan 4 (Overriding): 
    * [Class Burung](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/blob/modul7/src/modul7/percobaan/Burung.java)
    * [Class Penguin](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/blob/modul7/src/modul7/percobaan/Penguin.java)
    * [Class Overriding](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/blob/modul7/src/modul7/percobaan/Overriding.java)
  
  Hasil Run : 
  ````java
  Aku terbang!
  Aku tidak bisa terbang!
  ````
  
<hr>

## Kesimpulan

Pada pembahasan kali ini kami membahas mengenai Overloading dan Overriding, yang dimana ciri-ciri dari Overloading sendiri adalah penamaan dari Constructor atau Method nya harus sama, tetapi harus dengan Parameter yang berbeda, dan return type boleh sama atau bebeda. Sedangkan Overriding tidak sama dengan Overloading, ciri-ciri dari Overriding sendiri adalah penamaan Constructor atau Method harus sama, Parameter juga harus sama, dan return type juga harus sama.  

