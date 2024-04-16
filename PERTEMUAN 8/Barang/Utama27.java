import java.util.Scanner;

public class Utama27 {
    public static void main(String[] args) {
        // Gudang27 gudang = new Gudang27(7);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kapasitas yang diinginkan: ");
        int kapasitas = scanner.nextInt();

        Gudang27 gudang = new Gudang27(kapasitas);

        while(true){
            System.out.println("\nMenu:");
            System.out.println("1.Tambah barang");
            System.out.println("2.Ambil barang");
            System.out.println("3.Tampilkan tumpukan barang");
            System.out.println("4.Lihat Barang teratas ");
            System.out.println("5.Lihat Barang terbawah ");
            System.out.println("6.Cari Barang");
            System.out.println("7.Keluar");
            System.out.print("Pilih Operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();
                    Barang27 barangBaru = new Barang27(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.println("1.Kode");
                    System.out.println("2.Nama");
                    System.out.print("Masukkan Pilihan : ");
                    int pilihancari = scanner.nextInt();
                    switch (pilihancari) {
                        case 1:
                            System.out.print("Masukkan kode barang : ");
                            int cariBarangKode = scanner.nextInt();
                            scanner.nextLine();
                            gudang.cariBarangKode(cariBarangKode);
                            break;
                        case 2:
                            System.out.print("Masukkan nama barang : ");
                            String cariBarangNama = scanner.nextLine();
                            scanner.nextLine();
                            gudang.cariBarangNama(cariBarangNama);
                            break;
                    
                        default:
                            break;
                    }
                    break;
                case 7:
                break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");;
            }

        }
    }
}
