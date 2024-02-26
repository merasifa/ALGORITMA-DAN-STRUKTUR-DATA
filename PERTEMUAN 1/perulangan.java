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

        System.out.println("n : " + n);
        System.out.println("=======================");
        for (int i=1; i <= n; i++){
            if (i  != 6 && i !=10) {
                if (i %2 == 0) {
                    System.out.print(i);
                } else {
                System.out.print( "*");
            }
        }
        

    }
}
}
