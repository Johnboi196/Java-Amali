import java.util.Scanner;
public class Gred {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Gred Mata Pelajaran Sains");
        String Sains = input.nextLine();

        
        System.out.println("Masukkan Gred Mata Pelajaran Matematiks");
        String Math = input.nextLine();

        input.close();

        boolean beza = Sains.equals(Math);

        if (beza == true){
            System.out.println("Gred yang anda diperolehi sama");
        }
        else{
            System.out.println("Gred yang anda diperolehi tidak sama");
        }
    }
}