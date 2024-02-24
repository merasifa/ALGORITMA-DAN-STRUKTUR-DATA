public class Buku27 {
    String judul, pengarang;
    int halaman, stok, harga, total, jual;

    public Buku27(){}

public Buku27(String jud, String pg, int hal, int stok, int har){
    judul = jud;
    pengarang = pg;
    halaman = hal;
    this.stok = stok;
    harga = har;
}
    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        if (stok > 0 && jml <= stok) {
        jual = jml;
        stok -= jml;
        System.out.println("Stok Habis");
        }else{
            System.out.println("Buku Habis");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;
    }

    int hitungHargaTotal(){
        int hargaTotal = jual * harga;
        return hargaTotal;

    }

    int hitungDiskon(){
        int total = hitungHargaTotal();

        if (total > 150000) {
            return (total * 12 / 100);
        } else if ( total >= 75000 && total <= 150000) {
            return (total * 5 / 100);
        } else {
            return 0;
        }
    }

    int hitungHargaBayar(){
        int total = hitungHargaTotal();
        int diskon = hitungDiskon();
        int bayar = total - diskon;
        return bayar;

    }
}