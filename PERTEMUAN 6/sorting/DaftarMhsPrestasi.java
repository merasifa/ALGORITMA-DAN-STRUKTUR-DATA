public class DaftarMhsPrestasi {
    mahasiswa27[] listMhs = new mahasiswa27[5];
    int idx;

    void tambah(mahasiswa27 m ){
        if (idx < listMhs.length){
            listMhs[idx]  = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for(mahasiswa27 m : listMhs){
            m.tampil();
            System.out.println("============================");
        }
    }

    void bubbleSort(){
        for (int i=0; i<listMhs.length-1; i++){
            for (int j=1; j<listMhs.length-i; j++){
                if(listMhs[j].ipk > listMhs [j-1].ipk){ // proses membandingkan
                    //proses swap
                    mahasiswa27 tmp = listMhs[j];
                    listMhs[j] = listMhs [j-1];
                    listMhs [j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i=0; i<listMhs.length-1; i++){
            int idxMin = i;
            for (int j=i+1; j<listMhs.length; j++){
                if(listMhs[j].ipk < listMhs [idxMin].ipk){ // proses membandingkan
                    idxMin = j;
                }
            }
                    //proses swap
                    mahasiswa27 tmp = listMhs[idxMin];
                    listMhs[idxMin] = listMhs [i];
                    listMhs [i] = tmp;
                }
            }      
    }

