import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();

        pangkat27[] png = new pangkat27[elemen];
        for (int i = 0; i < elemen; i++){
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = sc.nextInt(); // mengambil input nilai
            System.out.println("Masukkan nilai pemangkat: ");
            int pangkat = sc.nextInt(); // mengambil input pemangkat
            png[i] = new pangkat27(nilai, pangkat);
        }

        // // mencetak hasil pangkat BF
        // System.out.println("HASIL PANGKAT - BRUTE FORCE");
        // for (int i = 0; i < elemen; i++) {
        //     System.out.println("Hasil dari " + png[i].nilai + " pangkat " +
        //             png[i].pangkat + " adalah " +
        //             png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        // }

        // // menetak hasil pangkat DC
        // System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        // for (int i = 0; i < elemen; i++) {
        //     System.out.println("Hasil dari " + png[i].nilai + " pangkat " +
        //             png[i].pangkat + " adalah " +
        //             png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        // }

        System.out.println("================================");
        System.out.println("METODE PERHITUNGAN PANGKAT");
        System.out.println("================================");
        System.out.println("1. BRUTE FORCE");
        System.out.println("2. DIVIDE AND CONQUER");
        System.out.print("Masukan Pilihan :");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for (int i = 0; i < png.length; i++) {
                 System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " 
                 + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                for (int i = 0; i < png.length; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " 
                    + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }

    }
}

