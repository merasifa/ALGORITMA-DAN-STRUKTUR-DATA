import java.util.Scanner;

/**
 * nilaiAkhir
 */
public class nilaiAkhir {

    public static void main(String[] args) {
        Scanner inputNilai = new Scanner(System.in);
        int tugas, kuis, uts, uas;
        int akhir = 0;
        char status;

        System.out.println(" Program Menghitung Nilai Akhir");
        System.out.println(" ==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        tugas = inputNilai.nextInt();
        System.out.print("Masukkan Nilai Kuis : ");
        kuis = inputNilai.nextInt();
        System.out.print("Masukkan Nilai UTS  : ");
        uts = inputNilai.nextInt();
        System.out.print("Masukkan Nilai UAS  : ");
        uas = inputNilai.nextInt();
        System.out.println(" ==============================");
        
        if (tugas <= 100 && kuis <=100 && uts <= 100 && uas <= 100) {
             akhir =(tugas * 20 / 100) + ( kuis  * 20 / 100) + ( uts  * 30 / 100) + ( uas  * 40 / 100);

            System.out.println("Nilai Akhir : " + akhir);
        } else {
            System.out.println("Nilai yang anda masukkan tidak valid");
        }

        if (akhir >= 80 && akhir <=100) {
            System.out.println( "Nilai Huruf : A");
        } else if(akhir >= 73 && akhir <=80) {
            System.out.println(" Nilai Akhir : B+ ");
        } else if(akhir >= 65 && akhir <=73) {
            System.out.println("Nilai Akhir : B ");
        } else if(akhir >= 60 && akhir <=65) {
            System.out.println("Nilai Akhir : C+ ");
        }else if(akhir >= 50 && akhir <=60) {
            System.out.println("Nilai Akhir : C  ");
        }else if(akhir >= 39 && akhir <=50) {
            System.out.println("Nilai Akhir : D ");
        }else{
            System.out.println("Nilai Akhir : E ");
        }

        System.out.println( "============");

        if (akhir<= 100 && akhir >= 50 ) {
            System.out.println("LULUS");
        } else if (akhir<= 50 && akhir >=0){
            System.out.println("TIDAK LULUS");
        }
    }
}