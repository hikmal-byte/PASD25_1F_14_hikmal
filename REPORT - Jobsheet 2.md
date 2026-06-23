|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020241|
| Nama |  Hikmal Fadhillah Rasyid Andro Mulyawan |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/jti-polinema/-01-contoh-laporan-react) |

# Labs #1 Programming Fundamentals Review

## 2.1.1. Selection Solution

The solution is implemented in Pemilihan1.java, and below is screenshot of the result.

![Screenshot]![alt text](<Jobsheet 2 Percobaan 1.png>)
![Screenshot]![alt text](<Jobsheet 2 Percobaan 2 - 3.png>)
![Screenshot]![alt text](<Jobsheet 2 Percobaan 3 Pertanyaan 1.png>)
![Screenshot]![alt text](<Tugas 1 Jobsheet 2.png>)
![Screenshot]![alt text](<Tugas 2 Jobsheet 2.png>)
![Screenshot]
![Screenshot]


**Brief explanaton:** There are 4 main step: 

Percobaan 1: 

1. Mempunyai Sesuatu: seperti Data, Properti, Variabel, State, Atribut.
   Melakukan sesuatu: Tingkah laku, Behaviour, Fungsi, Method
2. NIM, Nama, Kelas dengan tipe data String
   sedangkan IPK termasuk tipe data double
3. tampilkanInformasi(): untuk menampilkan
   data mahasiswa (nama, nim, ipk, dan kelas) ke layar.
   ubahKelas(String kelasBaru): Digunakan untuk mengubah nilai atribut kelas dengan nilai yang baru.
   updateIpk(double ipkBaru): Digunakan untuk memperbarui nilai atribut ipk.
   nilaiKinerja(): Digunakan untuk menentukan kategori kinerja (Sangat baik, baik, cukup, atau kurang) berdasarkan nilai ipk.
4. Decide the final status
5. Method sebagai struktur kontrol percabangan bertingkat (if-else if-else).
   memeriksa nilai atribut ipk milik mahasiswa dan membandingkannya dengan ambang batas (threshold) tertentu secara berurutan dari nilai tertinggi ke rendah. Begitu 1 kondisi terpenuhi, method akan langsung mengembailkan hasil dan berhenti mengecek kondisi di bawahnya.

   Kriterianya:
   IPK ≥ 3.5: Mendapatkan predikat "Kinerja sangat baik".

   IPK ≥ 3.0 (dan di bawah 3.5): Mendapatkan predikat "Kinerja baik".

   IPK ≥ 2.0 (dan di bawah 3.0): Mendapatkan predikat "Kinerja cukup".

   IPK < 2.0 (kondisi else): Mendapatkan predikat "Kinerja kurang".

   sedangkan return valuenya: untuk mengembalikan sebuah data String isi tersebut adalah kalimat yang mendeskripsikan kategori kinerja mahasiswa sesuai checking results kondisi IPK tadi. contohnya Jika 1 mahasiswa punya ipk = 3.2, maka saat nilaiKinerja() dipanggil, method tersebut akan mereturn teks "Kinerja baik". 

   Percobaan 2: 
   1. ![alt text](<Screenshot 2026-04-15 132322.png>)
   Instansiasi Pertama:
   Baris Kode: Mahasiswa14 mhs1 = new Mahasiswa14();
   Nama Objek: mhs1

   Instansiasi Kedua:
   Baris Kode: Mahasiswa14 mhs2 = new Mahasiswa14("Annisa Nabila", "2141720160", 3.25, "TI 2L");
   Nama Objek: mhs2
   2. saya menggunakan operator titik (.) dengan format: namaObjek.namaAtribut atau namaObjek.namaMethod().
   3. Hasil output pada pemanggilan pertama dan kedua untuk objek mhs1 berbeda karena terjadi perubahan status (state) pada objek tersebut di antara kedua pemanggilan tersebut.
   Begini Peristiwanya:
   Pemanggilan Pertama: Menampilkan data awal yang telah diinput (Kelas: "SI 2J", IPK: 3.55).
   Proses Perubahan: Program menjalankan method mhs1.ubahKelas("SI 2K") dan mhs1.updateIpk(3.60). Method ini mengubah nilai yang tersimpan di dalam memori untuk objek mhs1.
   Pemanggilan Kedua: Saat tampilkanInformasi() dipanggil kembali, ia mengambil nilai terbaru yang sudah diperbarui, sehingga output menunjukkan Kelas "SI 2K" dan IPK 3.60.
   Catatan: Inilah inti dari OOP; objek menyimpan datanya sendiri, dan kita dapat mengubah data tersebut melalui method agar mencerminkan kondisi terbaru.

   Percobaan 3:
   1. ![alt text](<Percobaan 3 Pertanyaan 1.png>) konstruktor parameter dideclared pada bagian akhir class untuk menginisialisasi atribut langsung saat objek dibuat.
   2. Baris tersebut merupakan proses instansiasi objek menggunakan konstruktor berparameter.
   Mahasiswa14 mhs2: Mendeklarasikan variabel mhs2 dengan tipe data class Mahasiswa14.
   new: Keyword untuk mengalokasikan memori bagi objek baru.
   Mahasiswa14(...): Memanggil konstruktor berparameter untuk mengisi nilai atribut nama, nim, ipk, dan kelas secara sekaligus pada saat objek diciptakan.
   3. Kalau menghapus konstruktor default (public Mahasiswa14() {}):
   Hasil: Program akan mengalami error compile pada baris Mahasiswa14 mhs1 = new Mahasiswa14();.
   Penjelasan: Dalam Java, jika kita tidak menulis konstruktor sama sekali, Java akan menyediakan default constructor secara otomatis. Namun, jika kita sudah menulis satu konstruktor berparameter, Java tidak akan lagi menyediakan konstruktor default secara otomatis. Karena mhs1 dipanggil tanpa parameter, compiler tidak menemukan konstruktor yang sesuai.
   4. Setelah instansiasi, method di dalam class tidak harus diakses secara berurutan.
   Alasan: Method dipanggil berdasarkan kebutuhan logika program. Setiap method bersifat independen terhadap method lainnya selama data yang dibutuhkan (atribut) sudah tersedia. Anda bisa memanggil updateIpk() sebelum atau sesudah tampilkanInformasi(), tergantung kapan Anda ingin mengubah atau melihat data tersebut.
   5. Sesuai dengan datanya,![alt text](<Percobaan 2 - 3.png>)
   6. 

   Tugas 1:
![alt text](<Tugas 1 Jobsheet 2.png>)
   Tugas 2:
![alt text](<Tugas 2 Jobsheet 2.png>)

## 2.1.1. Selection Solution
Continue to report the result....
