import java.util.Scanner;
public class Aturcaraparameter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //Istihar pembolehubah 
        double lebar, tinggi;
        System.out.println( "KIRA LUAS SEGITIGA " );
        //Ambil nilai tinggi 
        System.out.println("Tinggi segitiga : ");
        tinggi = keyboard.nextDouble();
        System.out.println( "Lebar segitiga : " );
        lebar = keyboard.nextDouble();
        keyboard.close();
        //panggil sub aturcara
        kiraSegitiga( tinggi,lebar);
    }
    //sub aturcara guna perimeter
    public static void kiraSegitiga(double tinggi, double lebar){
        //Laksana operasi tanpa pulangkan nilai 
        double luas = 0.5*tinggi*lebar;
        System.out.println("Luas segitiga adalah "+luas+" persegi.");
    
    }    
}
