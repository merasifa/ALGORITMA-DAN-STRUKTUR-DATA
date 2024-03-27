public class pencarianBuku {
    buku27[] listBuku = new buku27[5];
     int idx;

     void tambah(buku27 m){
        if (idx < listBuku.length) {
            listBuku[idx] = m;
            idx++;     
        } else {
            System.out.println("Data sudah penuh!");
        }
     }

     void tampil(){
        for(buku27 m : listBuku) {
            m.TampilDataBuku();
        }
     }

     public int findSeqSearch (int cari){
        int posisi = -1;
        for (int j =0; j <listBuku.length; j++){
            if(listBuku[j].kodeBuku == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
     }

     public void TampilPosisi(int x, int pos){
        if (pos!= -1){
            System.out.println("Data : " + x +" ditemukan pada indeks "+ pos);
        }else {
            System.out.println("Data " + x + "tidak ditemukan");
        }
     }

     public void TampilData(int x, int pos){
        if (pos!= -1) {
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul\t\t :" +listBuku[pos].judul);
            System.out.println("Tahun Terbit\t :" +listBuku[pos].tahunTerbit);
            System.out.println("Pengarang\t :" +listBuku[pos].pengarang);
            System.out.println("Stock\t\t :" +listBuku[pos].stock);
        }else {
            System.out.println("Data " + x + "tidak ditemukan");
        }
     }

}
