
public class segitigamain27 {
    public static void main(String[] args) {
        segitiga27[] sgArray = new segitiga27[4];

        sgArray[0] = new segitiga27(10,4);
        sgArray[1] = new segitiga27(20,10);
        sgArray[2] = new segitiga27(15,6);
        sgArray[3] = new segitiga27(25,10);

        for(int i = 0; i < 4 ; i++ ){
            System.out.println("Segitiga ke-" + i);
            System.out.println("Luas     : " + sgArray[i].hitungLuas());
            System.out.println("Keliling : " + sgArray[i].hitungKeliling());
        }

    }
}
