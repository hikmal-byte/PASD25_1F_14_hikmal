public class Searching {
    
    static int linearSearch(
        Pesanan[] arr,
        String cari) {

        for (int i = 0; i < arr.length; i++) {
        
            if(arr[i].namaPesanan.equalsIgnoreCase(cari)) {

                return i;
            }
        }

        return -1;
    }

    static int binarySearch(
            Pesanan[] arr,
            String cari) {
        
        int kiri = 0;
        int kanan = arr.length - 1;

        while (kiri <= kanan) {

            int tengah = (kiri + kanan) / 2;

            int hasil = arr[tengah].namaPesanan
                    .compareToIgnoreCase(cari);

            if (hasil == 0) {

                return tengah;

            } else if (hasil < 0) {

                kiri = tengah + 1;


            } else {

                kanan = tengah - 1;
            }
        }

        return -1;
    }
}
