//import claas
import java.time.Year;
import java.util.Scanner;
public class umurdewasa {
    public static void main(String[] args) {

//Paparan output-maklumat awal aturrcara
System.out.println("Aturcara mengikut umur & peringkat dewasa ");

//declaire pembolehubah scanner
        Scanner input = new Scanner(System.in);

//papar teks pertanyaan
        System.out.print("Taip tahun kelahiran anda dan tekan enter: ");
       

//declaire pembolehubah input dan output
        int tahun_lahir = input.nextInt();
        int tahun_semasa;
        int umur;

        input.close();
//Pengiraan umur
        tahun_semasa = Year.now().getValue();
        umur=tahun_semasa-tahun_lahir;

        //mengunakan struktur kawalan if
            if (umur < 19){
        
        //papar output
        System.out.println("anda berumur "+umur+", anda belum dewasa.");
            }        
    }
    
}
