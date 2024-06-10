import java.util.Scanner;

public class FilmMain27 {
    public static void main(String[] args) {
        DoubleFilm27 dll = new DoubleFilm27();
        Scanner sc27 = new Scanner(System.in);
        int pilihan;

    do {
        System.out.println(" Menu ");
        System.out.println("1. Tambah data di awal");
        System.out.println("2. Tambah data di akhir");
        System.out.print("Pilih Menu :");
        pilihan = sc27.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan id: ");
                int id = sc27.nextInt();
                System.out.print("Masukkan judul: ");
                String judul = sc27.nextLine();
                System.out.println("Masukkan rating: ");
                double rating = sc27.nextDouble();
                dll.tambahAwal(id, judul, rating);
                break;

            case 2:
                System.out.print("Masukkan id: ");
                int id1 = sc27.nextInt();
                sc27.nextLine();
                System.out.print("Masukkan judul: ");
                String judul1 = sc27.nextLine();
                System.out.println("Masukkan rating: ");
                double rating1 = sc27.nextDouble();
                dll.tambahAkhir(id1, judul1, rating1);
                break;
        
            default:
                break;
        }

    } while (pilihan != 0);

    }
}
