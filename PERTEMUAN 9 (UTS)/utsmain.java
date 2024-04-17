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
    System.out.println("Sebelum diurutkan");
    listUTS.tampil();
    System.out.println();

    // pencarian data sblm urut
    System.out.print("Masukkan nilai yang dicari: ");
    int nilaiCari = sc.nextInt();
    
    int nilaiHasil = listUTS.findBinarySearchAscen(nilaiCari, 0, listUTS.listUTS.length - 1);
    if (nilaiCari != -1) {
        System.out.println("Nilai"+ nilaiCari + "ditemukan pada indeks " + nilaiHasil );
    } else {
        System.out.println("Nilai tidak ditemukan");
    }

    System.out.println("Nilai diurutkan secara ascending");
    listUTS.selectionSortAssending();
    listUTS.tampil();
    System.out.print("Masukkan nilai yang ingin dicari: ");
    int nilaiCariAscending = sc.nextInt();

    int hasilPencarianAscending = listUTS.findBinarySearchAscen(nilaiCari, 0, listUTS.listUTS.length - 1);
        if (hasilPencarianAscending != -1) {
            System.out.println("Nilai " + nilaiCari + " ditemukan pada indeks ke" + nilaiHasil);
        } else {
            System.out.println("Nilai " + nilaiCari + " tidak ditemukan setelah diurutkan secara ascending.");
        }

    System.out.println("Nilai diurutkan secara descending");
    listUTS.selectionSortDescending();
    listUTS.tampil();

    System.out.print("Masukkan nilai yang ingin dicari: ");
    int nilaiCariDescending = sc.nextInt();

    int hasilPencarianDescending = listUTS.findBinarySearchDescen(nilaiCari, 0, listUTS.listUTS.length - 1);
        if (hasilPencarianAscending != -1) {
            System.out.println("Nilai " + nilaiCariDescending + " ditemukan pada indeks ke" + nilaiHasil);
        } else {
            System.out.println("Nilai " + nilaiCariDescending + " tidak ditemukan setelah diurutkan secara ascending.");
        }
    }


    }

