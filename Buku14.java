public class Buku14 {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    public Buku14(String kodeBuku, String judul, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilBuku() {
        System.out.println("Kode: " + kodeBuku);
        System.out.println("Judul: " + judul);
        System.out.println("Tahun: " + tahunTerbit);
    }
}