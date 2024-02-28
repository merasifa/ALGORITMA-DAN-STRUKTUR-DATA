
public class PersegiPanjangmain {
    public static void main(String[] args) {
        PersegiPanjang[] ppArray = new PersegiPanjang[3];

        ppArray[0] = new PersegiPanjang(); //instance objek persegi panjang pada indeks 0
        ppArray[0].panjang = 110;
        ppArray[0].lebar = 30; 
        
        ppArray[1] = new PersegiPanjang(); //instance objek persegi panjang pada indeks 0
        ppArray[1].panjang = 80;
        ppArray[1].lebar = 40; 

        ppArray[2] = new PersegiPanjang(); //instance objek persegi panjang pada indeks 0
        ppArray[2].panjang = 100;
        ppArray[2].lebar = 20; 

        //cetak objek
        System.out.println("Persegi panjang ke-0, panjang: "+ ppArray[0].panjang + ", lebar: " +ppArray[0].lebar );
        System.out.println("Persegi panjang ke-0, panjang: "+ ppArray[1].panjang + ", lebar: " +ppArray[1].lebar );
        System.out.println("Persegi panjang ke-0, panjang: "+ ppArray[2].panjang + ", lebar: " +ppArray[2].lebar );
    }
}
