public class Stack {
    
    String[] data;

    int top;
    int size;

    Stack(int size) {

        this.size = size;

        data = new String[size];

        top = -1;
    }

    void push(String isi) {

        if (top == size - 1) {

            System.out.println("Stack penuh");
            return;
        }

        top++;

        data[top] = isi;
    }

    void tampilRiwayat() {

        if (top == -1) {

            System.out.println("Riwayat kosong");
            return;
        }

        System.out.println("=== RIWAYAT ===");

        for (int i = top; i >= 0; i--) {
            
            System.out.println(data[i]);
        }
    }
}
