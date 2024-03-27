import java.util.Scanner;

public class bukuMain27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);


        pencarianBuku data = new pencarianBuku();
        int jumlah = 5;


        System.out.println("==================================================");
        System.out.println("Masukkan data buku urut dari kode buku terkecil: ");
        for(int i =0; i < jumlah; i++){
            System.out.println("==================================================");
            System.out.print("Kode Buku    \t: ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul Buku   \t: ");
            String judul = s1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang   \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock   \t: ");
            int stock = s.nextInt();


            buku27 m = new buku27(kodeBuku, judul, tahunTerbit, pengarang, stock);
            data.tambah(m);
        };
        System.out.println("====================================================");
        System.out.println("Data Keseluruhan Buku");
        data.tampil();
        
        System.out.println("====================================================");
        System.out.println("Pencarian data");
        System.out.println("Masukkan kode buku yg dicari : ");
        int cari = s.nextInt();
        System.out.println(" Cari data menggunakan sequential seacrh");
        int posisi = data.findSeqSearch(cari);
        data.TampilPosisi(cari, posisi);

    }
    
}
