
import java.util.Scanner;

public class MahasiswaDemo14 {
    public static void main(String[] args) {
        Scanner hikmal14 = new Scanner(System.in);
        MahasiswaBerprestasi14 list = new MahasiswaBerprestasi14();

        int jmlMhs = 5;
        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = hikmal14.nextLine();
            System.out.print("Nama   : ");
            String nama = hikmal14.nextLine();
            System.out.print("Kelas   : ");
            String kelas = hikmal14.nextLine();
            System.out.print("IPK   : ");
            double ipk = hikmal14.nextDouble();
            hikmal14.nextLine();

            Mahasiswa14 m = new Mahasiswa14(nim, nama, kelas, ipk);
            list.tambah(m);
            System.out.println("--------------------------------");
        }

        System.out.println("\nData mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        hikmal14.close();
    }
}