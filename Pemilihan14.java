import java.util.Scanner;

public class Pemilihan14 {
    public static void main(String[] args) {
        Scanner hikmal14 = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        
        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTgs = hikmal14.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double nilaiKuis = hikmal14.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = hikmal14.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = hikmal14.nextDouble();
        
        System.out.println("==============================");
        System.out.println("==============================");

        if (nilaiTgs < 0 || nilaiTgs > 100 || nilaiKuis < 0 || nilaiKuis > 100 || 
            nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0 || nilaiUAS > 100) {
            
            System.out.println("nilai tidak valid");
            System.out.println("==============================");
            System.out.println("==============================");
            
        } else {
            double nilaiAkhir = (0.2 * nilaiTgs) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
            
            String nilaiHuruf;
            if (nilaiAkhir > 80) nilaiHuruf = "A";
            else if (nilaiAkhir > 73) nilaiHuruf = "B+";
            else if (nilaiAkhir > 65) nilaiHuruf = "B";
            else if (nilaiAkhir > 60) nilaiHuruf = "C+";
            else if (nilaiAkhir > 50) nilaiHuruf = "C";
            else if (nilaiAkhir > 39) nilaiHuruf = "D";
            else nilaiHuruf = "E";

            System.out.println("nilai akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("==============================");
            System.out.println("==============================");

            if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
                System.out.println("TIDAK LULUS");
            } else {
                System.out.println("SELAMAT ANDA LULUS");
            }
        }
        
        hikmal14.close();
    }
}