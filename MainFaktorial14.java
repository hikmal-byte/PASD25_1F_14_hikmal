import java.util.Scanner;
import minggu5.Faktorial14;

public class MainFaktorial14 {
    public static void main(String[] args) {
        Scanner hikmal14 = new Scanner(System.in);

        System.out.println("------------------\\n");
        System.out.print("Masukkan Nilai: ");
        int nilai = hikmal14.nextInt();

        Faktorial14 fk = new Faktorial14();

        System.out.println("------------------");
        System.out.println("Nilai faktorial "+ nilai +" menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial "+ nilai +" menggunakan DC: " + fk.faktorialDC(nilai));
        System.out.println("------------------");

        hikmal14.close();
    }
}