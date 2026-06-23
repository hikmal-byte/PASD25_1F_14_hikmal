|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020241|
| Nama |  Hikmal Fadhillah Rasyid Andro Mulyawan |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/hikmal-byte/PASD25_1F_14_hikmal) |

# Labs #1 Programming Fundamentals Review

## 2.1.1. Selection Solution

The solution is implemented in Pemilihan1.java, and below is screenshot of the result.

![Screenshot]![alt text](<Percobaan 1 Tree.png>)
![Screenshot]![alt text](<Percobaan 2 Tree.png>)
![Screenshot]![alt text](<>)
![Screenshot]![alt text]
![Screenshot]![alt text]
![Screenshot]
![Screenshot]


**Brief explanaton:** There are 4 main step: 

Percobaan 1:
1. Karena BST memiliki aturan penempatan properti yang terstruktur: semua nilai di sub-pohon kiri selalu lebih kecil dari parent, dan semua nilai di sub-pohon kanan selalu lebih besar. Aturan ini memangkas setengah jalur pencarian pada tiap tingkatan (mirip konsep Binary Search), sehingga kompleksitas waktunya bisa mencapai $O(\log n)$ dalam kondisi seimbang, berbeda dengan binary tree biasa yang mengharuskan pengecekan seluruh node ($O(n)$).
2. Atribut left untuk menyimpan referensi/alamat ke node anak sebelah kiri (left child), sedangkan right untuk menunjuk ke node anak sebelah kanan (right child).
3. Main Gate/acuan/referensi titik awal (node paling atas) dari struktur data pohon tersebut. Tanpa adanya root, kita tidak bisa mengakses isi pohon.
namun saat tree pertama kali dibuat bukan bernilai dari root tapi null.
4. Method isEmpty() akan mengembalikan nilai true, sehingga program langsung mengeksekusi blok kondisi if (isEmpty()) dan menunjuk node baru tersebut langsung sebagai root.
5. Baris program tersebut berfungsi melakukan pencarian posisi kosong terbawah (leaf) untuk meletakkan node baru. Logikanya:

parent = current; mengunci node saat ini sebelum melangkah ke level bawahnya.

if (mahasiswa.ipk < current.mahasiswa.ipk) memeriksa apakah IPK baru lebih kecil dari node sekarang. Jika iya, pointer bergerak ke anak kiri (current = current.left). Jika posisi kiri kosong (null), node baru dipasang di situ (parent.left = newNode) dan fungsi selesai.

Bagian else menangani jika IPK baru lebih besar/sama dengan node sekarang, maka pointer bergerak ke anak kanan (current = current.right). Jika kosong, node dipasang di kanan (parent.right = newNode) lalu keluar program.

6. Ketika node target (current) ditemukan memiliki 2 anak, method getSuccessor(current) dipanggil.

getSuccessor() mencari pengganti node tersebut, yaitu mencari nilai terkecil di sub-pohon sebelah kanan (melangkah ke kanan sekali, lalu telusuri anak kiri paling mentok).

Node successor tersebut dicopot dari posisinya semula (bila ada sub-pohon kanan di bawah successor, ia akan dikaitkan ke atasnya).

Node successor dikembalikan ke method delete(), dipasang menggantikan posisi current, lalu menyambung kembali anak kiri asli dari current (successor.left = current.left).

Percobaan 2:
1. Atribut dataMahasiswa (array) digunakan sebagai wadah fisik penyimpanan seluruh node objek dalam tree. Atribut idxLast berfungsi sebagai penanda batas indeks terakhir dari elemen tree yang valid/terisi di dalam array tersebut.
2. menyalin susunan array mahasiswa yang dibuat di class main secara instan ke dalam properti internal class BinaryTreeArray14.
3. explore serta mencetak data-data yang tersusun di dalam pohon biner berbasis array tersebut dengan urutan: Sub-pohon Kiri ke Root/Parent ke Sub-pohon Kanan.
4. Menggunakan rumus representasi array pohon biner:
Left Child: 2 x i + 1 = 2 x 2 + 1 =5
Right Child: 2 x i + 2 = 2 x 2 + 2 =6
5. Menegaskan bahwa data mahasiswa terakhir yang valid terletak pada indeks ke-6 (mhs7), sehingga rekursif pencarian tidak akan melompati batas memori indeks yang tidak diperlukan.
6. Rumus tersebut adalah pemetaan matematis standar untuk merepresentasikan struktur hirarki pohon ke dalam array satu dimensi yang dimulai dari indeks 0. Indeks 2*idxStart+1 memetakan lokasi fisik memori anak kiri, dan 2*idxStart+2 memetakan lokasi anak kanan.


Tugas:
![alt text](<Tugas Praktikum Tree.png>)
## 2.1.1. Selection Solution
Continue to report the result....
