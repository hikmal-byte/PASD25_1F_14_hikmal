public class MataKuliah14 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah14() {

    }

    public MataKuliah14(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilkanInformasi() {
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nama MK     : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sks);
    }

    void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jam bertambah. Total jam sekarang: " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (this.jumlahJam >= jam) {
            this.jumlahJam -= jam;
        System.out.println("Jam berkurang. Total jam sekarang: " + jumlahJam);
    } else {
        System.out.println("Pengurangan tidak dapat dilakukan! Jam tidak mencukupi.");
    }
    }
}