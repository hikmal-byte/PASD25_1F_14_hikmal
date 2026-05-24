public class StackSurat14 {
    Surat14[] dataSurat;
    int size;
    int top;

    public StackSurat14(int size) {
        this.size = size;
        this.dataSurat = new Surat14[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    // Menu 1: Terima Surat Izin (Push)
    public void push(Surat14 srt) {
        if (!isFull()) {
            top++;
            dataSurat[top] = srt;
            System.out.println("Surat izin atas nama " + srt.namaMahasiswa + " berhasil diterima.");
        } else {
            System.out.println("Stack Penuh! Tidak dapat menerima surat izin lagi.");
        }
    }

    // Menu 2: Proses Surat Izin (Pop)
    public Surat14 pop() {
        if (!isEmpty()) {
            Surat14 srt = dataSurat[top];
            top--;
            return srt;
        } else {
            System.out.println("Stack Kosong! Tidak ada surat izin yang perlu diproses.");
            return null;
        }
    }

    // Menu 3: Lihat Surat Izin Terakhir (Peek)
    public Surat14 peek() {
        if (!isEmpty()) {
            return dataSurat[top];
        } else {
            System.out.println("Stack Kosong! Belum ada surat izin yang masuk.");
            return null;
        }
    }

    // Menu 4: Cari Surat berdasarkan Nama Mahasiswa
    public void cariSurat(String nama) {
        if (isEmpty()) {
            System.out.println("Stack Kosong! Pencarian tidak dapat dilakukan.");
            return;
        }
        
        boolean ditemukan = false;
        // Melakukan penelusuran dari tumpukan teratas hingga terbawah
        for (int i = top; i >= 0; i--) {
            if (dataSurat[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("\nSurat Ditemukan pada indeks tumpukan ke-" + i);
                System.out.println("ID Surat      : " + dataSurat[i].idSurat);
                System.out.println("Nama Mahasiswa: " + dataSurat[i].namaMahasiswa);
                System.out.println("Kelas         : " + dataSurat[i].kelas);
                System.out.println("Jenis Izin    : " + (dataSurat[i].jenisIzin == 'S' ? "Sakit" : "Izin keperluan lain"));
                System.out.println("Durasi        : " + dataSurat[i].durasi + " hari");
                ditemukan = true;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Surat izin atas nama \"" + nama + "\" tidak ditemukan.");
        }
    }
}