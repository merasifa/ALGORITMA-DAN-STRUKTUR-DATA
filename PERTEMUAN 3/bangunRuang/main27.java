import java.util.Scanner;

public class main27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// scanner untuk inputan

        System.out.println("============================================");
        System.out.println("PROGRAM MENGHITUNG BANGUN RUANG");
        System.out.println("============================================");
        System.out.println("1. KERUCUT ");
        System.out.println("2. BOLA ");
        System.out.println("3. LIMAS ");
        System.out.print("PILIH 1/2/3: ");
        int menu = sc.nextInt(); 
        switch (menu) {
            case 1:
                System.out.println("======================================");
                System.out.print("Masukkan banyak kerucut : ");
                int jmlK = sc.nextInt();
                kerucut27[] listK = new kerucut27[jmlK];

                for(int i= 0; i < jmlK ; i++){ //looping untuk menerima inputan 
                    listK[i] = new kerucut27();
                    System.out.print("Masukkan jari - jari kerucut ke " + (i+1) +" :" );
                    listK[i].jariJari = sc.nextInt();
        
                    System.out.print("Masukkan Sisi Miring : ");
                    listK[i].sisi= sc.nextInt();
                }
        
                //cetak objek
                for(int i=0; i < listK.length; i++){
                    System.out.println("============================================");
                    System.out.println("Bangun Ruang Kerucut ke " + (i+1));
                    System.out.println("============================================");
                    System.out.println("Luas Permukaan ke "  + (i+1) + ": " + listK[i].hitungLP());
                    System.out.println("Volume ke "  + (i+1) + ": " + listK[i].hitungVolume());
                    
                }
                break;

                case 2:
                System.out.println("======================================");
                System.out.print("Masukkan banyak bola : ");
                int jmlB = sc.nextInt();
                bola27[] listB = new bola27[jmlB];

                for(int i= 0; i < jmlB ; i++){ //looping untuk menerima inputan 
                    listB[i] = new bola27();
                    System.out.print("Masukkan jari - jari bola ke "  + (i+1) + " :" );
                    listB[i].jariJari = sc.nextInt();
                }
        
                //cetak objek
                for(int i=0; i < listB.length; i++){
                    System.out.println("============================================");
                    System.out.println("Bangun Ruang Bola ke " + (i+1));
                    System.out.println("============================================");
                    System.out.println("Luas Permukaan ke "  + (i+1) + ": " + listB[i].hitungLP());
                    System.out.println("Volume ke "  + (i+1) + ": " + listB[i].hitungVolume());
                    
                }
                break;

                case 3:
                System.out.println("======================================");
                System.out.print("Masukkan banyak limas : ");
                int jmlL = sc.nextInt();
                limas27[] listL = new limas27[jmlL];

                for(int i= 0; i < jmlL ; i++){ //looping untuk menerima inputan 
                    System.out.print("Masukkan panjang sisi alas limas ke  " + (i+1) +" :");
                    int panjangSisiAlas = sc.nextInt();

                    System.out.print("Masukkan tinggi limas ke  " + (i+1)+ " :");
                    int tinggi = sc.nextInt();

                    listL[i] = new limas27(panjangSisiAlas, tinggi);

                }
        
                //cetak objek
                for(int i=0; i < listL.length; i++){
                    System.out.println("============================================");
                    System.out.println("Bangun Ruang Limas ke " + (i+1));
                    System.out.println("============================================");
                    System.out.println("Luas Permukaan "  + (i+1) + " : " + listL[i].hitungLP());
                    System.out.println("Volume "  + (i+1) + " : " + listL[i].hitungVolume());
                    
                }
                break;
        
            default:
                break;
        }


       
    }
}
