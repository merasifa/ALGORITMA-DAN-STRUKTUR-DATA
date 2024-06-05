import java.util.Scanner;
public class GraphMain27 {

    public static void main(String[] args) throws Exception {
        Scanner sc27 = new Scanner(System.in);

        Graph27 gedung = new Graph27(6);
        gedung.addEdge(0,1 , 50);
        gedung.addEdge(0,2 , 100);
        gedung.addEdge(1,3 , 70);
        gedung.addEdge(2,3 , 40);
        gedung.addEdge(3,4 , 60);
        gedung.addEdge(4,5 , 80);
        gedung.degree(0);
        gedung.printGraph();

        gedung.removeEdge(1, 3);
        gedung.printGraph();


        // Tugas no 5
        System.out.print("Masukkan gedung asal: ");
        int asal = sc27.nextInt();

        System.out.print("Masukkan gedung tujuan: ");
        int tujuan = sc27.nextInt();

        boolean tetangga = gedung.cekTetangga(asal, tujuan);
        char gedungAsal = (char) ('A' + asal);
        char gedungTujuan = (char) ('A' + tujuan);
        
        if (tetangga) {
            System.out.println("Gedung " + gedungAsal + " dan " + gedungTujuan + " bertetangga");
        } else {
            System.out.println("Gedung " + gedungAsal + " dan " + gedungTujuan + " tidak bertetangga");
        }
    }
}
