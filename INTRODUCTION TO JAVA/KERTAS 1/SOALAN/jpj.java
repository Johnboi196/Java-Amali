//SOALAN 2 AKTIVITI 5.1.1
//import java.time.Year;
import java.util.Scanner;
public class jpj {
    public static void main(String[] args) {
        System.out.println("Aturcara kelayakan umur membuat lesan memandu");
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tahun kelahiran anda : ");
        int tahun = input.nextInt();

        input.close();
        if
        (tahun <= 2004)
        System.out.println("Anda sudah layak memohon lesen memandu ");
        else{
            System.out.println("Maaf, anda belum layak memohon lesen memandu");
        }




        
    }
    
}
