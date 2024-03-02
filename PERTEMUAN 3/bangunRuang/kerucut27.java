public class kerucut27 {
    public double jariJari, sisi;

    public kerucut27(){
    
    }
    
    double hitungLP(){
        double hasil = Math.PI * jariJari * (jariJari+sisi);
        return hasil;
    }
    double hitungVolume(){
        double tinggi =Math.sqrt((sisi*sisi) - (jariJari * jariJari));
        System.out.println(tinggi);
        return (Math.PI *jariJari *jariJari* tinggi) / 3;
    }

}
