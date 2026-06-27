public class Sorting {

    static void bubbleSort(Pesanan[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j].namaPesanan.compareToIgnoreCase(
                        arr[j + 1].namaPesanan) > 0) {

                    Pesanan temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void mergeSort(
            Pesanan[] arr,
            int kiri,
            int kanan) {

        if (kiri < kanan) {

            int tengah = (kiri + kanan) / 2;

            mergeSort(arr, kiri, tengah);

            mergeSort(arr, tengah + 1, kanan);

            merge(arr, kiri, tengah, kanan);
        }
    }

    static void merge(
            Pesanan[] arr,
            int kiri,
            int tengah,
            int kanan) {

        int n1 = tengah - kiri + 1;
        int n2 = kanan - tengah;

        Pesanan[] L = new Pesanan[n1];
        Pesanan[] R = new Pesanan[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[kiri + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[tengah + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = kiri;

        while (i < n1 && j < n2) {

            if (L[i].namaPesanan.compareToIgnoreCase(
                    R[j].namaPesanan) <= 0) {

                arr[k] = L[i];
                i++;

            } else {

                arr[k] = R[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
}
