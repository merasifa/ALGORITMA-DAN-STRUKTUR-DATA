import java.util.Scanner;

public class perulangan {
    
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        String nim;
        int n;

        System.out.println("=======================");
        System.out.print("Masukkan NIM : ");
        nim = input27.next();
        System.out.println("=======================");
        n = Integer.parseInt(nim.substring(nim.length() - 2));

        if (n < 10)  {
            n += 10;
        }

        System.out.println("n :" + n);
        
        for (i > 10, i= n, i++){

        }
        

    }
}
