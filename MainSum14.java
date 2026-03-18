import java.util.Scanner;
import minggu5.Sum14;

public class MainSum14 {
    public static void main(String[] args) {
        Scanner hikmal14 = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = hikmal14.nextInt();

        Sum14 sm = new Sum14(elemen);

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-" + (i + 1) + ": ");
            sm.keuntungan[i] = hikmal14.nextDouble();
        }

        System.out.println("=================================================");
        System.out.println("Total keuntungan menggunakan Bruteforce: " + sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: " + sm.totalDC(sm.keuntungan, 0, elemen - 1));
    }
}