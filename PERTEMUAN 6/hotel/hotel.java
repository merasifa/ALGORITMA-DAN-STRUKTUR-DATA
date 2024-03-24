public class hotel {
    String nama;
    String kota;
    int harga;
    Byte bintang;

    hotel (String n, String k, int h, Byte b){
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    void tampilAll(){
        System.out.println("NAMA HOTEL: " + nama);
        System.out.println("KOTA      : " + kota);
        System.out.println("HARGA     : " + harga);
        System.out.println("BINTANG   : " + bintang);

    }
}