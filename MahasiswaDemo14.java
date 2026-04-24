
import java.util.Scanner;

public class MahasiswaDemo14 {
    public static void main(String[] args) {
        Scanner hikmal14 = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = Integer.parseInt(hikmal14.nextLine());
        MahasiswaBerprestasi14 list = new MahasiswaBerprestasi14(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM    : ");
            String nim = hikmal14.nextLine();
            System.out.print("Nama   : ");
            String nama = hikmal14.nextLine();
            System.out.print("Kelas  : ");
            String kelas = hikmal14.nextLine();
            System.out.print("IPK    :");
            String ip = hikmal14.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("----------------------------------");
            list.tambah(new Mahasiswa14(nim, nama, kelas, ipk));
        }
            System.out.println("Data Mahasiswa Sebelum Sorting: ");
            list.tampil();
            System.out.println("---------------------------------------------------");
            System.out.println("Pencarian Data");
            System.out.println("---------------------------------------------------");
            System.out.println("Masukkan ipk mahasiswa yang dicari: ");
            System.out.print("IPK: ");
            double cari = Double.parseDouble(hikmal14.nextLine());
            System.out.println("----------------------------------");
            System.out.println("Menggunakan Binary Search");
            System.out.println("----------------------------------");
            int posisi2 = list.findBinarySearch(cari,0, jumMhs-1);
            int pss2= (int)posisi2;
            list.tampilPosisi(cari, pss2);
            list.tampilDataSearch(cari, pss2);


            System.out.println("\nMenggunakan Sequential Searching");
            double posisi =list.sequentialSearching(cari);
            int pss= (int)posisi;
            list.tampilPosisi(cari, pss);
            list.tampilDataSearch(cari, pss);
    }
}