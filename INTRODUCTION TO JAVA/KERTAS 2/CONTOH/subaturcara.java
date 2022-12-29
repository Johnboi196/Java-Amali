import java.util.Scanner;
public class subaturcara {
    public static void main(String[] args) {
        //Panggil semula sub aturcara 1,2 dan 3
        namaAnda();
        soalan();
        ucapan();
    }
    //Sub 1 
    static void soalan(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan satu nombor bulat: ");
        int nombor=input.nextInt();
        input.close();
    //Tentukan nombor genap ganjil 
    if (nombor % 2 == 0){
        System.out.println(nombor +" adalah nombor genap.");
    }else{
        System.out.println(nombor +" adalah nombor ganjil.");
    }
    }
    //Sub 2
    static void ucapan(){
        System.out.println("Terima Kasih, sila cuba lagi");
    }
    //Sub 3 
    static void namaAnda(){
        System.out.println("TENTUKAN NOMBOR GENAP/GANJIL");
        Scanner nama = new Scanner(System.in);
        System.out.println("Nama anda : ");
        String namaSendiri = nama.next();
        System.out.println("Terima Kasih : " +namaSendiri);
        nama.close();
    }
}