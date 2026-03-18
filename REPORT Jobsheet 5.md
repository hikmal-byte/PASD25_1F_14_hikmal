|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020241|
| Nama |  Hikmal Fadhillah Rasyid Andro Mulyawan |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/jti-polinema/-01-contoh-laporan-react) |

# Labs #1 Programming Fundamentals Review

## 2.1.1. Selection Solution

The solution is implemented in Pemilihan1.java, and below is screenshot of the result.

![Screenshot]![alt text](Percobaan1.png)
![Screenshot]![alt text](Percobaan2.png)
![Screenshot]![alt text](<Hasil Percobaan2.png>)
![Screenshot]![alt text](Percobaan3.png)
![Screenshot]![alt text](Tugas1.png)
![Screenshot]![alt text](<Tugas 1 Part 2.png>)
![Screenshot]![alt text](<Hasil Tugas 1.png>)


Pertanyaan Percobaan 1 Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer :
1. If (Base Case): Stop Conditions. Tanpa ini, Fungsi terus melakukan infinity Self Calling. ini akan menentukan nilai terkecil yang sudah diketahui hasilnya secara pasti yakni: (1! = 1).
Sedangkan Else (Recursion Step): dimana proses ini "Divide" & "Conquer" terjadi. Masalah besar (n!) dipecah menjadi masalah yang lebih kecil (n - 1) dengan cara memanggil fungsi itu sendiri.
2. Lebih dari memungkinkan. karena bisa pakai looping while/do-while karena intinya adalah melakukan iterasi selama kondisi tertentu terpenuhi.
(Bukti menggunakan while termasuk dalam public class faktorial tersebut)
3. fakto *= i; (Iteratif/Brute Force): sebuah operasi pembaruan nilai. Variabel fakto yang sudah ada di memori ditimpa dengan hasil perkalian baru. Sangat hemat memori karena hanya dengan satu "wadah" variabel yang sama terus-menerus.

int fakto = n * faktorialDC(n-1); (Rekursif/DC):
sebuah delayed operation yang belum bisa memrogramkan hitungan hasil perkalian karena harus menunggu jawaban dari faktorialDC(n-1). Setiap kali baris ini dipanggil, komputer membuka "lembaran baru" (stack frame) di memori untuk menyimpan nilai n saat itu sampai proses rekursi selesai.
4. FaktorialBF() (Brute Force): Gaya penulisannya menggunakan (For/While) looping. dengan maju selangkah demi selangkah dari 1 - n. memori Lebih efisien karena tak menumpuk function calling dengan kecepatan lebih cepat untuk perhitungan sederhana.
sedangkan Divide Conquer/ FaktorialDC() pakai rekursi (Self function recalling). berantas masalah dari n ke bawah sampai menyentuh base case. memori nya memakan lebih banyak stack karena setiap panggilan disimpan. kecepatannya lebih elegan dan mudah dibaca untuk masalah yang sifatnya bercabang.

Pertanyaan Percobaan 2:

1.pangkat Brute Force: dengan pendekatan iteratif dengan for looping algoritma ini mengalikan angka basis sebanyak n kali secara berurutan. Kompleksistas waktunya adalah O(n).
sedangkan pangkat divide dan conquer itu dengan pendekatan rekursif dengan membagi pangkat menjadi 2 bagian (n/2). Jika pangkat genap, ia menghitung (an/2)x(an/2). Jika ganjil, ia menghitung $(a^{n/2}) \times (a^{n/2}) \times a$. Ini jauh lebih efisien untuk pangkat yang besar karena mengurangi jumlah perkalian secara signifikan.
2. Sebenarnya tahap combine sudah termasuk karena terjadinya dengan baris return di dalam blok else.
disebabkan Kode return (pangkatDC(a, n/2) * pangkatDC(a, n/2)) adalah proses mengalikan (menggabungkan) hasil dari sub-masalah yang telah dipecah sebelumnya untuk mendapatkan hasil akhir.
3. Sebenarnya kurang relevan secara prinsip Object Oriented Programming (OOP) jika tujuannya hanya menghitung nilai yang ada di dalam objek itu sendiri. Karena nilai dan pangkat sudah disimpan sebagai atribut di kelas Pangkat, method tersebut seharusnya bisa langsung mengakses atribut tersebut tanpa perlu dikirim ulang via parameter.
kalau dibuat tanpa parameter sangat bisa methodnya lebih berish dan memanfaatkan data internal objek.
4. pangkatBF(): Bekerja secara linear. Ia menyelesaikan masalah dengan cara yang paling intuitif bagi manusia: melakukan perkalian satu per satu secara berurutan sampai selesai. Sangat sederhana namun lambat jika pangkat mencapai angka ribuan atau jutaan.pangkatDC(): Bekerja secara logaritmik. Ia tidak menghitung satu per satu, melainkan membelah masalah menjadi dua bagian yang identik. Ibarat ingin menghitung $2^8$, ia tidak melakukan $2 \times 2 \times 2 \dots$ sebanyak 8 kali, tapi cukup menghitung $(2^4) \times (2^4)$. Cara ini meminimalkan langkah kerja komputer secara drastis.

Pertanyaan Percobaan 3:
1. Variabel mid (titik tengah) sangat krusial dalam strategi Divide (pembagian). sebagai penentu batas untuk membagi satu masalah besar (array utuh) menjadi 2 sub-masalah yang lebih kecil (bagian kiri dan bagian kanan). Tanpa mid, program tidak akan tahu di mana harus memotong data untuk diproses secara rekursif.
2. lsum: untuk memerintahkan fungsi untuk fokus mengitung total nilai di bagian kiri array (dari indeks l ke mid).
sedangkan rsum: fungsi perintah untuk fokus menghitunga total nilai di bagian kanan array (dari indeks mid + l sampai r).
pemanggilan kian terus dilakukan hinggan bagian tersebut hanya menyisakan 1 elemen saja.
3. karena termasuk tahap combine(penggabungan). Setelah memecahkan masalah menjadi bagian terkecil dan nilai masing masing bagian ditemukan, kita harus menggabungkan kembali hasil-hasil tersebut agar mendapatkan total keseluruhan. Pertungan memastikan hasil dari cabang kiri & kanan menjadi satu kembali sampai hasil akhir di tingkat paling atas.
4. Base case sebuah kondisi rekursi berhenti agar tidak terjadi infinite loop. Dalam TotalDC(), base case nya adalah: if (l == r) kian terpenuhi ketika indeks kiri sama kanan, yang berarti sub-masalah sudah mengecil hingga hanya tersisa 1 elemen saja. Pada titik ini, fungsi langsung mengembalikan nilai elemen tersebut(return arr[l]).
5. Divide: bagikan array menjadi 2 bagian terus menerus menggunakan variabel mid.
   Conquer: Menyelesaikan perhitungan setiap bagian secara mandiri melalui pemanggilan rekursif hingga mencapai 1 elemen tunggal (base case).
   Combine: Menggabungkan (menjumlahkan) hasil dari setiap bagian kecil tadi secara bertahap hingga kembali menjadi total nilai array yang utuh.

## 2.1.1. Selection Solution
Continue to report the result....
