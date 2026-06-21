import java.util.Scanner;

public class SLLMainModif14 {
    public static void main(String[] args) {
        SingleLinkedList14 sll = new SingleLinkedList14();
        Scanner hikmal14 = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Mahasiswa yang ingin diinput: ");
        int jumlah = hikmal14.nextInt();
        hikmal14.nextLine(); // Membersihkan buffer

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\n--- Data Mahasiswa ke-" + (i + 1) + " ---");
            System.out.print("NIM   : "); String nim = hikmal14.nextLine();
            System.out.print("Nama  : "); String nama = hikmal14.nextLine();
            System.out.print("Kelas : "); String kelas = hikmal14.nextLine();
            System.out.print("IPK   : "); double ipk = hikmal14.nextDouble();
            hikmal14.nextLine(); // Membersihkan buffer
            
            // Membuat objek mahasiswa dari input keyboard
            Mahasiswa14 mhs = new Mahasiswa14(nim, nama, kelas, ipk);
            
            // Menambahkan ke dalam Linked List
            sll.addLast(mhs);
        }
        
        System.out.println("\n========================");
        System.out.println("Hasil Cetak Linked List:");
        System.out.println("========================");
        sll.print();
        
        hikmal14.close();
    }
}
