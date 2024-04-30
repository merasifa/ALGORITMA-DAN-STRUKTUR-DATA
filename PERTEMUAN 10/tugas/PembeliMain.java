import java.util.Scanner;

public class PembeliMain {
     public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        Scanner sc277 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc27.nextInt();

        QueuePembeli27 Q = new QueuePembeli27(jumlah);

        int pilih = 0;

        do {
            Q.menu();
            pilih = sc27.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = sc277.nextLine();
                    System.out.print("NO HP : ");
                    int noHP = sc27.nextInt();
                    pembeli27 nb = new pembeli27(nama, noHP);
                    Q.Enqueue(nb);
                    break;
                case 2:
                    pembeli27 data = Q.Dequeue();
                    if (!"".equals(data.nama) && data.noHP != 0) {
                        System.out.println("Data yang dikeluarkan : " + data.nama + " " + data.noHP);
                    }
                    break;
                case 3:
                    Q.Peek();
                    break;
                case 4:
                    Q.DaftarPembeli();
                    break;
                case 5:
                    Q.PeekRear();
                    break;
                case 6:
                    System.out.print("Masukkan nama pembeli yang ingin dicari : ");
                    String cariNama = sc277.nextLine();
                    Q.PeekPosition(cariNama);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
     }
}