|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020241|
| Nama |  Hikmal Fadhillah Rasyid Andro Mulyawan |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/hikmal-byte/PASD25_1F_14_hikmal) |

# Labs #1 Programming Fundamentals Review

## 2.1.1. Selection Solution

The solution is implemented in Pemilihan1.java, and below is screenshot of the result.

![Screenshot]![alt text](<Jobsheet DLL Percobaan 1.png>)
![Screenshot]![alt text](<Jobsheet DLL Percobaan 2.png>)
![Screenshot]![alt text](<P12 Percobaan 2.2 Part 2.png>)
![Screenshot]![alt text]
![Screenshot]![alt text]
![Screenshot]
![Screenshot]


**Brief explanaton:** There are 4 main step: 

Percobaan 1:
1. Baik linked list tunggal maupun linked list ganda merupakan eksekusi dari linked list . Linked list tunggal menyimpan data dan tautan ke komponen berikutnya. Sedangkan pada linked list ganda, setiap node menyertakan tautan ke node sebelumnya.

2. Atribut next berfungsi untuk menunjuk atau menyimpan alamat memori milik node berikutnya (setelah dirinya).

Atribut prev berfungsi untuk menunjuk atau menyimpan alamat memori milik node sebelumnya. Kedua pointer ini sangat vital agar data bisa dihubungkan maju-mundur tanpa memutus silsilah rantai memori data tersebut.

3. Fungsi konstruktor terhadap kondisi awal:
Konstruktor DoubleLinkedList() mengatur nilai awal head = null dan tail = null. Artinya, fungsi ini menginisialisasi bahwa rantai linked list dalam kondisi baru, siap digunakan, dan statusnya masih kosong (belum memiliki node satu pun).

4. Mengapa head dan tail menunjuk node yang sama saat kosong?
Karena saat kondisi linked list kosong lalu diisi oleh satu node baru, secara otomatis node baru tersebut bertindak sebagai elemen pertama sekaligus elemen terakhir di dalam list.

5 & 6. terlihat sama saja ![alt text](image.png)

Percobaan 2:
1. Penjelasan fungsi statement pada removeFirst():
head = head.next; : Menggeser pointer penanda depan (head) agar berpindah maju dan menunjuk ke node urutan kedua.

head.prev = null; : Memutus hubungan node depan yang baru dengan node lama yang dihapus, sehingga data lama aman dibersihkan dari memori oleh Garbage Collector.

2. ![alt text](<Pertanyaan dan tugas Jobsheet 12.png>)
    ![alt text](<Pertanyaan dan tugas Jobsheet 12 Part 3.png>)

## 2.1.1. Selection Solution
Continue to report the result....
