public class mainHotel {
    public static void main(String[] args) {
        hotelService listHotel = new hotelService();
        hotel h1 = new hotel("Grand Mecure", "Malang", 900000,(byte)4);
        hotel h2 = new hotel("Aston", "Surabaya", 850000,(byte)5);
        hotel h3 = new hotel("Grand Malioboro", "Yogyakarta", 1000000,(byte)6);
        hotel h4 = new hotel("Savana", "Malang", 700000,(byte)3);
        hotel h5 = new hotel("101", "Malang", 600000,(byte)2);
        hotel h6 = new hotel("Ibis", "Malang", 400000,(byte)1);

        listHotel.tambah(h1);
        listHotel.tambah(h2);
        listHotel.tambah(h3);
        listHotel.tambah(h4);
        listHotel.tambah(h5);
        listHotel.tambah(h6);

        System.out.println("----------------------------");
        System.out.println("DATA HOTEL");
        System.out.println("----------------------------");
        listHotel.tampilAll();

        System.out.println("----------------------------");
        System.out.println("BERDASARKAN HARGA");
        System.out.println("----------------------------");
        listHotel.bubbleSortHarga();
        listHotel.tampilAll();

        System.out.println("----------------------------");
        System.out.println("BERDASARKAN BINTANG ");
        System.out.println("----------------------------");
        listHotel.selectionSortBintang();
        listHotel.tampilAll();

    }
}
