import java.util.Scanner;
public class Soalan3nombor{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan satu nombor:");
        
        int nom = input.nextInt();

        if(nom % 2 == 0){
        System.out.println("Nombor " +nom+ " adalah genap: ");
    }
        
        else{
            System.out.println("Nombor " +nom+ " adalah ganjil ");
        }
    }
}                                                                                                                              