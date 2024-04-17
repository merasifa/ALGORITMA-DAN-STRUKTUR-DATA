public class uts {
    static int jumlahNilai = 0;
    int nilai, indeks;

    uts(int nilai){
        this.nilai = nilai;
        this.indeks = jumlahNilai++;
        

    }

    void tampil(){
        System.out.println("=================");
        System.out.println("Nilai : "+ nilai);
        System.out.println("Indeks: "+ indeks);
    }
}
