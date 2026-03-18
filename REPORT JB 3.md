|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020241|
| Nama |  Hikmal Fadhillah Rasyid Andro Mulyawan |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/hikmal-byte/PASD25_1F_14_hikmal/tree/main) |

# Labs #1 Programming Fundamentals Review

## 2.1.1. Selection Solution

The solution is implemented in Pemilihan1.java, and below is screenshot of the result.

![Screenshot]![alt text](<Percobaan 1-2.png>)
![Screenshot]![alt text](<Percobaan 1-2 part 2.png>)
![Screenshot]![alt text](<Percobaan 1-2 Part 3.png>)
![Screenshot]![alt text](<Hasil Percobaan 1-2.png>)
![Screenshot]![alt text](<Hasil Percobaan 1-2 (Modif).png>)
![Screenshot]![alt text](<Percobaan 3.png>)
![Screenshot]![alt text](<Percobaan 3 Part 2.png>)
![Screenshot]![alt text](<Percobaan 3 Part 3.png>)
![Screenshot]![alt text](<Modif Percobaan 1.png>)
![Screenshot]![alt text](<Modif P1 Part 2.png>)
![Screenshot]![alt text](<Modif P1 Part 3.png>)
![Screenshot]![alt text](<Hasil Percobaan 3.png>)
![Screenshot]![alt text](<Pertanyaan Percobaan 3.png>)
![Screenshot]![alt text](<Pertanyaan Percobaan 3 Part 2.png>)
![Screenshot]![alt text](<Pertanyaan Percobaan 3 Part 3.png>)
![Screenshot]![alt text](<Pertanyaan Percobaan 3 Part 4.png>)
![Screenshot]![alt text](<Pertanyaan Percobaan 3 Part 5.png>)
![Screenshot]![alt text](<Pertanyaan Percobaan 3 Hasil.png>)
![Screenshot]![alt text](<Tugas 1.png>)
![Screenshot]![alt text](<Tugas 1 Part 2.png>)
![Screenshot]![alt text](<Hasil Tugas 1.png>)
![Screenshot]![alt text](<Tugas 2.png>)
![Screenshot]![alt text](<Tugas 2 Part 2.png>)
![Screenshot]![alt text](<Hasil Tugas 2.png>)

Pertanyaan Percobaan 1:
1. Opsional namun sebuah class basicnya adalah blueprint bisa dengan hanya atribut saja (sering disebut Data Class/Plain Old Java Object/POJO) untuk menyimpan data. juga bisa dengan method saja (biasanya Utility class) tapi dalam Objek Orientasi Pemrograman yang ideal, sebuah class biasanya punya keduanya untuk presentasikan atribut dan metode dari objek tersebut
2. Baris tersebut untuk declare dan instansiasi array yang dapat menampung objek dari class mahasiswa.
Mahasiswa [3] = menyiapkan 3 slot kosong (indeks 0, 1, & 2) di dalam memori Baris ini belum membuat objek Mahasiswa. sekarang, isi tiap indeks ini masih bernilai null bahwa kasus ini amatlah penting
3. arrayOfMahasiswa[0] = new Mahasiswa();
Secara teknis iya, sudah memiliki konstruktor. Meskipun tidak dengan konstruktor eksplisit di dalam kode, tapi java secara otomatis menyediakan Default Constructor (konstruktor tanpa parameter). Itulah sebabnya mengapa tetap bisa memanggil new Mahasiswa() untuk membuat objek baru.
4. new Mahasiswa(): Membuat objek Mahasiswa nyata di memori dan menyimpannya di indeks ke-().
arrayOfMahasiswa[0].nim = ... (dan seterusnya): Mengisi atribut nim, nama, kelas, dan ipk milik objek yang berada di indeks ke-0 tersebut dengan nilai yang spesifik.
5. Class Mahasiswa: Entity/Model Data (define the structure objects)
MahasiswaDemo: Driver Class/Main Class yang menjalankan program (main method), melakukan input/output, dan mengelola logika jalannya aplikasi.
Pemisahannya membuat kode lebih rapi, mudah dikelola, dan memungkinkan class Mahasiswa digunakan kembali di bagian program lain tanpa harus membawa logika demonstrasinya.

Pertanyaan Percobaan 2:
1.  ![Screenshot]![alt text](<Modif Percobaan 1.png>)
    ![Screenshot]![alt text](<Modif P1 Part 2.png>)
    ![Screenshot]![alt text](<Modif P1 Part 3.png>)
2. dikarenakan NullPointerException ketika baru membuat "rak" nya saja, tapi belum dengan "isi" di dalam rak tersebut. teknisnya, baris Mahasiswa[] myArrayOfMahasiswa = new Mahasiswa[3]; hanya mengalokasikan memori untuk array yang bisa menampung 3 objek, tetapi setiap indeks di dalamnya masih bernilai null.

saat mencoba mengakses myArrayOfMahasiswa[0].nim, program bakal error karena objek Mahasiswa pada indeks ke-0 belum diinstansiasi (belum dengan kata kunci new).

Pertanyaan Percobaan 3:
1.bisa karena konsep tersebut dikenal dengan Overloading Constructor. Sama seperti memesan kopi dengan berbagai "cara" (Misalkan: hanya memesan cappucino atau kopi susu gula, espresso, dan lain lain.) juga bisa dengan objek dari satu class dengan berbagai cara tergantung data yang kita miliki saat itu.
karena dengan lebih dari 1 Constructor, program kian lebih fleksibel.

## 2.1.1. Selection Solution
Continue to report the result....
