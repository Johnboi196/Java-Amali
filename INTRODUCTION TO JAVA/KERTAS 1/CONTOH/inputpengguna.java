//Import class
import java.util.Scanner;
public class inputpengguna {
    public static void main(String[] args) {

//pengisytiharan pembolehubah scanner 
        Scanner input = new Scanner (System.in);

//papar teks pertanyaan
        System.out.print("Masukkan nilai jejari bulatan: ");
        
//declaire pembolehubah yang memegang nilai input
        double jejari = input.nextDouble();
        input.close();

//Membuat pengiraan dan bundar kepada 2 tempat perpuluhan
double luas = Math.round((jejari*jejari*3.14159)*100.0)/100.0;

//papar output 
System.out.println("Luas bulatan dengan jejari "+ jejari + " adalah "+luas+" persegi");
        
    }
    
}
