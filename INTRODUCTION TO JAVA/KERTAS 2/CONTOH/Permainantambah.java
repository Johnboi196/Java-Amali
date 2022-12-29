//Import class
import java.util.Scanner;
public class Permainantambah {
    public static void main (String[] args){
        //Paparan output-makluman awal aturcara
        System.out.println("ATURCARA PERMAINAN MATEMATIK-OPERASI TAMBAH");
        //Pengisytiharan pembolehubah Scanner
        Scanner input= new Scanner(System.in);
        //Ishtihar pembolehubah dan Papar teks pertanyaan 
        int nom1 = (int)(Math.random()*101);
        int nom2 = (int)(Math.random()*101);
        System.out.print("Nyatakan Jawapan "+nom1+" + "+nom2+"= ");
        int jawapan = input.nextInt();
        //Kawalan ulangan guna while
        while (nom1 + nom2 != jawapan){
            //Papar output jika jawapan salah dan ulang tanya
            System.out.print("Jawapan anda salah! Sila cuba lagi... \n Nyatakan Jawapan " +nom1+ " + "+nom2+"= ");
            jawapan = input.nextInt();
        }
        //Papar output jika jawapan betul
        System.out.println("Tahniah, jawapan anda betul!");
    }
}