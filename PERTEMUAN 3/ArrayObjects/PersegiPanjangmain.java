import java.util.Scanner;

public class PersegiPanjangmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner untuk inputan
        PersegiPanjang[] ppArray = new PersegiPanjang[3];

        for(int i= 0; i < 3; i++){ //looping untuk menerima inputan 

            ppArray[i] = new  PersegiPanjang();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();

            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        //cetak objek
        for(int i=0; i < 3; i++){
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
        
    }
}
