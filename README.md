# 20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2
Mata Kuliah Praktikum Pemrograman 2
## Dasar Teori
* Pemrograman Berorientasi Objek

  Pemrograman Berorientasi Objek (Object Oriented Programming/OOP) merupakan pemrograman yang berorientasi kepada objek, dimana semua data dan fungsi akan di kemas ke dalam class maupun object-object. Kemudian itu akan menjadi satu ke satuan dari object itu sendiri. Ada beberapa istilah yang perlu dimengerti dalam OOP, yaitu : Object dan Class
  
  
* Mendeklarasikan Suatu Class

  Class merupakan blueprint, prototype untuk membuat Object, Class sendiri berisi mengenai deklarasi semua properties dan function yang dimiliki oleh Object, sehingga dapat dikatakan bahwa setiap Object selalu dibuat di dalam Class tanpa batasan.

  Syntax nya berikut ini :
````
<modifier> class <nama_class> {
[isi class]
}
````
````java
Contoh : 
public class Mobil{ 

}
````

* Mendeklarasikan Suatu Atribut

  Attributes merupakan nilai (type) data yang terdapat pada suatu object yang berasal dari class. Attributes merepresentasikan karakteristik dari suatu object.

  Syntax nya berikut ini :
````
<modifier> <tipe> <nama_atribut> ;
````
````java
Contoh : 
public String warna;
````

* Mendeklarasikan Suatu Metode

  Method merupakan sesuatu yang dapat dilakukan oleh Object. Untuk membuat method caranya adalah dengan mendeklarasikan method tersebut di dalam block Class.

  Syntax nya berikut ini :
````
<modifier> <return_type> <nama_metode>{
([daftar_argumen])
[<statement>]
}
````
````java
Contoh : 
public void info(){
System.out.println(warna);
}
````

* Mengakses Anggota Suatu Obyek

  Untuk dapat mengakses anggota-anggota dari suatu obyek, maka harus dibuat instance dari class tersebut terlebih dahulu.

  Syntax nya berikut ini :
````java
public class Mobil {
public static void main(String args[]){ 
Mobil m=new Mobil();
m.warna=”hitam”;
m.no_Plat=”KT 2837 UE”;
m.info();
  }
}
````
<hr>

## Praktikum
Soal :
1. Mengimplementasikan UML class diagram dalam program untuk class Tabungan

Jawaban :
1. [Jawaban Soal 1](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/blob/modul3/src/Modul3/Latihan/Tabungan.java)
   
   [Run Jawaban](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/blob/modul3/src/Modul3/Latihan/Implementasi_UML.java)
````java
Saldo awal : 10000
Jumlah uang yang disimpan : 8000
Jumlah uang yang diambil : 7000 ok
Jumlah uang yang disimpan : 1000
Jumlah uang yang diambil : 10000 ok
Jumlah uang yang diambil : 2500 gagal
Jumlah uang yang disimpan : 2000
Saldo sekarang = 4000
````

<hr>

## Kesimpulan
Dari Praktikum yang dilakukan kali ini kami mendapatkan pengetahuan tentang Object Oriented Programming (OOP), cara mendeklarasikan suatu Class, cara mendeklarasikan sautu Atribut, cara mendeklarasikan suatu Metode, dan cara mengakses suatu anggota Obyek
