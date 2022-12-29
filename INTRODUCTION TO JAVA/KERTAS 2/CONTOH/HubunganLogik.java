import java.util.Scanner;
public class HubunganLogik {
    public static void main(String[] args) {        
    //declare variable Scanner
    Scanner input = new Scanner(System.in);
    //Makluman awal aturcara
    System.out.println("ATURACARA MENENTUKAN TAHAP UMUR");
    //Papar teks pernyataan 
    System.out.println("Taip umur anda dan tekan ENTER: ");
    int umur = input.nextInt();       
    input.close();
        //Kawalan if-else-if dengan operator hubungan & logik 
        if (!(umur > 11)){
        System.out.println("Anda masih kanak-kanak");
            }
        else if(umur >= 11 && umur <= 18){
        System.out.println("Anda masih remaja");
            }
        else if (umur > 18 && umur <=35){
        System.out.println("Anda masih dewasa");
            }
        else if (umur == 36 || umur <=60){
         System.out.println("Anda sudah dipertengahan dewasa");
            }
    else{
        System.out.println("Anda sudah warga emas");
        }
    }
}
