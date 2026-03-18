import java.util.Scanner;
import minggu5.Pangkat14;

public class  MainPangkat14 {
    public static void main(String[] args) {
        Scanner hikmal14 = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen = hikmal14.nextInt();

        Pangkat14[] png = new Pangkat14[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i + 1) + ": ");
            int basis = hikmal14.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i + 1) + ": ");
            int pangkat = hikmal14.nextInt();

            png[i] = new Pangkat14(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE:");
        for (int i = 0; i < elemen; i++) {
            System.out.println(png[i].nilai + "^" + png[i].pangkat + ": " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }

        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
        for (int i = 0; i < elemen; i++) {
            System.out.println(png[i].nilai + "^" + png[i].pangkat + ": " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}