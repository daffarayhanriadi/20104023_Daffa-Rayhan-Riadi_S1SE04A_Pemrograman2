# 20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2
Mata Kuliah Praktikum Pemrograman 2
## Dasar Teori
* Keyword dalam java

  Keyword merupakan kata kunci yang digunakan di dalam Java, Keyword ini memiliki fungsinya masing-masing di dalam Java, dan keyword tidak bisa digunakan untuk memberi nama suatu variabel.
  
  
* Tipe dasar

  Java sendiri memiliki 8 Tipe Dasar, yang dimana tipe dasar itu memiliki spesifikasi bit dan range nya masing-masing.


* Variable

  Variabel adalah item yang digunakan data untuk menyimpan suatu (baik itu pertannyaan maupun pernyataan) objek. Variabel memiliki tipe data dan nama. Tipe data menandakan tipe nilai yang dapat dibentuk oleh variabel itu sendiri. Nama variabel harus mengikuti aturan untuk identifier.


* Casting dan Promotion

  Casting diperlukan untuk mengkonversi dari suatu tipe ke tipe data yang lebih kecil panjang bitnya. Sedangkan promotion terjadi pada saat mengkonversi dari suatu tipe data ke tipe data yang lebih panjang bitnya.


<hr>

## Praktikum
Soal :
1. Menganalisa batasan maksimum dari suatu tipe
2. Cerita Anak Ayam
3. A + B - C

Jawaban :
1. [Jawaban Soal 1](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/blob/modul2/src/Modul2/Latihan/BigInteger.java)
````java
long p=2147483648;
````
Syntax diatas menampilkan error :
```java
java: integer number too large: 2147483648
```
Syntax akan error karena java mambaca syntax tersebut dengan tipe data integer, bukan tipe data long. Sehingga agar tipe data long seperti contoh di atas dibaca menjadi long adalah dengan menambahkan huruf kapital L di belakang angka 8 (dibelakang angka).

2. [Jawaban Soal 2](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/blob/modul2/src/Modul2/Latihan/CeritaAnakAyam.java)

Hasil running Cerita Anak Ayam :
```java
Anak ayam turun 10, Mati 1 tinggal 9
Anak ayam turun 9, Mati 1 tinggal 8
Anak ayam turun 8, Mati 1 tinggal 7
Anak ayam turun 7, Mati 1 tinggal 6
Anak ayam turun 6, Mati 1 tinggal 5
Anak ayam turun 5, Mati 1 tinggal 4
Anak ayam turun 4, Mati 1 tinggal 3
Anak ayam turun 3, Mati 1 tinggal 2
Anak ayam turun 2, Mati 1 tinggal 1
Anak ayam turun 1, Mati 1 tinggal Induknya
```

3. [Jawaban Soal 3](https://github.com/Daffarr/20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2/blob/modul2/src/Modul2/Latihan/PenjumlahanABC.java)

Hasil running A + B - C :
```java
Jumlah Testcase	: 2
Nilai A1	: 2
Nilai B1	: 3
Nilai C1	: 4

Nilai A2	: -1
Nilai B2	: -3
Nilai C2	: -7

Hasil 2 : 3
Hasil 2 : 3
```

<hr>

## Kesimpulan
Dari Praktikum yang dilakukan kali ini kami mendapatkan pengetahuan mengenai cara penamaan identifier, Keyword-keyword apa saja yang ada di dalam Java, 8 Tipe dasar yang ada di dalam Java, Variable di dalam Java beserta cara membuatnya, Serta melakukan cara Casting and Promotion di dalam Java.
