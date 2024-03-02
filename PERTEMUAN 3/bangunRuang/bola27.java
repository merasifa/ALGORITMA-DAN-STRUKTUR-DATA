public class bola27 {
    public double jariJari;

    public bola27(){

    }
    double hitungLP(){
        double hasil = 4 * Math.PI * jariJari * jariJari;
        return hasil;
    }
    double hitungVolume(){
        double volume= (Math.PI * jariJari * jariJari * jariJari * 4) / 3 ;
        return volume;
    }
    
}
