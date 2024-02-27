public class fungsi {
    public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println("Pendapatan Toko Royal Garden");
        System.out.println("===================================");
        System.out.print("Pendapatan Toko Royal Garden 1 :");
        pendapatan(10, 5 , 15, 7);
        System.out.println();

        System.out.print("Pendapatan Toko Royal Garden 2 :");
        pendapatan(6, 11 , 9, 12);
        System.out.println();

        System.out.print("Pendapatan Toko Royal Garden 3 :");
        pendapatan(2,10,10,5);
        System.out.println();

        System.out.print("Pendapatan Toko Royal Garden 4 :");
        pendapatan(5,7,12,9);
        System.out.println();

        System.out.println("===================================");
        System.out.println(" Jumlah Stock Toko Royal Garden 4");
        System.out.println("===================================");
        System.out.print("Jumlah Stock bunga Algonema :");
        stock(4);
        System.out.println();

        System.out.print("Jumlah Stock bunga Keladi :");
        stock(5);
        System.out.println();

        System.out.print("Jumlah Stock bunga Alocasia :");
        stock(12);
        System.out.println();

        System.out.print("Jumlah Stock bunga Mawar :");
        stock(4);
        System.out.println();


    }
        static int pendapatan (int Algonema, int Keladi, int Alocasioa, int Mawar){
            int totalpendapatan = ((7500 * Algonema) + (5000 * Keladi) + (60000 * Alocasioa) + (10000 * Mawar));
            System.out.print(totalpendapatan);
            return totalpendapatan;
        
    }
        static int stock (int i){
        int stock = i;
        System.out.print(stock);
        return stock;
        }

    


    
}
