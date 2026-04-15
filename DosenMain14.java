
import java.util.Scanner;


public class DosenMain14 {
    public static void main(String[] args) {
        Scanner hikmal14 = new Scanner(System.in);
        DataDosen14 data = new DataDosen14();
        int pilih;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Bubble Sort - Termuda)");
            System.out.println("4. Sorting DSC (Selection Sort - Tertua)");
            System.out.println("5. Keluar");
            System.out.println("Pilih: ");
            pilih = hikmal14.nextInt();
            hikmal14.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode: "); String kd = hikmal14.nextLine();
                    System.out.print("Nama: "); String nm = hikmal14.nextLine();
                    System.out.print("Jenis Kelamin (L=true/P=false): "); boolean jk = hikmal14.nextBoolean();
                    System.out.print("Usia: "); int us = hikmal14.nextInt();
                    data.tambah(new Dosen14(kd, nm, jk, us));
                    break;
                case 2:
                    System.out.println("\n--- Daftar Dosen ---");
                    data.tampil();
                    break;
                case 3:
                data.sortingASC();
                System.out.println("Data berhasil diurutkan (ASC).");
                break;
                case 4:
                    data.sortingDSC();
                    System.out.println("Data berhasil diurutkan (DSC).");
                    break;
            }
        } while (pilih != 5);
    }
}