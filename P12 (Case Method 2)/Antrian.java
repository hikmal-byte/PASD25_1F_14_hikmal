public class Antrian {
    
    Pembeli head;
    Pembeli tail;

    int size;
    int nomorAntrian = 0;

    Antrian() {
        head = null;
        tail = null;
        size = 0;
    }

    void tambahAntrian(String nama, String hp) {

        nomorAntrian++;

        Pembeli baru = new Pembeli(
            nomorAntrian,
            nama,
            hp);
        if (head == null) {

            head = baru;
            tail = baru;

        } else {

            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }

        size++;

        System.out.println("Antrian berhasil ditambahkan");
    }

    Pembeli hapusAntrian() {

        if (head == null) {
            System.out.println("Antrian kosong");
            return null;
        }

        Pembeli hapus = head;

        if (head == tail) {

            head = null;
            tail = null;

        } else {

            head = head.next;
            head.prev = null;
        }

        size--;

        return hapus;
    }

    void cetakAntrian() {

        if (head == null) {
            System.out.println("Antrian kosong");
            return;
        }

        Pembeli current = head;

        System.out.println("======================================");
        System.out.println("DAFTAR ANTRIAN");
        System.out.println("======================================");
        System.out.printf("%-5s %-15s %-15s\n",
                "No",
                "Nama",
                "No HP");

        while (current != null) {

            System.out.printf("%-5d %-15s %-15s\n",
                current.noAntrian,
                current.namaPembeli,
                current.noHp);
            
            current = current.next;
        }

        System.out.println("======================================");
    }

    boolean isEmpty() {
        return head == null;
    }
}
