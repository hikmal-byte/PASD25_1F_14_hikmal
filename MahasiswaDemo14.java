import java.util.Scanner;

public class MahasiswaDemo14 {
    public static void main(String[] args) {
        Scanner hikmal14 = new Scanner(System.in);
        Mahasiswa14[] arrayOfMahasiswa = new Mahasiswa14[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa14();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa[i].nim  = hikmal14.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa[i].nama  = hikmal14.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa[i].kelas  = hikmal14.nextLine();
            System.out.print("IPK   : ");
            dummy = hikmal14.nextLine();
            arrayOfMahasiswa[i].ipk  = Float.parseFloat(dummy);
             System.out.println("------------------------------------");
        }

        System.out.println("\n======= DATA MAHASISWA =======");
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa[i].cetakInfo();
        }

        // Mengisi data Mahasiswa indeks ke-0
        arrayOfMahasiswa[0] = new Mahasiswa14();
        arrayOfMahasiswa[0].nim = "244107060033";
        arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa[0].kelas = "SIB-1E";
        arrayOfMahasiswa[0].ipk = (float) 3.75;

        // Mengisi data Mahasiswa indeks ke-1
        arrayOfMahasiswa[1] = new Mahasiswa14();
        arrayOfMahasiswa[1].nim = "2341720172";
        arrayOfMahasiswa[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa[1].kelas = "TI-2A";
        arrayOfMahasiswa[1].ipk = (float) 3.36;

        // Mengisi data Mahasiswa indeks ke-2
        arrayOfMahasiswa[2] = new Mahasiswa14();
        arrayOfMahasiswa[2].nim = "244107023006";
        arrayOfMahasiswa[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa[2].kelas = "TI-2E";
        arrayOfMahasiswa[2].ipk = (float) 3.80;

        // Mencetak data ke layar
        System.out.println("NIM    : " + arrayOfMahasiswa[0].nim);
        System.out.println("Nama   : " + arrayOfMahasiswa[0].nama);
        System.out.println("Kelas  : " + arrayOfMahasiswa[0].kelas);
        System.out.println("IPK    : " + arrayOfMahasiswa[0].ipk);
        System.out.println("------------------------------------");

        System.out.println("NIM    : " + arrayOfMahasiswa[1].nim);
        System.out.println("Nama   : " + arrayOfMahasiswa[1].nama);
        System.out.println("Kelas  : " + arrayOfMahasiswa[1].kelas);
        System.out.println("IPK    : " + arrayOfMahasiswa[1].ipk);
        System.out.println("------------------------------------");

        System.out.println("NIM    : " + arrayOfMahasiswa[2].nim);
        System.out.println("Nama   : " + arrayOfMahasiswa[2].nama);
        System.out.println("Kelas  : " + arrayOfMahasiswa[2].kelas);
        System.out.println("IPK    : " + arrayOfMahasiswa[2].ipk);
        System.out.println("------------------------------------");
    }
}