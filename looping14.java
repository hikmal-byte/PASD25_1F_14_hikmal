
import java.util.Scanner;

public class looping14 {
    public static void main(String[] args) {
        Scanner hikmal14 = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String NIM = hikmal14.next();

        String duaDigitTerakhir = NIM.substring(NIM.length() - 2);

        int n = Integer.parseInt(duaDigitTerakhir);

        if (n < 10) {
            n+= 10;
        }

        System.out.println("Nilai n = " + n);
        System.out.print("Output: ");

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print("# ");
            }

            else if (i % 2 == 0) {
                System.out.print(i + " ");
            }

            else {
                System.out.print("* ");
            }
        }

        System.out.println();
    }
}