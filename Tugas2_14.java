import java.util.Scanner;

public class Tugas2_14 {
    public static void main(String[] args) {
        Scanner hikmal14 = new Scanner(System.in);

        System.out.println("Program Pengelola Jadwal Kuliah");
        System.out.println("===============================");
        
        System.out.print("Masukkan Jumlah Jadwal (n): ");
        int n = hikmal14.nextInt();
        String[][] jadwal = new String[n][4];

        for (int i = 0; i < n; i++) {
            System.out.println("\nData ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            jadwal[i][0] = hikmal14.nextLine();
            System.out.print("Ruang           : ");
            jadwal[i][1] = hikmal14.nextLine();
            System.out.print("Hari            : ");
            jadwal[i][2] = hikmal14.nextLine();
            System.out.print("Jam            :  ");
            jadwal[i][3] = hikmal14.nextLine();
        }

        tampilkanTabel(jadwal);

        System.out.print("\nMasukkan Hari Yang Dicari");
        String cariHari = hikmal14.nextLine();
        filterJadwal(jadwal, cariHari, 2);

        System.out.print("\nMasukkan Nama MK yang dicari: ");
        String cariMK = hikmal14.nextLine();
        filterJadwal(jadwal, cariMK, 0);
    }

        public static void tampilkanTabel(String[][] data) {
        System.out.println("\n--- Seluruh Jadwal Kuliah ---");
        System.out.printf("%-20s | %-10s | %-10s | %-10s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        for (String[] row : data) {
            System.out.printf("%-20s | %-10s | %-10s | %-10s\n", row[0], row[1], row[2], row[3]);
        }
    }

        public static void filterJadwal(String[][] data, String keyword, int colIndex) {
        System.out.println("Hasil Pencarian '" + keyword + "':");
        for (String[] row : data) {
            if (row[colIndex].equalsIgnoreCase(keyword)) {
                System.out.printf("- %s (%s) di %s jam %s\n", row[0], row[1], row[2], row[3]);
            }
        }
    }
}