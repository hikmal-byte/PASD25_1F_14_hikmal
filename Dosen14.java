public class Dosen14 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen14(String kd, String name, boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    void tampil() {
        String jkString = (jenisKelamin) ? "Laki-laki" : "Perempuan";
        System.out.println("Kode: " + kode + " | Nama: " + nama + " | JK: " + jkString + " | Usia: " + usia);
    }
}