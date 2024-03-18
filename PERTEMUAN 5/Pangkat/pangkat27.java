public class pangkat27 {
    public int nilai, pangkat;

    public pangkat27(int nilai, int pangkat){
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    int pangkatBF( int a, int n){
        int hasil = 1; // menginisialisasi hasil ke 1
        for(int i = 0; i < n; i++){
            hasil *=a; // mengalikan dengan nilai a
        }
        return hasil;
    }

    int pangkatDC (int a, int n){
        if(n==0){
            return 1;
        }else{
            if(n%2==1){// bil ganjil
                return (pangkatDC(a, (n-1) / 2)* pangkatDC(a, (n-1) /2)*a);
            } else {
                return (pangkatDC(a, n/2)* pangkatDC(a, n/2));
            }
        }
    }
}