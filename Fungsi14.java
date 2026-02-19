public class Fungsi14 {
    public static void hitungPendapatandanStatus(int[][] stok, int[] harga) {
        System.out.println("=== Laporan Pendapatan RoyalGarden ===\n");

        for (int i = 0; i < stok.length; i++) {
            int pendapatan = 0;

            for (int j = 0; j < stok[i].length; j++) {
                pendapatan+= stok[i][j] * harga[j];
            }

            String status;
            if (pendapatan > 1500000) {
                status = "Sangat Baik";
            } else {
                status = "Perlu Evaluasi";
            }

            System.out.println("RoyalGarden " + (i + 1) + " : Rp " + pendapatan);
            System.out.println("Status        : " + status);
            System.out.println("-----------------------------------");
        }
    }

    public static void main(String[] args) {
        int[][] stockBunga = {
            {10, 5, 15, 7},  // RoyalGarden 1
            {6, 11, 9, 12},  // RoyalGarden 2
            {2, 10, 10, 5},  // RoyalGarden 3
            {5, 7, 12, 9}    // RoyalGarden 4
        };

        int[] hargaBunga = {75000, 50000, 60000, 10000};

        hitungPendapatandanStatus(stockBunga, hargaBunga);
    }
}