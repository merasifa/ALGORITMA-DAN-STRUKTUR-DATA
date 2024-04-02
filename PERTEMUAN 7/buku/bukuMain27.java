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
            String kodeBuku = s1.nextLine();
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
        System.out.println("Pilih Pencarian data");
        System.out.println("1. Berdasarkan Kode");
        System.out.println("2. Berdasarkan Judul");
        System.out.print("Pilih :");
        int pilih = s.nextInt();


        if (pilih == 1) {
            System.out.print("Masukkan kode buku yg dicari : ");
            String cari = s1.nextLine();

            System.out.println(" Cari data menggunakan sequential search");
            int posisi = data.findSeqSearch(cari);
            data.TampilPosisi(cari, posisi);
            data.TampilData(cari, posisi);

            System.out.println(" Cari data menggunakan binary search");
            posisi = data.findBinarySearch(cari, 0, jumlah - 1);
            data.TampilPosisi(cari, posisi);
            data.TampilData(cari, posisi);
            
        } else if(pilih == 2) {
            System.out.print("Masukkan Judul buku yg dicari : ");
            String cariJudul = s1.next();

            System.out.println(" Cari data menggunakan sequential search");
            int posisiJudulS = data.findSeqSearch(cariJudul);
            data.TampilPosisi(cariJudul, posisiJudulS);
            data.TampilData(cariJudul, posisiJudulS);
            int jmlJudulS = 0;
            for(buku27 buku : data.listBuku){
                if (buku != null && buku.judul.equals(cariJudul)) {
                    jmlJudulS++;
                } 
            }
            if (jmlJudulS > 1){
                System.out.println("Peringatan!! Terdapat judul buku yang sama !!");
            } 
            
            



            System.out.println(" Cari data menggunakan binary search");
            int posisiJudulB = data.findBinarySearch(cariJudul, 0, jumlah - 1);
            data.TampilPosisi(cariJudul, posisiJudulB);
            data.TampilData(cariJudul, posisiJudulB);

            int jmlJudulB = 0;
            for(buku27 buku : data.listBuku){
                if (buku != null && buku.judul.equals(cariJudul)) {
                    jmlJudulB++;
                } 
            }
            if (jmlJudulB > 1){
                System.out.println("Peringatan!! Terdapat judul buku yang sama !!");
            }   
        } else {
            System.out.println("tidak valid");
        }
        

        // buku27 dataBuku27 = data.findBuku(cari);
        // dataBuku27.TampilDataBuku();
    }
    
}
