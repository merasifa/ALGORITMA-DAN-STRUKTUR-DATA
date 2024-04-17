public class pencarianuts {
    uts[] listUTS;
    int idx = 0;

    pencarianuts(){
        listUTS = new uts[16];
    }

    void tambah(uts ujian ){
        if (idx < listUTS.length){
            listUTS[idx]  = ujian;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for(uts ujian : listUTS) {
            if (ujian != null){
            ujian.tampil();
            }
        }
     }

     public int findBinarySearchAscen(int cari, int left, int right){
        int mid;
        if (right >= left){
            mid = left + (right - left) / 2;
            
            if (cari == listUTS[mid].nilai) {
                return mid;
            }
            
            if (cari < listUTS[mid].nilai) {
                return findBinarySearchAscen(cari, left, mid - 1);
            }
            
            return findBinarySearchAscen(cari, mid + 1, right);
        }
        
        return -1;
    }

    public int findBinarySearchDescen(int cari, int left, int right){
        int mid;
        if (right >= left){
            mid = left + (right - left) / 2;
            
            if (cari == listUTS[mid].nilai) {
                return mid;
            }
            
            if (cari < listUTS[mid].nilai) {
                return findBinarySearchDescen(cari, left, mid - 1);
            }
            
            return findBinarySearchDescen(cari, mid + 1, right);
        }
        
        return -1;
    }

    void selectionSortAssending(){
        for (int i=0; i<listUTS.length-1; i++){
            int idxMin = i;
            for (int j=i+1; j<listUTS.length; j++){
                if(listUTS[j].nilai < listUTS [idxMin].nilai){ // proses membandingkan
                    idxMin = j;
                }
            }
                    //proses swap
                    uts tmp = listUTS[idxMin];
                    listUTS[idxMin] = listUTS [i];
                    listUTS[i] = tmp;
                }
    }

    void selectionSortDescending(){
        for (int i=0; i<listUTS.length-1; i++){
            int idxMax = i;
            for (int j=i+1; j<listUTS.length; j++){
                if(listUTS[j].nilai > listUTS [idxMax].nilai){ // proses membandingkan
                    idxMax = j;
                }
            }
                    //proses swap
                    uts tmp = listUTS[idxMax];
                    listUTS[idxMax] = listUTS [i];
                    listUTS[i] = tmp;
                }
    }
    
}
