public class kerucut27 {
    public double jariJari, tinggi, sisi;

    public kerucut27(int r, int t, int s){
        jariJari = r;
        tinggi = t;
        sisi = s;
    }
    
    double hitungLP(){
        double hasil = 3.14 * jariJari + (jariJari+sisi);
        return hasil;
    }
    double hitungVolume(){
        double volume = (3.14 *jariJari*jariJari) + (tinggi = Math.sqrt((sisi*sisi) - (jariJari * jariJari))) / 3;
        return volume;
    }

}
