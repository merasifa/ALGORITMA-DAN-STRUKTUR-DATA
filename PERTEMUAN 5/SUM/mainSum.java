import java.util.Scanner;

public class mainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Keuntungan Total");
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc.nextInt();
        System.out.print("Masukkan jumlah perusahaan: ");
        int perusahaan = sc.nextInt();

        double[][] untung = new double[perusahaan][elm];
        for (int i = 0; i < perusahaan; i++) {
            System.out.println("Perusahaan " + (i + 1) + ":");
            for (int j = 0; j < elm; j++) {
                System.out.print("Masukkan keuntungan bulan ke-" + (j + 1) + " : ");
                untung[i][j] = sc.nextDouble();
            }
        }

        // Perhitungan total keuntungan untuk setiap perusahaan
        for (int i = 0; i < perusahaan; i++) {
            sum27 sm = new sum27(elm); // Membuat objek sum27 untuk setiap perusahaan
            for (int j = 0; j < elm; j++) {
                sm.keuntungan[j] = untung[i][j];
            }
            System.out.println("=====================================");
            System.out.println("Perusahaan " + (i + 1));
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + elm + " bulan adalah " + sm.totalBF(sm.keuntungan));
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + elm + " bulan adalah " + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
            System.out.println("=====================================");
        }
    }
}
