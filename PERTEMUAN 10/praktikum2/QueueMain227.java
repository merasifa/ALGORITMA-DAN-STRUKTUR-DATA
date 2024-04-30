import java.util.Scanner;

public class QueueMain227 {
    public static void menu() {
        System.out.println("Pilih Menu:");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc27.nextInt();

        Queue227 antri = new Queue227(jumlah);

        int pilih;
        do {
            menu();
            pilih = sc27.nextInt();
            switch(pilih) {
                case 1:
                    System.out.println("No Rekening: ");
                    String norek = sc27.next();
                    System.out.println("Nama: ");
                    String nama = sc27.next();
                    System.out.println("Alamat: ");
                    String alamat = sc27.next();
                    System.out.println("Umur:");
                    int umur = sc27.nextInt();
                    System.out.println("Saldo: ");
                    double saldo = sc27.nextDouble();
                    nasabah27 nb = new nasabah27(norek, nama, alamat, umur, saldo);
                    sc27.nextLine();
                    antri.Enqueue(nb);
                    break;
                
                    case 2:
                    nasabah27 data = antri.Dequeue();
                    if (data != null) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " 
                            + data.alamat + " " + data.umur + " " + data.saldo);
                    } else {
                        System.out.println("Antrian kosong, tidak ada data yang dikeluarkan.");
                    }
                    break;
                
                case 3:
                    antri.peek();
                    break;

                case 4:
                    antri.print();
                    break; 
                
                default :
                    break;
                
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}