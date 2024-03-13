import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();

        pangkat27[] png = new pangkat27[elemen];
        for (int i = 0; i < elemen; i++){
            png[i] = new pangkat27();
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            png[i].nilai = sc.nextInt(); // mengambil input nilai
            System.out.println("Masukkan nilai pemangkat: ");
            png[i].pangkat = sc.nextInt(); // mengambil input pemangkat
        }

        // mencetak hasil pangkat BF
        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " +
                    png[i].pangkat + " adalah " +
                    png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }

        // menetak hasil pangkat DC
        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " +
                    png[i].pangkat + " adalah " +
                    png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}

