public class Mahasiswa14 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa14() {
    }

    public Mahasiswa14(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilkanInformasi() {
        System.out.println(nama);
        System.out.println(nim);
        System.out.println(kelas);
        System.out.println(ipk);
    }
}