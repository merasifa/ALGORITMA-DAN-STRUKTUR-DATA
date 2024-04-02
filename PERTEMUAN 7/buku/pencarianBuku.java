public class pencarianBuku {
    buku27[] listBuku = new buku27[5];
     int idx = 0;

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

     public int findSeqSearch (String cari){
        int posisi = -1;
        for (int j =0; j <listBuku.length; j++){
            // if(listBuku[j].kodeBuku == cari){
                if(listBuku[j].kodeBuku.equals(cari)){
                posisi = j;
                break;
            }
        }
        return posisi;
     }

    public int findBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = left + (right - left) / 2;
            // if (cari == listBuku[mid].kodeBuku) {
                if (cari.equals(listBuku[mid].kodeBuku)) {
                return mid;
            } else if (listBuku[mid].kodeBuku.compareTo(cari)>0) { // mengubah tanda perbandingan yg awalnya > menjadi <
                return findBinarySearch(cari, left, mid -1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }


     public void TampilPosisi(String x, int pos){
        if (pos!= -1){
            System.out.println("Data : " + x +" ditemukan pada indeks "+ pos);
        }else {
            System.out.println("Data " + x + "tidak ditemukan");
        }
     }

     public void TampilData(String x, int pos){
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

     public buku27 findBuku(String cari){
        int posisi = -1;
        for (int j =0; j <listBuku.length; j++){
            if(listBuku[j].kodeBuku == cari ){
                posisi = j;
                break;
            }
        }
        return listBuku[posisi];
    }

    public int findJudulSequential(String judul){
        int posisi = -1;
        for (int j =0; j <listBuku.length; j++){
            // if(listBuku[j].kodeBuku == cari){
                if(listBuku[j].judul.equals(judul)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void bubbleSort(){
        for (int i=0; i<listBuku.length-1; i++){
            for (int j=1; j<listBuku.length-i; j++){
                if(listBuku[j].judul.compareTo(listBuku [j-1].judul) > 0){ // proses membandingkan
                    //proses swap
                    buku27 tmp = listBuku[j];
                    listBuku[j] = listBuku [j-1];
                    listBuku [j-1] = tmp;
                }
            }
        }
    }

    public int findJudulBinary(String judul, int left, int right) {
        if (right >= left) {
            int mid = left + (right -left) /2 ; // indeks tengah
            int compare = listBuku[mid].judul.compareTo(judul); // membenaidngkan

            if (compare == 0) {
                return mid; // judul buku berada ditengah
            } else if(compare >0){
                return findJudulBinary(judul, left, mid - 1);// judul buku yg dicari berada di sebelah kiri
            } else {
                return findJudulBinary(judul, mid + 1, right); // judul buku yg dicari berada di sebelah kanan
            }
        }
        return -1; // tidak ada
    }

    
}
