import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner barang = new Scanner(System.in);
        System.out.print("banyak mainan ditoko : ");
        int main = barang.nextInt();

        Scanner scan = new Scanner(System.in);
        System.out.print("banyak mainan yang dibeli : ");
        int mainan = scan.nextInt();


        if (main > mainan) {
            System.out.println("mainan yang dibeli : " + mainan);
            System.out.println("Mainan sisa : " + main % mainan );
        }
        if (main < mainan) {
            System.out.println("Mainan di toko hanya terisa : " + main );
        }
        else {
            System.out.println("mainan yang dibeli : " + mainan);
            System.out.println("Mainan di toko habis");
        }
    }
}
