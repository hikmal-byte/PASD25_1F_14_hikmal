|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020241|
| Nama |  Hikmal Fadhillah Rasyid Andro Mulyawan |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/jti-polinema/-01-contoh-laporan-react) |

# Labs #1 Programming Fundamentals Review

## 2.1.1. Selection Solution

The solution is implemented in Pemilihan1.java, and below is screenshot of the result.

![Screenshot](Percobaan 1 P10.png)
![Screenshot](Percobaan 2 P10.png)
![Screenshot](Percobaan 2 P10 Part 2.png)


**Brief explanaton:** There are 4 main step: 
1. Input all grades
2. Validate the input
3. Calculate and convert the final grade
4. Decide the final status

## 2.1.1. Selection Solution
Pertanyaan Percobaan 1:
1. Karena nilai -1 menandakan bahwa Queue dalam kondisi kosong dan belum memiliki indeks data yang valid (karena indeks array di Java dimulai dari 0). Jika diinisialisasi dengan 0, sistem akan menganggap sudah ada elemen di dalam array pada indeks ke-0, padahal datanya belum diinputkan.

2 & 3. if (rear == max - 1) {
        rear = 0;
        }

Baris tersebut digunakan untuk menerapkan konsep Circular Queue (Antrian Melingkar). Kegunaannya adalah jika posisi rear (penunjuk belakang) sudah mencapai batas akhir indeks array (max - 1), namun antrian di bagian depan sudah ada yang kosong (akibat proses Dequeue), maka posisi rear akan dipindahkan berputar kembali ke indeks 0 agar ruang kosong tersebut bisa digunakan kembali.
Sama halnya dengan Enqueue, baris ini mengatur perputaran indeks pada Circular Queue. Ketika data terdepan yang berada di batas akhir indeks array (max - 1) diambil (di-Dequeue), posisi pointer front (penunjuk depan) selanjutnya harus berputar kembali ke indeks 0 untuk menunjuk data antrian berikutnya.

4. Karena posisi elemen terdepan di dalam Queue tidak selalu berada di indeks 0 (akibat dari operasi Dequeue yang menggeser front dan sifat circular). Oleh karena itu, pencetakan data antrian yang benar harus dimulai dari indeks tempat elemen terdepan saat itu berada (front) hingga mencapai posisi rear.

5. i = (i + 1) % max;

Baris ini digunakan untuk menggeser indeks pencetakan i ke elemen berikutnya secara melingkar. Dengan menggunakan operasi modulus % max, ketika nilai i mencapai batas akhir array (max - 1), operasi (max - 1 + 1) % max akan menghasilkan 0. Ini memastikan perulangan tetap bisa membaca data yang berputar kembali ke indeks depan array.

6. Sifat FIFO ditunjukkan saat pengambilan data (Dequeue) selalu mengacu pada posisi indeks front (paling depan), bukan posisi acak atau belakang:

dt = data[front]; // Mengambil data yang paling lama/dulu masuk di posisi front
size--;
if (IsEmpty()) {
    front = rear = -1;
} else {
    if (front == max - 1) {
        front = 0;
    } else {
        front++; // Menggeser front ke antrian berikutnya
    }
}

7. ![alt text](<Pertanyaan Percobaan 1.png>)

Pertanyaan Percobaan 2:
1. Atribut data berfungsi sebagai kontainer atau wadah penyimpanan bertipe array untuk menampung objek-objek dari class Mahasiswa. Dengan menggunakan array ini, program dapat menyimpan banyak data mahasiswa secara terstruktur di dalam antrian berdasarkan prinsip Circular Queue.

2. Baris kode tersebut digunakan untuk mengimplementasikan sifat melingkar (Circular Queue). Dengan operasi modulus % max, ketika indeks rear sudah mencapai batas akhir array (max - 1), indeks berikutnya akan otomatis berputar kembali ke indeks 0 (jika antrian depan sudah kosong karena telah dilayani). Hal ini mencegah pemborosan memori pada array.

3. Method tambahAntrian bertipe void karena fungsinya hanya memasukkan data objek mahasiswa baru ke dalam antrian tanpa perlu mengirimkan data atau status kembali ke pemanggil fungsi.

Method layaniMahasiswa mengembalikan tipe Mahasiswa karena elemen terdepan yang keluar dari antrian perlu diambil datanya untuk kemudian diproses atau ditampilkan datanya kepada pengguna (misal: memanggil nama mahasiswa yang sedang dilayani di menu utama).

4. ![alt text](<Pertanyaan Percobaan 2.png>)
   ![alt text](<Pertanyaan Percobaan 2 Part 2.png>)

Tugas:
![alt text](TugasJobsheet10.png)
![alt text](<TugasJobsheet10 Part 2.png>)
![alt text](<TugasJobsheet10 Part 3.png>)
![alt text](<TugasJobsheet10 Part 4.png>)