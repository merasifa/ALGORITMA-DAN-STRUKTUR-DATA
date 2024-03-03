public class mahasiswa27 {
    public String nama;
    public int nim;
    public String jenisKelamin;
    public double ipk;

    double rataipk(mahasiswa27[] j){
        double hasil = 0;
        for (int i = 0; i < j.length; i++) {
            hasil += j[i].ipk;
        } 
        return( hasil / j.length);
    }

    void terbesar(mahasiswa27[]j) {
        double terbesar = j[0].ipk;
        mahasiswa27 mhs = null;
        for (int i =0; i < j.length; i++) {
            if(j[i].ipk > terbesar) {
                terbesar = j[i].ipk;
                mhs = j[i];
            }
        }
        System.out.println("Mahasiswa dengan nilai IPK tertinggi");
        System.out.println("Nama : " + mhs.nama);
        System.out.println("Nim : " + mhs.nim);
        System.out.println("Jenis Kelamin : " + mhs.jenisKelamin);
        System.out.println("Nilai IPK : " + mhs.ipk);
    }

}

