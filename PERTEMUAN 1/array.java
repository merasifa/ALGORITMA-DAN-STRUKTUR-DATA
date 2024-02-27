import java.util.Scanner;

public class array {
    
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        
        //matakuliah dan bobot yg telah ditentukan
        String[] mataKuliah = {"Pancasila","KTI", "CTPS","Matdas", "Bahasa Inggris", "Daspro", "Prak Daspro","K3" };
        double[] angka = new double[mataKuliah.length];
        String[] huruf = new String[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];

        int[] bobotSKS = {2,2,2,3,2,2,3,2};
        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        for( int i = 0; i <mataKuliah.length; i++){
            System.out.print("Masukkan Nilai angka untuk MK " + mataKuliah[i] + ":");
            angka[i] = input27.nextDouble();
        }

        System.out.println("==============================");
        System.out.println("      Hasil Konversi Nilai    ");
        System.out.println("==============================");

        System.out.printf("%-50s %-20s %-19s %-11s%n", "MK","Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalNilai = 0;

        // perulangan 
        for(int i = 0; i < mataKuliah.length; i++ ) {
            if (angka[i] > 80 && angka[i] <= 100){
                huruf[i] = "A";
                bobotNilai[i] = 4.00;
            }
            else if (angka[i] > 73 && angka[i] <= 80){
                huruf[i] = "B";
                bobotNilai[i] = 4.00;
            }
            else if (angka[i] > 65 && angka[i] <= 73){
                huruf[i] = "B+";
                bobotNilai[i] = 4.00;
            }
            else if (angka[i] > 50 && angka[i] <= 60){
                huruf[i] = "C+";
                bobotNilai[i] = 4.00;
            }
            else if (angka[i] > 39 && angka[i] <= 50){
                huruf[i] = "C";
                bobotNilai[i] = 4.00;
            }
            else if ( angka[i] <= 39){
                huruf[i] = "D";
                bobotNilai[i] = 4.00;
            } else {
                System.out.println("Nilai yang anda masukkan tidak valid");
            }

            double hasil = bobotNilai[i] * bobotSKS[i];
            totalNilai += hasil;

            System.out.printf("%-53s %-23s %-17s %-11s%n", mataKuliah[i],angka[i], huruf[i], bobotNilai[i]);


            if (i == mataKuliah.length - 1){
                System.out.println("==============================");
                System.out.println("IP :" + (totalNilai/18));
            }
        }


        

        }


        




    }   
