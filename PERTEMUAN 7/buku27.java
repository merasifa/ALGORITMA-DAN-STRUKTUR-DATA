public class buku27 {
    int kodeBuku, tahunTerbit, stock;
    String judul, pengarang;

    public buku27(int kodeBuku, String judul, int tahunTerbit, String pengarang, int stock){
       this.kodeBuku =kodeBuku;
       this.judul = judul;
       this.tahunTerbit = tahunTerbit;
       this.pengarang = pengarang;
       this.stock = stock; 
    }

    void TampilDataBuku(){
        System.out.println("============================");
        System.out.println("Kode buku    :" + kodeBuku);
        System.out.println("Judul        :" + judul);
        System.out.println("Tahun Terbit :" + tahunTerbit);
        System.out.println("Pengarang    :" + pengarang);
        System.out.println("Stock        :" + stock);
    }

}
