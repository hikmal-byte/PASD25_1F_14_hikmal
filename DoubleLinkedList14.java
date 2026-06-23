public class DoubleLinkedList14 {
    Node14 head;
    Node14 tail;
    int size;

    public DoubleLinkedList14() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
    
    public int getSize() {
        return size;
    }

    public void addFirst(Mahasiswa14 data) {
        Node14 newNode = new Node14(data);
        if (isEmpty()) {
            head =  tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa14 data) {
        Node14 newNode = new Node14(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertAfter(String keyNim, Mahasiswa14 data) {
        Node14 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node14 newNode = new Node14(data);
        
        if(current == tail) {
            newNode.prev = current;
            newNode.next = current.next;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void add(int index, Mahasiswa14 data) {
        if (index < 0 || index > size) {
            System.out.println("Indeks di luar batas.");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node14 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node14 newNode = new Node14(data);
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node14 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node14 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong.");
            return;
        }
        Mahasiswa14 deletedData = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        System.out.println("Data berhasil dihapus:");
        deletedData.tampil();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong.");
            return;
        }
        Mahasiswa14 deletedData = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        System.out.println("Data berhasil dihapus:");
        deletedData.tampil();
    }

    public void removeAfter(String keyNim) {
        Node14 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Tidak ada data setelah NIM " + keyNim + " untuk dihapus.");
            return;
        }
        Node14 target = current.next;
        Mahasiswa14 deletedData = target.data;
        if (target == tail) {
            current.next = null;
            tail = current;
        } else {
            current.next = target.next;
            target.next.prev = current;
        }
        size--;
        System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus:");
        deletedData.tampil();
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Indeks di luar batas.");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node14 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Mahasiswa14 deletedData = current.data;
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
            System.out.println("Data indeks ke-" + index + " berhasil dihapus:");
            deletedData.tampil();
        }
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
        } else {
            System.out.println("Data Pertama:");
            head.data.tampil();
        }
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
        } else {
            System.out.println("Data Terakhir:");
            tail.data.tampil();
        }
    }

    public void getIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Indeks di luar batas.");
            return;
        }
        Node14 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.println("Data pada indeks ke-" + index + ":");
        current.data.tampil();
    }
}