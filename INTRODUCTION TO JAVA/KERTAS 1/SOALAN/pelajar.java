import java.util.Scanner;
public class pelajar {
    public static void main(String[] args) {
        System.out.println("Atucara yang memberi tentang markah pelajar");
        Scanner input = new Scanner (System.in);

        System.out.println("Masukan markah anda : ");
        int markah = input.nextInt();

        input.close();
       if
        (markah >= 45)
        System.out.println("Tahniah,Anda lulus");
       
       else{
        System.out.println("Anda gagal, cuba lagi");
       }

        
    }
    
}
