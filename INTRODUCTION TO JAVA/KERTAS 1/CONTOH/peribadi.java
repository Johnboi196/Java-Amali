//import class
import java.time.Year;
import java.util.Scanner;
public class peribadi {
    /**
     * @param args
     */
    public static void main(String[] args) {

        //declaire pembolehubah scanner
        Scanner input = new Scanner (System.in);
        
        //papar teks pertanyaan1 & declaire pembolehubah nilai input1
        System.out.print("Masukan nama anda: ");
        String nama = input.next();

        //papar teks pertanyaan2 & declaire pembolehubah nilai input2
        System.out.print("Masukkan tahun anda dilahirkan: ");
        int tahun = input.nextInt();

        //papar teks pertanyaan3 & declaire pembolehubah nilai input3
        System.out.print("Masukkan bandar anda dilahirkan: ");
        String negeri = input.next ();
        input.close();

        //pengiraan umur
        int tahunsemasa = Year.now().getValue();
        int umur=tahunsemasa-tahun;

        //memaparkan output 
        System.out.println("Nama : "+nama);
        System.out.println("Umur : "+umur);
        System.out.println("Bandar kelahiran : "+negeri);


        
    }
}
