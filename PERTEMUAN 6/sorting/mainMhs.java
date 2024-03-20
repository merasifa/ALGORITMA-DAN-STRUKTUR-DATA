import java.util.Scanner;

public class mainMhs {
    public static void main(String[] args) {
        DaftarMhsPrestasi list = new DaftarMhsPrestasi();
        mahasiswa27 m1 = new mahasiswa27("Nusa", 2017, 25, 3);
        mahasiswa27 m2 = new mahasiswa27("Rara", 2012, 19, 4);
        mahasiswa27 m3 = new mahasiswa27("Dompu", 2018, 19, 3.5);
        mahasiswa27 m4 = new mahasiswa27("Abdul", 2017, 23, 2);
        mahasiswa27 m5 = new mahasiswa27("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting bubble desc berdasarkan ipk ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting selection asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting insertion asc berdasarkan ipk");
        list.insertionSort();
        list.tampil();
    }
}
