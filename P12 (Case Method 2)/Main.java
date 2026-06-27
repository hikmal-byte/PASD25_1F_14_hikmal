import java.util.Scanner;

public class Main {

    static Scanner hikmal14 = new Scanner(System.in);

    static Antrian antrian = new Antrian();
    static Pemesanan pesanan = new Pemesanan();
    static Stack riwayat = new Stack(20);

    static void menu() {
        
        System.out.println("======================================");
        System.out.println("SISTEM ANTRIAN ROYAL DELISH");
        System.out.println("======================================");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian");
        System.out.println("4. Laporan Pesanan");
        System.out.println("5. Cari Pesanan");
        System.out.println("6. Riwayat");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu : ");
    }

    static void tambahAntrian() {

        System.out.print("Nama Pembeli : ");
        String nama = hikmal14.nextLine();

        System.out.print("No HP : ");
        String hp = hikmal14.nextLine();

        antrian.tambahAntrian(nama, hp);

        riwayat.push("Tambah antrian " + nama);
    }

    static void hapusAntrian() {

        Pembeli pembeli = antrian.hapusAntrian();

        if (pembeli == null) {
            return;
        }

        System.out.println("Melayani : "
                + pembeli.namaPembeli);

        System.out.print("Kode Pesanan : ");
        int kode = Integer.parseInt(hikmal14.nextLine());

        System.out.print("Nama Pesanan : ");
        String namaPesanan = hikmal14.nextLine();

        System.out.print("Harga : ");
        int harga = Integer.parseInt(hikmal14.nextLine());

        pesanan.tambahPesanan(
                kode,
                namaPesanan,
                harga,
                pembeli.namaPembeli);

        riwayat.push("Pesanan "
                + namaPesanan
                + " oleh "
                + pembeli.namaPembeli);
    }

    static void laporanPesanan() {

        if (pesanan.isEmpty()) {

            System.out.println("Belum ada pesanan");
            return;
        }

        Pesanan[] arr = pesanan.toArray();

        Sorting.mergeSort(arr, 0, arr.length - 1);

        pesanan.fromArray(arr);

        Pesanan current = pesanan.head;

        int total = 0;

        System.out.println("==============================================");
        System.out.println("LAPORAN PESANAN");
        System.out.println("==============================================");

        while (current != null) {

            System.out.println(
                    current.kodePesanan + " | " +
                            current.namaPesanan + " | " +
                            current.harga + " | " +
                            current.namaPembeli);

            total += current.harga;

            current = current.next;
        }

        System.out.println("==============================================");
        System.out.println("Total Pendapatan : " + total);
    }

    static void cariPesanan() {

        if (pesanan.isEmpty()) {

            System.out.println("Belum ada pesanan");
            return;
        }

        System.out.print("Cari nama pesanan : ");
        String cari = hikmal14.nextLine();

        Pesanan[] arr = pesanan.toArray();

        Sorting.mergeSort(arr, 0, arr.length - 1);

        int hasil = Searching.binarySearch(arr, cari);

        if (hasil != -1) {

            System.out.println("Pesanan ditemukan");

            System.out.println(
                    arr[hasil].kodePesanan + " | " +
                            arr[hasil].namaPesanan + " | " +
                            arr[hasil].harga + " | " +
                            arr[hasil].namaPembeli);

        } else {

            System.out.println("Pesanan tidak ditemukan");
        }
    }

    public static void main(String[] args) {

        int pilih;

        do {

            menu();

            pilih = Integer.parseInt(hikmal14.nextLine());

            System.out.println();

            switch (pilih) {

                case 1:
                    tambahAntrian();
                    break;

                case 2:
                    antrian.cetakAntrian();
                    break;

                case 3:
                    hapusAntrian();
                    break;

                case 4:
                    laporanPesanan();
                    break;

                case 5:
                    cariPesanan();
                    break;

                case 6:
                    riwayat.tampilRiwayat();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }

            System.out.println();

        } while (pilih != 0);
    }
}