public class DataDosen14 {
    Dosen14[] dataDosen = new Dosen14[10];
    int idx = 0;

    void tambah(Dosen14 dsn){
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j - 1].usia > dataDosen[j].usia) {
                    Dosen14 temp = dataDosen[j - 1];
                    dataDosen[j - 1] = dataDosen[j];
                    dataDosen[j] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen14 temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen14 temp = dataDosen[i];
            int j = i - 1;
            while (j >= 0 && dataDosen[j].usia < temp.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = temp;
        }
    }
}