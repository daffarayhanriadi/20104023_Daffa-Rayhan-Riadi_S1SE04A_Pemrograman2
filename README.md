# 20104023_Daffa-Rayhan-Riadi_S1SE04A_Pemrograman2
Mata Kuliah Praktikum Pemrograman 2

---

## Dasar Teori
* **Polymorphism**

Polymorphism (polimorfisme) adalah kemampuan untuk mempunyai beberapa bentuk class yang berbeda. Polimorfisme ini terjadi pada saat suatu obyek bertipe parent class, akan tetapi pemanggilan constructornya melalui subclass. Misalnya deklarasi pernyataan berikut ini:
````java
Employee employee=new Manager();
//<nama class> <variable bebas> = new <kontruktor>();
````
Dimana Manager() adalah constructor pada class Manages yang merupakan subclass dari class Employee.

---


* **Virtual Method Invocation (VMI)**

Bisa terjadi jika terjadi polimorfisme 
dan overriding. Pada saat obyek yang sudah dibuat tersebut memanggil
overridden method pada parent class, kompiler Java akan melakukan
invocation (pemanggilan) terhadap overriding method pada subclass, dimana
yang seharusnya dipanggil adalah overridden method. 

    Berikut contoh terjadinya VMI:
  * [Class Parent]()
  * [Class Child]()
  * [Class Tes]()

  Hasil Run : 
````java
Nilai x : 5
Ini Class Child
````
---
* **Polymorphic arguments**
  
Polymorphic arguments adalah tipe suatu parameter yang menerima
  suatu nilai yang bertipe subclass-nya. Berikut contoh dari polymorphics
  arguments:
````java
class Pegawai {
...
}
class Manajer extends Pegawai {
...
}
public class Tes {
public static void Proses(Pegawai peg) {
...
}
public static void main(String args[]) { Manajer man = new
Manajer(); Proses(man);
}
}
````
Pernyataan instanceof sangat berguna untuk mengetahui tipe asal dari
suatu polymorphic arguments. Untuk lebih jelasnya, misalnya dari contoh
program sebelumnya, kita sedikit membuat modifikasi pada class Tes dan
ditambah sebuah class baru Kurir, seperti yang tampak dibawah ini:
````java
...
class Kurir extends Pegawai {
    ...
}
public class Tes {
    public static void Proses(Pegawai peg){
        if (peg instanceof Manajer){
            ...lakukan tugas-tugas manajer...
        } else if (peg instanceof Kurir){
            ...lakukan tugas-tugas kurir...
        } else {
            ...lakukan tugas-tugas lainnya...
        }
    }
    public static void main(String args[]){
        Manajer man = new Manajer();
        Kurir kur = new Kurir();
        Prose(man);
        Proses(kur);
    }
}
````
Seringkali pemakaian instanceof diikuti dengan casting object dari tipe
parameter ke tipe asal. Misalkan saja program kita sebelumnya. Pada saat kita
sudah melakukan instanceof dari tipe Manajer, kita dapat melakukan casting
object ke tipe asalnya, yaitu Manajer. Caranya adalah seperti berikut:
````java
...
if (peg instanceof Manajer) { Manajer man = (Manajer) peg;
...lakukan tugas-tugas manajer...
}
````
---
<hr>

## Praktikum
* Percobaan 1 **Virtual Method Invocation** :

    * [Class Pegawai]()
    * [Class Gaji]()
    * [Class VirtualDemo]()

Hasil Run : 
````java
Menyusun Pegawai
Menyusun Pegawai
Memanggil mailCheck Berdasarkan Referensi Gaji --
Memeriksa kelas gaji dalam surat 
Surat tertuju untuk Wahyu dengan gaji 5000.0

Memanggil mailCheck Berdasarkan Referensi Pegawai--
Memeriksa kelas gaji dalam surat 
Surat tertuju untuk Ini nama dengan gaji 2500.0
````
<hr>

## Kesimpulan

Pada pembahasan kali ini kami membahas mengenai polimorfisme,

