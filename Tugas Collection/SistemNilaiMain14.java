import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.List;
import java.util.*;

public class SistemNilaiMain14 {
    static List<Mahasiswa14> listMahasiswa = new ArrayList<>();
    static List<MataKuliah14> listMK = new ArrayList<>();
    static List<Nilai14> listNilai = new ArrayList<>();
    static Queue<Mahasiswa14> antreanHapusMhs = new LinkedList<>();

    public static void initDataDummy() {
        listMahasiswa.add(new Mahasiswa14("20001", "Thalhah", "021xxx"));
        listMahasiswa.add(new Mahasiswa14("20002", "Zubair", "021xxx"));
        listMahasiswa.add(new Mahasiswa14("20003", "Abdur-Rahman", "021xxx"));
        listMahasiswa.add(new Mahasiswa14("20004", "Sa'ad", "021xxx"));
        listMahasiswa.add(new Mahasiswa14("20005", "Sa'id", "021xxx"));
        listMahasiswa.add(new Mahasiswa14("20006", "Ubaidah", "021xxx"));

        listMK.add(new MataKuliah14("00001", "Internet of Things", 3));
        listMK.add(new MataKuliah14("00002", "Algoritma dan Struktur Data", 2));
        listMK.add(new MataKuliah14("00003", "Algoritma dan Pemrograman", 2));
        listMK.add(new MataKuliah14("00004", "Praktikum Algoritma dan Struktur Data", 3));
        listMK.add(new MataKuliah14("00005", "Praktikum Algoritma dan Pemrograman", 3));
    }

    public static void main(String[] args) {
        initDataDummy();
        Scanner hikmal14 = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("*************************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("*************************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Daftarkan Antrean Hapus Mahasiswa (Queue)");
            System.out.println("6. Eksekusi Hapus Mahasiswa Paling Depan (Queue)");
            System.out.println("7. Keluar");
            System.out.print("Pilih: ");
            pilih = hikmal14.nextInt();
            hikmal14.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data\nKode: ");
                    String kodeNilai = hikmal14.nextLine();
                    System.out.print("Nilai: ");
                    double n = hikmal14.nextDouble();
                    hikmal14.nextLine();

                    System.out.println("\nDAFTAR MAHASISWA");
                    System.out.println("NIM\t| Nama\t\t| Telf");
                    for (Mahasiswa14 m : listMahasiswa) {
                        System.out.println(m.nim + "\t| " + m.nama + "\t| " + m.telf);
                    }
                    System.out.print("Pilih mahasiswa by nim: ");
                    String pilihNim = hikmal14.nextLine();
                    Mahasiswa14 mhsTerpilih = null;
                    for (Mahasiswa14 m : listMahasiswa) {
                        if (m.nim.equalsIgnoreCase(pilihNim)) {
                            mhsTerpilih = m;
                            break;
                        }
                    }

                    System.out.println("\nDAFTAR MATA KULIAH");
                    System.out.println("Kode\t| Mata Kuliah\t\t\t\t| SKS");
                    for (MataKuliah14 mk : listMK) {
                        System.out.println(mk.kode + "\t| " + mk.nama + "\t\t| " + mk.sks);
                    }
                    System.out.print("Pilih MK by kode: ");
                    String pilihKodeMK = hikmal14.nextLine();
                    MataKuliah14 mkTerpilih = null;
                    for (MataKuliah14 mk : listMK) {
                        if (mk.kode.equalsIgnoreCase(pilihKodeMK)) {
                            mkTerpilih = mk;
                            break;
                        }
                    }

                    if (mhsTerpilih != null && mkTerpilih != null) {
                        listNilai.add(new Nilai14(mhsTerpilih, mkTerpilih, n));
                        System.out.println("Data nilai berhasil ditambahkan!");
                    } else {
                        System.out.println("NIM atau Kode MK tidak ditemukan!");
                    }
                    break;

                case 2:
                    System.out.println("\nDAFTAR NILAI MAHASISWA");
                    System.out.println("Nim\t| Nama\t\t| Mata Kuliah\t\t\t| SKS\t| Nilai");
                    for (Nilai14 nl : listNilai) {
                        System.out.println(nl.mhs.nim + "\t| " + nl.mhs.nama + "\t| " + nl.mk.nama + "\t| " + nl.mk.sks + "\t| " + nl.nilai);
                    }
                    break;

                case 3:
                    System.out.print("Masukkan data mahasiswa [nim]: ");
                    String cariNim = hikmal14.nextLine();
                    System.out.println("\nDAFTAR NILAI MAHASISWA DICARI");
                    System.out.println("Nim\t| Nama\t\t| Mata Kuliah\t\t\t| SKS\t| Nilai");
                    int totalSKS = 0;
                    for (Nilai14 nl : listNilai) {
                        if (nl.mhs.nim.equals(cariNim)) {
                            System.out.println(nl.mhs.nim + "\t| " + nl.mhs.nama + "\t| " + nl.mk.nama + "\t| " + nl.mk.sks + "\t| " + nl.nilai);
                            totalSKS += nl.mk.sks;
                        }
                    }
                    System.out.println("Total SKS " + totalSKS + " telah diambil.");
                    break;

                case 4:
                    // Mengurutkan berdasarkan Nilai secara ascending/descending
                    Collections.sort(listNilai, new Comparator<Nilai14>() {
                        @Override
                        public int compare(Nilai14 n1, Nilai14 n2) {
                            return Double.compare(n1.nilai, n2.nilai);
                        }
                    });
                    System.out.println("\nDAFTAR NILAI MAHASISWA (URUT BY NILAI)");
                    System.out.println("Nim\t| Nama\t\t| Mata Kuliah\t\t\t| Nilai\t| SKS");
                    for (Nilai14 nl : listNilai) {
                        System.out.println(nl.mhs.nim + "\t| " + nl.mhs.nama + "\t| " + nl.mk.nama + "\t| " + nl.nilai + "\t| " + nl.mk.sks);
                    }
                    break;

                case 5: // Memasukkan Mahasiswa ke Queue untuk dihapus
                    System.out.print("Masukkan NIM mahasiswa yang dimasukkan antrean hapus: ");
                    String qNim = hikmal14.nextLine();
                    Mahasiswa14 mhsQ = null;
                    for (Mahasiswa14 m : listMahasiswa) {
                        if (m.nim.equals(qNim)) {
                            mhsQ = m;
                            break;
                        }
                    }
                    if (mhsQ != null) {
                        antreanHapusMhs.add(mhsQ);
                        System.out.println("Mahasiswa " + mhsQ.nama + " masuk antrean hapus.");
                    } else {
                        System.out.println("Mhasiswa tidak ditemukan.");
                    }
                    break;

                case 6: // Mengeluarkan antrean depan (FIFO) & menghapus dari sistem utama
                    if (!antreanHapusMhs.isEmpty()) {
                        Mahasiswa14 mhsDihapus = antreanHapusMhs.poll();
                        listMahasiswa.remove(mhsDihapus);
                        // Menghapus record nilainya juga agar sinkron
                        listNilai.removeIf(nl -> nl.mhs.nim.equals(mhsDihapus.nim));
                        System.out.println("Mahasiswa " + mhsDihapus.nama + " [NIM: " + mhsDihapus.nim + "] berhasil dihapus dari sistem.");
                    } else {
                        System.out.println("Antrean hapus kosong!");
                    }
                    break;
            }
        } while (pilih != 7);

        System.out.println("Terima Kasih. Program selesai");
    }
}