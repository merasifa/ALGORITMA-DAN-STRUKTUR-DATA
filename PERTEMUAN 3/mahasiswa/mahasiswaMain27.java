import java.util.Scanner;

public class mahasiswaMain27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner untuk inputan

        mahasiswa27[] mhs = new mahasiswa27[3];    // objek array balok

        for( int i = 0; i < mhs.length; i++){ // perulangan untuk menginputkan 
            mhs[i] = new mahasiswa27();

            System.out.println("Masukkan data mahasiswa ke- " + (i + 1));
            System.out.print("Masukkan nama: ");
            mhs[i].nama = sc.nextLine();
            
            System.out.print("Masukkan nim : ");
            mhs[i].nim = sc.nextInt();
            sc.nextLine(); // untuk menangkap newline
            
            System.out.print("Masukkan jk  : ");
            mhs[i].jenisKelamin = sc.nextLine();
            System.out.print("Masukkan IPK : ");
            mhs[i].ipk = sc.nextDouble();
            sc.nextLine(); //  untuk menangkap newline
        }
        
        System.out.println();
        for(int i=0; i < mhs.length; i++){
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("Nama :" + mhs[i].nama);
            System.out.println("NIM  :" + mhs[i].nim);
            System.out.println("JK   :" + mhs[i].jenisKelamin);
            System.out.println("IPK  :" + mhs[i].ipk);
   
        }
        System.out.println();
        mahasiswa27 rata = new mahasiswa27();
        System.out.println("Rata IPK :" + rata.rataipk(mhs));
        rata.terbesar(mhs);
}
}