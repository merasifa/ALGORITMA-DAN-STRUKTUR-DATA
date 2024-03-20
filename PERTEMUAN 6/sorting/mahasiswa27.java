public class mahasiswa27 {
    int nim;
    String nama;
    int umur;
    double ipk;

    public mahasiswa27( String ni, int n, int u, double i){
        nama = ni;
        nim = n;
        umur = u;
        ipk = i;
    }

    void tampil(){
        System.out.println("NIM   :"+ nim);
        System.out.println("Nama  :"+ nama);
        System.out.println("Umur  :"+ umur);
        System.out.println("IPK  :"+ ipk);
    }
}