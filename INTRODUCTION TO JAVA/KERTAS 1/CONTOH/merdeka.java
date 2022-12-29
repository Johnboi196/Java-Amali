//import class
import java.util.Scanner;
public class merdeka {
    public static void main(String[] args) {

//paparan output-makluman awal aturcara
System.out.println("ATURCARA TENTUKAN LAHIR SEBELUM /SELEPAS MERDEKA");

//declaire pembolehubah Scanner
        Scanner input = new Scanner(System.in);

//papar teks pertanyaan
        System.out.print("Masukkan tahun anda dilahirkan dan tekan ENTER: ");
        int lahir = input.nextInt();

//Declaire pembolehubah input
        int merdeka=1957;

        input.close();
//Menggunakan struktur kawalan if else
        if (lahir > merdeka){

//Papar output true
            System.out.println ("anda dilahirkan selepas merdeka" );
        }else{

//papar output False
            System.out.println("Anda dilahirkan sebelum merdeka" );
             
        }
        
    }
    
}
