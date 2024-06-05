import java.util.Scanner;
public class GraphMain27 {

    public static void main(String[] args) throws Exception {
        Scanner sc27 = new Scanner(System.in);

        Graph27 gedung = new Graph27(6);
    //     gedung.addEdge(0,1 , 50);
    //     gedung.addEdge(0,2 , 100);
    //     gedung.addEdge(1,3 , 70);
    //     gedung.addEdge(2,3 , 40);
    //     gedung.addEdge(3,4 , 60);
    //     gedung.addEdge(4,5 , 80);
    //     gedung.degree(0);
    //     gedung.printGraph();

    //     gedung.removeEdge(1, 3);
    //     gedung.printGraph();


    //     // Tugas no 5
    //     System.out.print("Masukkan gedung asal: ");
    //     int asal = sc27.nextInt();

    //     System.out.print("Masukkan gedung tujuan: ");
    //     int tujuan = sc27.nextInt();

    //     boolean tetangga = gedung.cekTetangga(asal, tujuan);
    //     char gedungAsal = (char) ('A' + asal);
    //     char gedungTujuan = (char) ('A' + tujuan);
        
    //     if (tetangga) {
    //         System.out.println("Gedung " + gedungAsal + " dan " + gedungTujuan + " bertetangga");
    //     } else {
    //         System.out.println("Gedung " + gedungAsal + " dan " + gedungTujuan + " tidak bertetangga");
    //     }
    // }


    //Modif
    boolean exit = false;

while (!exit) {
    System.out.println("Menu:");
    System.out.println("1. Add Edge");
    System.out.println("2. Remove Edge");
    System.out.println("3. Degree");
    System.out.println("4. Print Graph");
    System.out.println("5. Cek Edge");
    System.out.println("6. Update Jarak");
    System.out.println("7. Hitung Edge");
    System.out.println("8. Keluar");
    System.out.print("Pilih menu: ");
    int menu = sc27.nextInt();

    switch (menu) {
        case 1:
            System.out.print("Masukkan titik awal: ");
            int awal = sc27.nextInt();
            System.out.print("Masukkan titik akhir: ");
            int akhir = sc27.nextInt();
            System.out.print("Masukkan bobot: ");
            int bobot = sc27.nextInt();
            gedung.addEdge(awal, akhir, bobot);
            break;
        case 2:
            System.out.print("Masukkan titik awal: ");
            int removeAwal = sc27.nextInt();
            System.out.print("Masukkan titik akhir: ");
            int removeAkhir = sc27.nextInt();
            gedung.removeEdge(removeAwal, removeAkhir);
            break;
        case 3:
            System.out.print("Masukkan titik: ");
            int titik = sc27.nextInt();
            gedung.degree(titik);
            break;
        case 4:
            gedung.printGraph();
            break;
        case 5:
            System.out.print("Masukkan titik awal: ");
            int asal = sc27.nextInt();
            System.out.print("Masukkan titik tujuan: ");
            int tujuan = sc27.nextInt();
            boolean tetangga = gedung.cekTetangga(asal, tujuan);
            char gedungAsal = (char) ('A' + asal);
            char gedungTujuan = (char) ('A' + tujuan);
            if (tetangga) {
                System.out.println("Gedung " + gedungAsal + " dan " + gedungTujuan + " bertetangga");
            } else {
                System.out.println("Gedung " + gedungAsal + " dan " + gedungTujuan + " tidak bertetangga");
            }
            break;
        case 6:
            System.out.print("Masukkan titik awal: ");
            int asalUpdate = sc27.nextInt();
            System.out.print("Masukkan titik tujuan: ");
            int tujuanUpdate = sc27.nextInt();
            System.out.print("Masukkan jarak baru: ");
            int jarakBaru = sc27.nextInt();
            gedung.updateJarak(asalUpdate, tujuanUpdate, jarakBaru);
            break;
        case 7:
            int edgeCount = gedung.hitungEdge();
            System.out.println("Banyaknya edge dalam graf: " + edgeCount);
            break;
        case 8:
            exit = true;
            break;
        default:
            System.out.println("Pilihan tidak valid.");
            break;
    }
}

}
}

