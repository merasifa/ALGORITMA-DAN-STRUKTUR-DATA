import java.util.Scanner;

public class Mainfaktorial27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================");
        System.out.print("Masukkan jumlah elemen: ");
        int iJml = sc.nextInt();

        faktorial27[] fk = new faktorial27[iJml];
        for (int i = 0; i < iJml; i++){
            fk[i] = new faktorial27();
            System.out.print("Masukkan nilai data ke-" + (i+1)+ ": ");
            int iNilai = sc.nextInt();
            fk[i].nilai = iNilai;
        }

        System.out.println("HASIL - BRUTE FORCE");
        for(int i =0; i < iJml; i++){
            System.out.println("Hasil perhitungan faktorial menggunakan Brute Force adalah "
            + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("HASIL - DIVIDE AND CONQUER");
        for(int i =0; i < iJml; i++){
            System.out.println("Hasil perhitungan faktorial menggunakan Divide and Conquer adalah "
            + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}
