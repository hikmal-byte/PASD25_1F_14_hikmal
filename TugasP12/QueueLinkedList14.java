public class QueueLinkedList14 {
    NodeTugas14 front;
    NodeTugas14 rear;
    int size;
    int maxCapacity;

    public QueueLinkedList14(int maxCapacity) {
        this.front = null;
        this.rear = null;
        this.size = 0;
        this.maxCapacity = maxCapacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxCapacity;
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void enqueue(MahasiswaTugas14 input) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak dapat mendaftar.");
            return;
        }
        NodeTugas14 newNode = new NodeTugas14(input, null);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(input.nama + " berhasil masuk antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong! Tidak ada yang dipanggil.");
            return;
        }
        System.out.println("Memanggil antrian: " + front.data.nama + " (" + front.data.nim + ")");
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong.");
            return;
        }
        System.out.println("--- Cek Posisi ---");
        System.out.println("Antrian Terdepan : " +  front.data.nama + " (" + front.data.nim + ")");
        System.out.println("Antrian Terakhir : " +  rear.data.nama + " (" + rear.data.nim + ")");
    }

    public void displaySize() {
        System.out.println("Jumlah mahasiswa dalam antrian saat ini: " + size + " orang.");
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        NodeTugas14 temp = front;
        System.out.println("--- Daftar Seluruh Antrian ---");
        int no = 1;
        while (temp != null) {
            System.out.println(no + ". " + temp.data.nama + " (" + temp.data.nim + ")");
            temp = temp.next;
            no++;
        }
    }
}