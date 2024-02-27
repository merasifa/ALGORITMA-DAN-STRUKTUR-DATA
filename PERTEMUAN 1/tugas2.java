import java.util.Scanner;

public class tugas2 {
     static Scanner input27 = new Scanner(System.in);

     static int jarak,waktu;
     static double kecepatan;

     public static void main(String[] args) {
        int jarak,waktu;
        double kecepatan = 0;

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=============================="); 
        menu();
     }

     static void menu() {
        System.out.println("Menu: ");
        System.out.println("1. Menghitung Kecepatan");
        System.out.println("2. Menghitung Jarak");
        System.out.println("3. Menghitung Waktu");
        System.out.print("Masukkan Menu yang diinginkan (1/2/3)");
        int pilih = input27.nextInt();

        switch (pilih) {
            case 1:
                System.out.println("=============================="); 
                System.out.println("Menghitung Kecepatan");
                System.out.println("=============================="); 
                System.out.print("Masukkan Jarak: ");
                jarak = input27.nextInt();
                System.out.print("Masukkan Waktu: ");
                waktu = input27.nextInt();
                rumusKecepatan(jarak, waktu);
                break;
            
            case 2:
                System.out.println("=============================="); 
                System.out.println("Menghitung Jarak");
                System.out.println("=============================="); 
                System.out.print("Masukkan Kecepatan: ");
                kecepatan = input27.nextDouble();
                System.out.print("Masukkan Waktu: ");
                waktu = input27.nextInt();
                rumusJarak(kecepatan, waktu);
                break;
            case 3:
                System.out.println("=============================="); 
                System.out.println("Menghitung Waktu");
                System.out.println("=============================="); 
                System.out.print("Masukkan Jarak: ");
                jarak = input27.nextInt();
                System.out.print("Masukkan Kecepatan: ");
                kecepatan = input27.nextDouble();
                rumusWaktu(jarak,kecepatan);
                break;

            default:
                System.out.println("Pilihan yang anda masukan tidak Valid");

        }
       
     }

     static double rumusKecepatan(int jarak, int waktu) {
        double kecepatan = (double) jarak / waktu;
        System.out.println("Kecepatan: " + kecepatan);
        return kecepatan;
    }

    static double rumusJarak(double kecepatan, int waktu) {
        double jarak = kecepatan * waktu;
        System.out.println("Jarak: " + jarak );
        return jarak;
    }

    static double rumusWaktu(int jarak, double kecepatan) {
        double waktu = jarak / kecepatan;
        System.out.println("Waktu: " + waktu );
        return waktu;
    }
}
