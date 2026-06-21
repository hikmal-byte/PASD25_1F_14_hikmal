import java.util.Scanner;

public class MainKRS {
    public static void main(String[] args) {
        Scanner hikmal14 = new Scanner(System.in);
        // Jumlah kapasitas antrian maksimal ditentukan 10 sesuai instruksi tugas
        AntrianKRS antrian = new AntrianKRS(10); 
        int pilihan;

        do {
            System.out.println("\n=== SISTEM ANTRIAN KRS DOSEN PEMBINA AKADEMIK ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil Antrian untuk Proses KRS (2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Cetak Statistik Antrian & Status KRS");
            System.out.println("7. Kosongkan Semua Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = hikmal14.nextInt();
            hikmal14.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = hikmal14.nextLine();
                    System.out.print("Nama  : ");
                    String nama = hikmal14.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = hikmal14.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = hikmal14.nextLine();
                    
                    MahasiswaKRS mhs = new MahasiswaKRS(nim, nama, prodi, kelas);
                    antrian.menambahkanAntrian(mhs);
                    break;
                case 2:
                    antrian.panggilProsesKRS();
                    break;
                case 3:
                    antrian.menampilkanSemuaAntrian();
                    break;
                case 4:
                    antrian.menampilkan2Terdepan();
                    break;
                case 5:
                    antrian.menampilkanAntrianAkhir();
                    break;
                case 6:
                    antrian.cetakLaporanStatistik();
                    break;
                case 7:
                    antrian.mengosongkanAntrian();
                    break;
                case 0:
                    System.out.println("Sistem ditutup. Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan Menu Tidak Valid!");
            }
        } while (pilihan != 0);
        hikmal14.close();
    }
}