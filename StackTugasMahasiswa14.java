public class StackTugasMahasiswa14 {
    Mahasiswa14[] stack;
    int size;
    int top;

    public StackTugasMahasiswa14(int size) {
        this.size = size;
        this.stack = new Mahasiswa14[size];
        this.top = -1;
    }

    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi14 stack = new StackKonversi14();
        while (nilai != 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Mahasiswa14 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public  Mahasiswa14 pop() {
        if (!isEmpty()) {
            Mahasiswa14 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa14 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dikumpulkan.");
            return null;
        }
    }
    public Mahasiswa14 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            return null;
        }
    }

    public int getJumlah() {
        return top + 1;
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
}