public class BinaryTreeArray14 {
    Mahasiswa14[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray14() {
        this.dataMahasiswa = new Mahasiswa14[100];
        this.idxLast = -1;
    }

    void populateData(Mahasiswa14 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
    public void add(Mahasiswa14 mhs) {
        if (idxLast == -1) {
            dataMahasiswa[0] = mhs;
            idxLast = 0;
            return;
        }
        int currentIdx = 0;
        while (true) {
            if (mhs.ipk < dataMahasiswa[currentIdx].ipk) {
                int leftIdx = 2 * currentIdx + 1;
                if (leftIdx >= dataMahasiswa.length) {
                    System.out.println("Array penuh, tidak bisa insert!");
                    return;
                }
                if (dataMahasiswa[leftIdx] == null) {
                    dataMahasiswa[leftIdx] = mhs;
                    if (leftIdx > idxLast) idxLast = leftIdx;
                    return;
                }
                currentIdx = leftIdx;
            } else {
                int rightIdx = 2 * currentIdx + 2;
                if (rightIdx >= dataMahasiswa.length) {
                    System.out.println("Array penuh, tidak bisa insert!");
                    return;
                }
                if (dataMahasiswa[rightIdx] == null) {
                    dataMahasiswa[rightIdx] = mhs;
                    if (rightIdx > idxLast) idxLast = rightIdx;
                    return;
                }
                currentIdx = rightIdx;
            }
        }
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}
