import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
      Scanner input27 = new Scanner(System.in);

        char[]kode= {'A', 'B', 'D', 'E', 'F','G','H', 'L', 'N', 'T' };
        char[][]kota=
        {{'B', 'A', 'N', 'T', 'E', 'N'},
        {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
        {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
        {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
        {'B', 'O', 'G', 'O', 'R'},
        {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
        {'S', 'E', 'M', 'A', 'R','A', 'N', 'G'},
        {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
        {'M', 'A', 'L', 'A', 'N', 'G'},
        {'T', 'E', 'G', 'A', 'L'}};

        System.out.print("Masukkan jumlah plat mobil yang ingin Anda cari: ");
        int konfirmasi = input27.nextInt();

        for (int l = 0; l< konfirmasi; l++){
            System.out.print("Masukkan kode plat mobil: ");
            char inputUser = input27.next().charAt(0);

            switch (inputUser){
                case 'A': 
                    for (int i = 0; i <=0 ; i++){
                        System.out.print("Plat " + kode[0] + " adalah plat di kota: ");
                        for(int j = 0; j <kota[0]. length; j++){
                            System.out.print( kota[i][j]);
                        }
                            System.out.println();
                    }
                    break;
    
                case 'B': 
                    for (int i = 1; i <=1; i++){
                        System.out.print("Plat " + kode[1] + " adalah plat di kota: ");
                        for(int j = 0; j <kota[1]. length; j++){
                            System.out.print(kota[i][j]);
                        }
                            System.out.println();
                    }
                    break;
    
                case 'D': 
                    for (int i = 2; i <=2; i++){
                        System.out.print("Plat " + kode[2] + " adalah plat di kota: ");
                        for(int j = 0; j <kota[2]. length; j++){
                            System.out.print(kota[i][j]);
                        }
                            System.out.println();
                    }
                    break;
                
                case 'E': 
                    for (int i = 3; i <=3; i++){
                        System.out.print("Plat " + kode[3] + " adalah plat di kota: ");
                        for(int j = 0; j <kota[3]. length; j++){
                            System.out.print(kota[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                
                case 'F': 
                    for (int i = 4; i <=4; i++){
                        System.out.print("Plat " + kode[4] + " adalah plat di kota: ");
                        for(int j = 0; j <kota[4]. length; j++){
                            System.out.print(kota[i][j]);
                        }
                        System.out.println();

                    }
                    break;
                
                case 'G': 
                    for (int i = 5; i <=5; i++){
                        System.out.print("Plat " + kode[5] + " adalah plat di kota: ");
                        for(int j = 0; j <kota[5]. length; j++){
                            System.out.print(kota[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                
                case 'H': 
                    for (int i = 6; i <=6; i++){
                        System.out.print("Plat " + kode[6] + " adalah plat di kota: ");
                        for(int j = 0; j <kota[6]. length; j++){
                            System.out.print(kota[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                
                case 'L': 
                    for (int i = 7; i <=7; i++){
                        System.out.print("Plat " + kode[7] + " adalah plat di kota: ");
                        for(int j = 0; j <kota[7]. length; j++){
                            System.out.print(kota[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                
                case 'N': 
                    for (int i = 8; i <=8; i++){
                        System.out.print("Plat " + kode[8] + " adalah plat di kota: ");
                        for(int j = 0; j <kota[8]. length; j++){
                            System.out.print(kota[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                
                case 'T': 
                    for (int i = 9; i <=9; i++){
                        System.out.print("Plat " + kode[9] + " adalah plat di kota: ");
                        for(int j = 0; j <kota[9]. length; j++){
                            System.out.print(kota[i][j]);
                        }
                        
                    }
                    break;
                
                default:
                    System.out.println("Plat tidak valid ");

            }
            }
    }

    

}
