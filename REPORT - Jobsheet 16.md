|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020241|
| Nama |  Hikmal Fadhillah Rasyid Andro Mulyawan |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/hikmal-byte/PASD25_1F_14_hikmal) |

# Labs #1 Programming Fundamentals Review

## 2.1.1. Selection Solution

The solution is implemented in Pemilihan1.java, and below is screenshot of the result.

![Screenshot]![alt text](<Percobaan 1 Collection.png>)
![Screenshot]![alt text](<Percobaan 2 Collection.png>)
![Screenshot]![alt text](<Percobaan 3 Collection.png>)
![Screenshot]![alt text]
![Screenshot]![alt text]
![Screenshot]
![Screenshot]


**Brief explanaton:** There are 4 main step: 

Percobaan 1:
1. Karena ArrayList tersebut dideklarasikan secara raw type (tanpa menggunakan generic <T>). Secara default, ia akan memperlakukan seluruh elemen yang dimasukkan sebagai objek bersubtipe Object. Karena semua class di Java adalah turunan dari Object, maka tipe data apa pun (int/Integer, String, dll.) bisa masuk ke dalamnya.

2. ![Screenshot]![alt text](<Pertanyaan 2 Percobaan 1 Collection-3.png>)
![Screenshot]![alt text](<Pertanyaan 2 Percobaan 1 Collection-1.png>)
![Screenshot]![alt text](<Pertanyaan 2 Percobaan 1 Collection-2.png>)

3. ![Screenshot]![alt text](<Pertanyaan 3 Percobaan 1 Collection-1.png>)

4. ![Screenshot]![alt text](<Pertanyaan 4 Percobaan 1 Collection-1.png>)

5. Method push() pada LinkedList berfungsi memasukkan elemen baru di awal list (posisi/indeks 0) karena LinkedList mengimplementasikan interface Deque (Stack behavior). Akibatnya, "Mei-mei" menjadi elemen pertama (getFirst()), sedangkan elemen terakhir (getLast()) tetap "Al-Qarni", dan ukuran total bertambah menjadi 6.

5 & 6. terlihat sama saja ![alt text](image.png)

Percobaan 2:
1. push() adalah method bawaan dari class Stack yang digunakan untuk memasukkan elemen ke atas tumpukan (operasi LIFO). Mengembalikan nilai elemen yang di-push.

add() adalah method turunan dari interface Collection/List. Kegunaannya sama-sama menyisipkan elemen di akhir Vector/Stack, namun ia mengembalikan nilai boolean (true jika berhasil).

2. ![alt text](<Pertanyaan 2 Percobaan 2 Collection-1.png>)
Maka loop variasi di bawahnya tidak akan mencetak item apa pun (kosong). Hal ini terjadi karena pada loop while (!fruits.empty()) sebelumnya, semua elemen stack sudah dikeluarkan habis menggunakan fungsi .pop().

3. Baris tersebut melakukan perulangan (looping) menggunakan objek Iterator. Selama it.hasNext() bernilai true (artinya masih ada elemen berikutnya di dalam collection), program akan mengambil elemen tersebut melalui it.next() lalu mencetaknya.

4. ![alt text](<Pertanyaan 4 Percobaan 2 Collection.png>)
Terjadi compile error pada program. Alasannya karena objek bertipe interface List tidak memiliki method push(), pop(), dan empty(). Method-method tersebut merupakan method spesifik milik class Stack.

5. ![Screenshot]![alt text](<Pertanyaan 5 Percobaan 2 Collection-1.png>)

6. ![Screenshot]![alt text](<Pertanyaan 6 Percobaan 2 Collection-1.png>)

Percobaan 3:
1. Konsep yang digunakan dinamakan Varargs (Variable Arguments) (ditandai dengan sintaks ...).

Kelebihannya adalah memberikan fleksibilitas tinggi bagi pemanggil fungsi untuk mengirimkan jumlah argumen objek berapapun secara dinamis (bisa 1 objek, 2 objek, banyak objek sekaligus, bahkan dalam bentuk array) tanpa perlu membuat overloading method berulang kali.

2 & 3. ![alt text](<Pertanyaan 2 & 3 Percobaan 3.png>)

Tugas:
![Screenshot]![alt text](<Tugas Collection-1.png>)
![Screenshot]![alt text](<Tugas Collection 2-1.png>)
![Screenshot]![alt text](<Tugas Collection 3-1.png>)

## 2.1.1. Selection Solution
Continue to report the result....
