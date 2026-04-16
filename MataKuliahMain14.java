public class MataKuliahMain14 {
    public static void main(String[] args) {
        MataKuliah14 mk1 = new MataKuliah14();
        mk1.kodeMK = "INFO1";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        MataKuliah14 mk2 = new MataKuliah14("INFO2", "Basis Data", 2, 4);

        System.out.println("--- Informasi Mata Kuliah 1 ---");
        mk1.tampilkanInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);

        System.out.println("\n--- Informasi Mata Kuliah 2 ---");
        mk2.tampilkanInformasi();
        mk2.kurangiJam(10);
    }
}