
public class segitiga27 {
    public int alas, tinggi;

   public segitiga27(int a, int t){
    alas = a;
    tinggi= t;
   }

   int hitungLuas(){
    //int hasil = alas * tinggi;
    return alas * tinggi;
   }

   double hitungKeliling(){
        double sisiMiring = Math.sqrt((alas*alas) + (tinggi*tinggi));
        double keliling = alas + tinggi + sisiMiring;
        return keliling;
   }
}
