public class Pemesanan {
    
    Pesanan head;
    Pesanan tail;

    int size;

    Pemesanan() {

        head = null;
        tail = null;
        size = 0;
    }

    void tambahPesanan(
            int kode,
            String nama,
            int harga,
            String pembeli) {

        Pesanan baru = new Pesanan(
                kode,
                nama,
                harga,
                pembeli);
        
                if (head == null) {

                    head = baru;
                    tail = baru;

                } else {

                    tail.next = baru;
                    baru.prev = tail;
                    tail = baru;
                }

                size++;

        }

        Pesanan[] toArray() {

            Pesanan[] arr = new Pesanan[size];

            Pesanan current = head;

            int i = 0;

            while (current != null) {

                arr[i] = current;

                current = current.next;

                i++;
            }

            return arr;
        }

        void fromArray(Pesanan[] arr) {

            head = null;
            tail = null;

            for (int i = 0; i < arr.length; i++) {
                
                arr[i].next = null;
                arr[i].prev = null;

                if (head == null) {

                    head = arr[i];
                    tail = arr[i];

                } else {

                    tail.next = arr[i];
                    arr[i].prev = tail;
                    tail = arr[i];
                }
            }
        }

    boolean isEmpty() {
        return head == null;
    }
}
