import java.util.Scanner;
public class balokMain27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner untuk inputan
        balok27[] blArray = new balok27[3]; // objek array balok

        blArray[0] = new balok27(100, 30, 12);
        blArray[1] = new balok27(120, 40, 15);
        blArray[2] = new balok27(210, 50, 25);

        
        
        for(int i = 0; i < 3; i++){
            System.out.println("Volume balok ke " + i + ": " + blArray[i].hitungVolume());
        }
    }
    


}   
