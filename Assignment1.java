import java.util.ArrayList;
import java.util.Arrays;

public class Tugas {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Cabai");
        cars.add("Bayam");
        cars.add("Bawang");
        cars.add("Tempe");
        cars.add("Beras");
        System.out.println("Daftar Catatan Dina : "+ cars);

        cars.add("Ayam");
        cars.add("Minyak");
        cars.remove("Cabai");
        System.out.println("Barang yang dibeli Dina  : "+ cars);

        int uangDina = 50000;

        int[] harga = {2000, 3000, 5000, 20000, 20000, 12000};

        int totalBelanja = 0;
        for (int i = 0; i < cars.size(); i++) {
            // Jika barang tersebut tidak dibeli Dina
            int hargaBarang = harga[i];
            totalBelanja += hargaBarang;
        }
        System.out.println("Total belanja Dina: " + totalBelanja);
        if (totalBelanja < uangDina) {
            System.out.println("Kurang " + (uangDina - totalBelanja));
        } else if (totalBelanja == uangDina) {
            System.out.println("Pas");
        } else {
            System.out.println("Lebih " + (totalBelanja - uangDina));
        }
    }
}
