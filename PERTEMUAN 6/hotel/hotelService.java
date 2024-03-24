public class hotelService {
    hotel[] listHotel = new hotel[6];
    int idx;

    void tambah(hotel h ){
        if (idx < listHotel.length){
            listHotel[idx]  = h;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }

    void tampilAll(){
        for(hotel h : listHotel){
            h.tampilAll();
            System.out.println("============================");
        }
    }

    void bubbleSortHarga(){
        for (int i=0; i<listHotel.length-1; i++){
            for (int j=1; j<listHotel.length-i; j++){
                if(listHotel[j].harga > listHotel [j-1].harga){ // proses membandingkan
                    //proses swap
                    hotel tmp = listHotel[j];
                    listHotel[j] = listHotel [j-1];
                    listHotel[j-1] = tmp;
                }
            }
        }
    }

    void selectionSortBintang(){
        for (int i=0; i<listHotel.length-1; i++){
            int idxMin = i;
            for (int j=i+1; j<listHotel.length; j++){
                if(listHotel[j].bintang < listHotel [idxMin].bintang){ // proses membandingkan
                    idxMin = j;
                }
            }
                    //proses swap
                    hotel tmp = listHotel[idxMin];
                    listHotel[idxMin] = listHotel [i];
                    listHotel[i] = tmp;
                }
    }

}

