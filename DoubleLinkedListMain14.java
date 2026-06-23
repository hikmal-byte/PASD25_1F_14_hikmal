import java.util.Scanner;

public class DoubleLinkedListMain14 {

    public static Mahasiswa14 inputMahasiswa(Scanner hikmal14) {
        System.out.print("Masukkan NIM   : ");
        String nim = hikmal14.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = hikmal14.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = hikmal14.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = hikmal14.nextDouble();
        hikmal14.nextLine();
        return new Mahasiswa14(nim, nama, kelas, ipk);
    }
    public static void main(String[] args) {
        Scanner hikmal14 = new Scanner(System.in);
        DoubleLinkedList14 list = new DoubleLinkedList14();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = hikmal14.nextInt();
            hikmal14.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa14 mhsAwal = inputMahasiswa(hikmal14);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa14 mhsAkhir = inputMahasiswa(hikmal14);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = hikmal14.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa14 dataBaru = inputMahasiswa(hikmal14);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
        hikmal14.close();
    }
}
