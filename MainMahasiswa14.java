import java.util.Scanner;
import minggu5.Mahasiswa14;

public class MainMahasiswa14 {

    // 1. Mencari Nilai UTS Tertinggi (Divide and Conquer)
    public static int cariMaxUTS(Mahasiswa14[] arr, int low, int high) {
        if (low == high) return arr[low].nilaiUTS; // Base case: 1 elemen

        int mid = (low + high) / 2;
        int leftMax = cariMaxUTS(arr, low, mid);
        int rightMax = cariMaxUTS(arr, mid + 1, high);

        return Math.max(leftMax, rightMax);
    }

    // 2. Mencari Nilai UTS Terendah (Divide and Conquer)
    public static int cariMinUTS(Mahasiswa14[] arr, int low, int high) {
        if (low == high) return arr[low].nilaiUTS;

        int mid = (low + high) / 2;
        int leftMin = cariMinUTS(arr, low, mid);
        int rightMin = cariMinUTS(arr, mid + 1, high);

        return Math.min(leftMin, rightMin);
    }

    // 3. Menghitung Rata-rata UAS (Brute Force)
    public static double hitungRataUAS(Mahasiswa14[] arr) {
        double total = 0;
        for (Mahasiswa14 m : arr) {
            total += m.nilaiUAS; // Iterasi linear satu per satu
        }
        return total / arr.length;
    }

    public static void main(String[] args) {
        Scanner hikmal14 = new Scanner(System.in);
        Mahasiswa14[] daftar = {
            new Mahasiswa14("Ahmad", 78, 82),
            new Mahasiswa14("Budi", 85, 88),
            new Mahasiswa14("Cindy", 90, 87),
            new Mahasiswa14("Dian", 76, 79),
            new Mahasiswa14("Eko", 92, 95),
            new Mahasiswa14("Fajar", 88, 85),
            new Mahasiswa14("Gina", 80, 83),
            new Mahasiswa14("Hadi", 82, 84)
        };

        int n = daftar.length - 1;

        System.out.println("=== HASIL ANALISIS DATA ===");
        System.out.println("UTS Tertinggi (D&C) : " + cariMaxUTS(daftar, 0, n));
        System.out.println("UTS Terendah  (D&C) : " + cariMinUTS(daftar, 0, n));
        System.out.printf("Rata-rata UAS (BF)  : %.3f\n", hitungRataUAS(daftar));
    }
}