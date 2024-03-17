public class showroom {
    public String merk, tipe;
    public int tahun, topA, topP;


    public showroom(String merk, String tipe, int tahun, int topA, int topP){
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topA = topA;
        this.topP = topP;
    }

    int topA(showroom[]list, int low, int high){
        if (low==high){
            return list[low].topA;
        }
        int mid = (low+high)/2;
        int max1 = topA(list, low, mid);
        int max2 = topA(list, mid+1, high);

        if (max1 > max2){
            return max1;
        } else {
            return max2;
        }
    }

    int minA(showroom[]list, int low, int high){
        if (low==high){
            return list[low].topA;
        }
        int mid = (low+high)/2;
        int min1 = minA(list, low, mid);
        int min2 = minA(list, mid+1, high);

        if (min1 <= min2){
            return min1;
        } else {
            return min2;
        }
    }

    double rata(showroom[]list){
        int total = 0;
        int hasil = 0;

        for(int i = 0; i <list.length; i++){
            total = total+ list[i].topP;
            hasil++;
        }

        if (hasil == 0){
            return 0.0;
        }
        return(double) total/hasil;
    }
}
