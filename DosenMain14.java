public class DosenMain14 {
    public static void main(String[] args) {
        Dosen14 d1 = new Dosen14();
        d1.idDosen = "DSN01";
        d1.nama = "Dr. Andi Wijaya";
        d1.statusAktif = true;
        d1.tahunBergabung = 2015;
        d1.bidangKeahlian = "Kecerdasan Buatan";

        Dosen14 d2 = new Dosen14("DSN02", "Siti Aminah, M.T.", false, 2020, "Rekayasa Perangkat Lunak");

        System.out.println("--- Informasi Dosen 1 ---");
        d1.tampilkanInformasi();
        System.out.println("Masa Kerja: " + d1.hitungMasaKerja(2026) + " tahun");
        d1.ubahKeahlian("Data Science");

        System.out.println("\n--- Informasi Dosen 2 ---");
        d2.tampilkanInformasi();
        d2.setStatusAktif(true);
        System.out.println("Masa Kerja: " + d2.hitungMasaKerja(2026) + " tahun");
    }
}