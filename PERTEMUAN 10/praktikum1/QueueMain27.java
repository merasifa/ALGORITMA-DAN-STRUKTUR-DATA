import java.util.Scanner;

public class QueueMain27 {
    public static void menu() {
        System.out.println("Pilih Menu:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int n = sc27.nextInt();

        queue27 q = new queue27(n);

        int pilih;
        do {
            menu();
            pilih = sc27.nextInt();
            switch(pilih) {
                case 1:
                    System.out.println("Masukkan data baru: ");
                    int dataMasuk = sc27.nextInt();
                    q.Enqueue(dataMasuk);
                    break;
                
                case 2:
                int dataKeluar = q.Dequeue();
                if (dataKeluar != 0) {
                    System.out.println("Data yang dikeluarkan: " + dataKeluar);
                }
                    
                
                case 3:
                    q.print();
                    break;

                case 4:
                    q.peek();
                    break; 

                case 5: 
                    q.clear();
                
                default :
                    break;
                
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}