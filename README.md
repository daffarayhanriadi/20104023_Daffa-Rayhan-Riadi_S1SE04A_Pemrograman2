# 20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2
Mata Kuliah Praktikum Pemrograman 2

## Dasar Teori
* Information Hiding
    
    Information Hiding adalah menyembunyikan atribut dan method suatu object dari object lain. Sehingga informasi yang disimpan oleh Atribut dan method tadi tidak bisa diakses dari luar (hanya bisa diakses oleh object yang memiliki Atribut dan method itu sendiri). Cara untuk melakukan hal tersebut adalah dengan membuat private.
````java
Contoh :
private int nilai;
````
* Encapsulation (Enkapsulasi)

    Encapsulation adalah untuk memastikan bahwa data "sensitif" disembunyikan dari pengguna. 
````java
Contoh :

public class Siswa {
    private int nilai;
    public void setNilai(int nilai) {
        nilai = n;
    }
}
````

* Constructor

    Contructor adalah method yang pertama kali digunakan saat pertama kali object dibuat. Mirip seperti method, kita bisa memberikan parameter pada constructor. Nama constructor harus sama dengan nama class, serta constructor tidak membutuhkan void ataupun return value di depannya.

````java
public class Siswa {
    private int nilai;
    private String nama;
    public Siswa(int n, String m) {
        nilai=n;
        nama=m;
    }
}
````
* Overloading Contructor

    Overloading Constructor adalah suatu class yang dimana memiliki lebih dari 1 constructor. Constructor sama seperti method juga bisa dilakukan overloading dengan syarat parameter harus berbeda.

````java
public class Siswa{
    private int nilai;
    
    public Siswa() {
        nilai = 0;
    }
    
    public Siswa(int n) {
        nilai = n;
    }
}
````

<hr>

## Praktikum
Soal : 
1. Student Record, Menganalisis dan menentukan konep apa saja yang digunakan (dari modul ini) serta mengapa hasil akhirnya seperti itu!

Jawaban :
1. [Jawaban Soal 1](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/tree/modul4/src/modul4/Latihan)
````java
Wahyu
Hitung = 0
````

Penjelasan : 

Konsep yang digunakan pada soal 1 ini adalah Information Hiding, yakni menggunakan private untuk menyembunyikan informasi atribut saja.

<hr>

##Kesimpulan

Pada pembahasan kali ini kami membahas mengenai Information Hiding, Encaptulation, Constructor, dan Overloading Construntor. Pertama Information Hiding adalah suatu cara untuk menyembunyikan atribut dan method dari suatu object dari object lain dengan cara menggunakan private. Kedua Encaptulation adalah untuk memastikan bahwa data "sensitif" disembunyikan dari pengguna.. Ketiga Constructor adalah method yang digunakan pertama kali saat object dibuat. Terakhir Overloading Constructor adalah suatu class yang dimana class tersebut memiliki lebih dari satu Constructor, dan cara membuat Overloading Constructor adalah dengan membuat parameter yang berbeda dari Constructor yang lain. 
