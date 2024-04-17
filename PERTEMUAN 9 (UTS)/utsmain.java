import java.util.Scanner;

public class utsmain {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    pencarianuts listUTS = new pencarianuts();
    uts ujian1 = new uts(14);
    uts ujian2 = new uts(21);
    uts ujian3 = new uts(46);
    uts ujian4 = new uts(10);
    uts ujian5 = new uts(38);
    uts ujian6 = new uts(38);
    uts ujian7 = new uts(28);
    uts ujian8 = new uts(4);
    uts ujian9 = new uts(45);
    uts ujian10 = new uts(3);
    uts ujian11 = new uts(27);
    uts ujian12 = new uts(23);
    uts ujian13 = new uts(15);
    uts ujian14 = new uts(12);
    uts ujian15 = new uts(3);
    uts ujian16 = new uts(47);
    uts ujian17 = new uts(29);

    listUTS.tambah(ujian1);
    listUTS.tambah(ujian2);
    listUTS.tambah(ujian3);
    listUTS.tambah(ujian4);
    listUTS.tambah(ujian5);
    listUTS.tambah(ujian6);
    listUTS.tambah(ujian8);
    listUTS.tambah(ujian9);
    listUTS.tambah(ujian10);
    listUTS.tambah(ujian11);
    listUTS.tambah(ujian12);
    listUTS.tambah(ujian13);
    listUTS.tambah(ujian14);
    listUTS.tambah(ujian15);
    listUTS.tambah(ujian16);
    listUTS.tambah(ujian17);

    // tampil data sblm urut
    System.out.println("Data Sebelum diurutkan");
    listUTS.tampil();
    System.out.println();

    System.out.print("Masukkan data yang akan dicari: ");
        int cari = sc.nextInt();

    System.out.println("Hasil Sebelum diurutkan");
        int posisiSebelum = listUTS.findBinarySearchAscen(cari, 0, listUTS.listUTS.length - 1);
        if (posisiSebelum != -1) {
            System.out.println("Berada di index ke " + (posisiSebelum + 1));
        } else {
             System.out.println("Data tidak ditemukan");
}

    System.out.println("Hasil setelah Ascending");
        listUTS.selectionSortAssending();
        listUTS.tampil();
        int posisiAscending = listUTS.findBinarySearchAscen(cari, 0, listUTS.listUTS.length - 1);
        if (posisiAscending != -1) {
            System.out.println("Berada di index ke " + (posisiAscending));
        } else {
            System.out.println("Data tidak ditemukan setelah diurutkan secara ascending.");
        }


        System.out.println("Hasil setelah Descending");
        listUTS.selectionSortDescending();
        listUTS.tampil();
        int posisiDescending = listUTS.findBinarySearchDescen(cari, 0, listUTS.listUTS.length - 1);
        if (posisiDescending != -1) {
            System.out.println("Berada di index ke " + (posisiDescending));
        } else {
            System.out.println("Data tidak ditemukan setelah diurutkan secara descending.");
        }

    }

    }

