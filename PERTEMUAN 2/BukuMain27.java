public class BukuMain27 {
    public static void main(String[] args) {

        Buku27 bk1 = new Buku27();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku27 bk2 = new Buku27("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku27 bkTiara = new Buku27("Laskar Pelangi","Joko", 200, 30, 50000);
        bkTiara.terjual(10);
        bkTiara.tampilInformasi();

        
        System.out.println("Harga Total : " + bkTiara.hitungHargaTotal());
        System.out.println("Harga Diskon: " + bkTiara.hitungDiskon());
        System.out.println("Harga Bayar : " + bkTiara.hitungHargaBayar());
    }
}
