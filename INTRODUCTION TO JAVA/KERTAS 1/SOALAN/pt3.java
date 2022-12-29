//SOALAN 2 AKTIVITI 5.1.1
import java.util.Scanner;
public class pt3 {
    public static void main(String[] args) {
        System.out.println("Syarat yang dibenarkan ialah : ");
        Scanner input = new Scanner (System.in);

        System.out.println("Masukan bilangan A yang anda perolehi");
        int total = input.nextInt();
        System.out.println("adakah anda mendapat gred A didalam Math dan B.inggeris?");
        boolean math = input.nextBoolean();

        input.close();
        if
            (total >= 5){
            if
                (math == true ){
                System.out.println("Tahniah anda layak memasuki kelas 4 sains komputer");
            }
            else 
                {
                System.out.println("anda gagal");
            }
        }



        
    }
    
}
