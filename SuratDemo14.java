import java.util.Scanner;

public class SuratDemo14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Menginisialisasi kapasitas stack penyimpanan surat sebanyak 10 elemen
        StackSurat14 stack = new StackSurat14(10);
        int pilih;

        do {
            System.out.println("\n=== MENU PENGELOLAAN SURAT IZIN ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat (Berdasarkan Nama)");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu (1-5): ");
            pilih = input.nextInt();
            input.nextLine(); // Membersihkan buffer scanner

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan ID Surat      : ");
                    String id = input.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Kelas         : ");
                    String kelas = input.nextLine();
                    System.out.print("Masukkan Jenis Izin (S=Sakit / I=Izin) : ");
                    char jenis = input.next().toUpperCase().charAt(0);
                    System.out.print("Masukkan Durasi (Hari) : ");
                    int durasi = input.nextInt();
                    
                    Surat14 suratBaru = new Surat14(id, nama, kelas, jenis, durasi);
                    stack.push(suratBaru);
                    break;

                case 2:
                    Surat14 suratDiproses = stack.pop();
                    if (suratDiproses != null) {
                        System.out.println("\n--- Memproses Surat Izin ---");
                        System.out.println("ID Surat " + suratDiproses.idSurat + " milik " + suratDiproses.namaMahasiswa + " telah divalidasi oleh Admin Prodi.");
                    }
                    break;

                case 3:
                    Surat14 suratTeratas = stack.peek();
                    if (suratTeratas != null) {
                        System.out.println("\n--- Surat Izin Teratas (Terakhir Masuk) ---");
                        System.out.println("ID Surat      : " + suratTeratas.idSurat);
                        System.out.println("Nama Mahasiswa: " + suratTeratas.namaMahasiswa);
                        System.out.println("Kelas         : " + suratTeratas.kelas);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan Nama Mahasiswa yang dicari: ");
                    String cariNama = input.nextLine();
                    stack.cariSurat(cariNama);
                    break;

                case 5:
                    System.out.println("Keluar dari program. Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Masukkan angka 1 - 5.");
                    break;
            }
        } while (pilih != 5);
        
        input.close();
    }
}