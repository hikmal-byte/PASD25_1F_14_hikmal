
import java.util.Scanner;

public class Array14 {
    public static void main(String[] args) {
        Scanner hikmal14 = new Scanner(System.in);

        String[] mataKuliah = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking & Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan & Kesehatan Kerja"
        };

        double[] nilaiAngka = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];

        System.out.println("========================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("========================");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan Nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = hikmal14.nextDouble();

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A"; bobotNilai[i] = 4.0;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+"; bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B"; bobotNilai[i] = 3.0;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "B+"; bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "B+"; bobotNilai[i] = 2.0;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+"; bobotNilai[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E"; bobotNilai[i] = 0.0;
            }
        }

        System.out.println("========================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("========================");

        System.out.printf("%-40s %-12s %-12s %-12s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        
        double totalNilaiKaliSks = 0;
        int totalSks = 0;
        // Asumsi SKS per matkul adalah 3 untuk simulasi hitungan IP (atau bisa diinput)
        int sksPerMatkul = 3; 

        for(int i=0; i<mataKuliah.length; i++){
            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
            totalNilaiKaliSks += (bobotNilai[i] * sksPerMatkul);
            totalSks += sksPerMatkul;
        }
        
        double ipSemester = totalNilaiKaliSks / totalSks;
        System.out.println("========================");
        System.out.printf("IP : %.2f\n", ipSemester);
    }
}