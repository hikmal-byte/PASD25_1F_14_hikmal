import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa14 {
    List<Mahasiswa14> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa14... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa14 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    // --- Jawaban Pertanyaan No 2: Binary Search ---
    int binarySearch(String nim) {
        // Sebelum melakukan binary search, data list HARUS diurutkan berdasarkan NIM
        this.sortingAsc(); 
        
        List<String> nims = new ArrayList<>();
        for (Mahasiswa14 m : mahasiswas) {
            nims.add(m.nim);
        }
        return Collections.binarySearch(nims, nim);
    }

    // --- Jawaban Pertanyaan No 3: Sorting Prosedur ---
    public void sortingAsc() {
        Collections.sort(mahasiswas, new Comparator<Mahasiswa14>() {
            @Override
            public int compare(Mahasiswa14 m1, Mahasiswa14 m2) {
                return m1.nim.compareTo(m2.nim);
            }
        });
    }

    public void sortingDesc() {
        Collections.sort(mahasiswas, new Comparator<Mahasiswa14>() {
            @Override
            public int compare(Mahasiswa14 m1, Mahasiswa14 m2) {
                return m2.nim.compareTo(m1.nim);
            }
        });
    }

    public static void main(String[] args) {
        ListMahasiswa14 lm = new ListMahasiswa14();
        Mahasiswa14 m = new Mahasiswa14("201234", "Noureen", "021xx1");
        Mahasiswa14 m1 = new Mahasiswa14("201235", "Akhleema", "021xx2");
        Mahasiswa14 m2 = new Mahasiswa14("201236", "Shannum", "021xx3");

        lm.tambah(m, m1, m2);
        System.out.println("--- Tampil Awal ---");
        lm.tampil();

        System.out.println("\n--- Setelah Update ---");
        lm.update(lm.linearSearch("201235"), new Mahasiswa14("201235", "Akhleema Lela", "021xx2"));
        lm.tampil();
    }
}
