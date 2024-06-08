import java.util.Scanner;


public class VaksinMain27 {
    public static void main(String[] args) {
        Vaksin27 linkedList = new Vaksin27();
        Scanner scanner27 = new Scanner (System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambahkan peserta vaksinasi");
            System.out.println("2. Hapus peserta vaksinasi");
            System.out.println("3. Tampilkan antrian vaksinasi");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu: ");
            int choice = scanner27.nextInt();

            switch (choice) {
                case 1:
                    scanner27.nextLine();
                    System.out.print("Masukkan nama peserta: ");
                    String name = scanner27.nextLine();
                    linkedList.addLast(name);
                    System.out.println("Peserta " + name + " telah ditambahkan ke dalam antrian vaksinasi.");
                    break;
                case 2:
                    scanner27.nextLine(); // Clear newline character
                    System.out.print("Masukkan nama peserta yang ingin dihapus: ");
                    String nameToRemove = scanner27.nextLine();
                    linkedList.remove(nameToRemove);
                    break;
                case 3:
                    System.out.println("\nAntrian vaksinasi:");
                    linkedList.display();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    scanner27.close();
                    System.exit(0);
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu yang sesuai.");
            }
        }
    }  
    }

