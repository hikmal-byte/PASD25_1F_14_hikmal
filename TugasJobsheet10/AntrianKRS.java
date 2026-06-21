public class AntrianKRS {
    MahasiswaKRS[] data;
    int front;
    int rear;
    int size;
    int max;
    int totalDiprosesKRS;
    int maxKuotaDPA = 30;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new MahasiswaKRS[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.totalDiprosesKRS = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void mengosongkanAntrian() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void menambahkanAntrian(MahasiswaKRS mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, mahasiswa tidak dapat masuk antrian saat ini.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil mendaftar ke antrian KRS.");
    }

    // Memanggil antrian untuk proses KRS: 1x panggilan langsung mengambil 2 mahasiswa
    public void panggilProsesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang diproses.");
            return;
        }
        
        System.out.println("=== MEMPROSES KRS MAHASISWA ===");
        int jumlahDipanggil = (size >= 2) ? 2 : 1; 
        
        for (int i = 0; i < jumlahDipanggil; i++) {
            MahasiswaKRS mhs = data[front];
            System.out.print("Diproses: ");
            mhs.tampilkanData();
            
            front = (front + 1) % max;
            size--;
            totalDiprosesKRS++;
        }
        System.out.println("Selesai memproses " + jumlahDipanggil + " mahasiswa.");
    }

    public void menampilkanSemuaAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Semua Mahasiswa dalam Antrian:");
        System.out.println("No. \t NIM \t NAMA \t PRODI \t KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". \t ");
            data[index].tampilkanData();
        }
    }

    public void menampilkan2Terdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar 2 Antrian Terdepan:");
        int jumlahTampil = (size >= 2) ? 2 : 1;
        for (int i = 0; i < jumlahTampil; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    public void menampilkanAntrianAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Antrian Paling Akhir:");
        data[rear].tampilkanData();
    }

    public void cetakLaporanStatistik() {
        System.out.println("=== Statistik Antrian ===");
        System.out.println("Jumlah mahasiswa dalam antrian saat ini: " + size);
        System.out.println("Jumlah mahasiswa yang SUDAH proses KRS : " + totalDiprosesKRS);
        int belumKRS = maxKuotaDPA - totalDiprosesKRS;
        System.out.println("Sisa kuota mahasiswa yang BELUM diproses DPA: " + (belumKRS < 0 ? 0 : belumKRS));
    }
}