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
![Screenshot]![alt text](Percobaan 2.png)
![Screenshot]![alt text](Percobaan 3.png)
![Screenshot]![alt text](Percobaan 4.png)
![Screenshot]![alt text](Jobsheet 7 Percobaan 1.png)
![Screenshot]![alt text](Jobsheet 7 Percobaan 1 Part 2.png)
![Screenshot]![alt text](Jobsheet 7 Percobaan 2.png)
![Screenshot]![alt text](Jobsheet 7 Percobaan 2 Part 2.png)
![Screenshot]![alt text]()


Pertanyaan Percobaan 1 Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer :
1. if (data[j-1] > data[j])
Program mengecek apakah elemen di sebelah kiri (j-1) memiliki nilai yang lebih besar daripada elemen di sebelah kanan (j). Jika benar, maka posisi kedua elemen tersebut perlu ditukar untuk mengurutkan data (biasanya secara ascending atau dari kecil ke besar).
  temp = data[j]; = Nilai elemen kanan disimpan sementara di variabel temp.
  data[j] = data[j-1]; = Nilai elemen kiri dipindahkan ke posisi kanan. Sekarang posisi kanan berisi nilai yang lebih besar.
  data[j-1] = temp; = Nilai yang tadi save di temp (nilai elemen kanan asli) dimasukakan ke posisi kiri. maka Fungsinya untuk menukar posisi 2 elemen yang bersebelahan dalam sebuah array jika urutannya tidak sesuai (elemen kiri lebih besar dari kanan)

2. ![Screenshot]![alt text](Pertanyaan Percobaan 1 no.2.png)

3. Heart Condition dari Insertion Sort yang menentukan kapan sebuah elemen harus digeser. Ada 2 syarat yang harus terpenuhi agar looping berjalan:
   J >= 0: Memastikan indeks tidak keluar dari batas array (mencapai elemen paling pertama).
   data[j] > temp: Checking apakah elemen kiri (data[j]) lebih besar dari elemen yang sedang kita pegang (temp). Jika lebih besar, berarti posisi temp seharusnya berada lebih ke kiri lagi, sehingga elemen data[j] perlu digeser ke kanan.

4. data[j+1] = data[j]
Tujuan dari perintah ini adalah untuk menggeser elemen ke posisi kanan.

Karena kita ingin memasukkan temp ke posisi yang benar, kita harus "membuka jalan" dengan cara memindahkan elemen-elemen yang nilainya lebih besar ke indeks berikutnya (j+1). Proses ini dilakukan berulang kali dalam perulangan while sampai ditemukan posisi yang tepat untuk menaruh nilai temp.

Pertanyaan Percobaan 2:

1. i = i < listMhs.length - 1: Karena dalam Bubble Sort, kalau punya $n$ data, kita hanya butuh melakukan maksimal $n-1$ tahap untuk memastikan seluruh data terurut. Ketika $n-1$ elemen sudah berada di posisi benar, elemen terakhir otomatis akan berada di posisi tepat.
j = j < listMhs.length - i: Pada setiap tahap (setiap selesainya perulangan i), satu nilai terbesar akan "terapung" ke paling kanan. Oleh karena itu, tak perlu lagi mengecek elemen-elemen di ujung kanan yang sudah pasti terurut. Penggunaan - i bertujuan agar proses perbandingan semakin sedikit di setiap tahapnya, sehingga program menjadi lebih efisien.
kalau banyak data adalah 50: Looping i berlangsung: 49 kali (dari 0-48).
Tahap bubble sort: Ada 49 tahap (iterasi luar).
2. ![alt text](<Percobaan 2 Pertanyaan 2.png>)
Pertanyaan Percobaan 3:
1. int idxMin = i; = menginisialisasi variabel idxMin dengan indeks saat ini (i). Asumsinya, elemen di posisi i adalah yang terkecil untuk sementara.
for (int j = i + 1; j < listMhs.length; j++) = Looping untuk menelusuri elemen-elemen setelah posisi i hingga akhir array (listMhs.length).
if (listMhs[j].ipk < listMhs[idxMin].ipk) = terjadinya proses perbandingan. Program mengecek apakah nilai ipk pada indeks j lebih kecil daripada nilai ipk yang saat ini dianggap terkecil (idxMin).
idxMin = j; = Jika ditemukan IPK yang lebih kecil, maka idxMin akan diperbarui dengan indeks j tersebut.
Proses ini bertujuan untuk menentukan posisi (indeks) data mahasiswa yang memiliki IPK paling rendah dalam satu fase iterasi. Setelah perulangan j selesai, nilai di idxMin akan ditukar (swap) dengan nilai di posisi i agar data terurut secara ascending (dari yang terkecil ke terbesar).
Pertanyaan Percobaan 4:
1. ![alt text](<Percobaan 4 Pertanyaan 1.png>)
![alt text](<Percobaan 4 Pertanyaan part 2.png>)
Tugas:
![alt text](<Tugas 1.png>)
![alt text](<Tugas 1 Part 2.png>)

Pertanyaan Percobaan 1 Jobsheet 7:
1. tampilPosisi: menunjukkan indeks/letak urutan data dalam array. Outputnya biasanya berupa angka contohnya: "Data ditemukan pada indeks ke-2.
   tampilDataSearch: menampilkan detail konten dari objek yang dicari secara lengkap (Seperti Nama, NIM, IPK) setelah data tersebut dipastikan ditemukan pada posisi tertentu.
2. Fungsi break pada Kode Tersebut
Fungsi perintah break di sana adalah untuk menghentikan proses perulangan (looping) secara paksa segera setelah kondisi if (listMhs[j].ipk == cari) terpenuhi (data ditemukan).
Hal ini dilakukan demi efisiensi program; jika data sudah ketemu, program tidak perlu lagi mengecek sisa elemen array yang lain.
3. Fungsi Variabel pos atau Indeks Hasil Pencarian
Variabel pos (atau sering diinisialisasi dengan -1) berfungsi sebagai:
Penanda (Flag): Jika nilainya berubah dari -1, berarti data ditemukan.
Penyimpan Alamat: Menyimpan lokasi indeks di mana nilai yang dicari berada, sehingga data tersebut bisa dipanggil kembali atau ditampilkan pada tahap berikutnya.
4. Jika Terdapat Lebih dari Satu Data yang Sama
Pada algoritma Sequential Search yang menggunakan break seperti pada gambar:
Program akan menampilkan data yang pertama kali ditemukan (urutan paling awal).
Penjelasan: Karena begitu program menemukan kecocokan pertama, perintah break langsung memutus perulangan, sehingga data serupa di posisi selanjutnya tidak akan sempat diperiksa.
5. Apa yang Terjadi Jika break Dihapus?
Jika break dihapus, maka akan terjadi dua hal:
Iterasi Berlanjut: Program akan terus memindai seluruh isi array sampai elemen terakhir, meskipun data sudah ditemukan di awal. Ini membuat program menjadi kurang efisien secara performa.
Data Terakhir yang Disimpan: Jika terdapat data duplikat (seperti pada poin nomor 4), variabel posisi akan terus diperbarui hingga mencapai data terakhir yang ditemukan. Hasil pencarian yang ditampilkan nantinya adalah posisi data yang muncul paling akhir dalam list.

Pertanyaan Percobaan 2 Jobsheet 7:

1. & 2. ![alt text](<Jobsheet 7 Pertanyaan Percobaan 2.png>)

3. left: Menyimpan indeks batas awal (Paling Kiri) dari rentang array yang sedang diperiksa.
   Right: Menyimpan indeks batas akhir (paling kanan) dari rentang array yang sedang diperiksa.
   mid: Menhyimpan nilai indeks tengah yang digunakan sebagai acuan untuk membandingkan apakah data yang dicari sama dengan, lebih besar, atau lebih kecil dari data di posisi tersebut.

4. Kalau data IPK tidak urut: tak berjalan benar (wrong results/not found mesikpun ada datanya). Hal ini dikarenakan syarat mutlak algoritma Binary Search adalah data harus dalam keadaan terurut agar logika pembagian rentang (Lebih besar/kecil dari nilai tengah) dapat berfungsi valid.

5. ![alt text](<Jobsheet 7 Pertanyaan no.5 Percobaan 2 Part 2.png>)
   ![alt text](<Jobsheet 7 Pertanyaan no.5 Percobaan 2.png>)

6. Binary Search menentukan data tidak ditemukan jika kondisi if (right >= left) sudah tidak terpenuhi lagi (nilai left menjadi lebih besar dari right). Pada titik ini, rentang pencarian telah habis diperiksa dan method akan mengembalikan nilai -1.

7. ![alt text](<Jobsheet 7 Pertanyaan no.7 Percobaan 2.png>)
   ![alt text](<Jobsheet 7 Pertanyaan no.7 Percobaan 2 Part 2.png>)



## 2.1.1. Selection Solution
Continue to report the result....
