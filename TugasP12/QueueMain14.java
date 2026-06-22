import java.util.Scanner;

public class QueueMain14 {
    public static void main(String[] args) {
        Scanner hikmal14 = new Scanner(System.in);
        System.out.print("Masukkan Kapasitas Maksimal Antrian: ");
        int maks = hikmal14.nextInt();
        hikmal14.nextLine();

        QueueLinkedList14 q = new QueueLinkedList14(maks);
        int pilihan;

        do {
            System.out.println("\n=== MENU UNIT KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian (Daftar)");
            System.out.println("2. Panggil Antrian (Selesai Pelayanan)");
            System.out.println("3. Cek Antrian Terdepan & Terakhir");
            System.out.println("4. Cek Jumlah Pengantre");
            System.out.println("5. Lihat Seluruh Antrian");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("7. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = hikmal14.nextInt();
            hikmal14.nextLine();

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan NIM  : "); String nim = hikmal14.nextLine();
                    System.out.print("Masukkan Nama : "); String nama = hikmal14.nextLine();
                    q.enqueue(new MahasiswaTugas14(nim, nama));
                }
                case 2 -> q.dequeue();
                case 3 -> q.peek();
                case 4 -> q.displaySize();
                case 5 -> q.displayQueue();
                case 6 -> q.clear();
                case 7 -> System.out.println("Selesai.");
                default -> System.out.println("Menu tidak valid!");
            }
        } while (pilihan != 7);
    }
}
