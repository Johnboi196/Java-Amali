import java.util.Scanner;
public class increment {
    public static void main(String[] args) {       
        //Ishtihar pembolehubah 
        int input, i, j, k;
        //Declare pembolehubah Scanner
        Scanner scan = new Scanner(System.in);
        //Papar teks pertanyaan
        System.out.print("Bilangan baris piramid terbalik: ");
        input = scan.nextInt();
        //Control Structure 'for' dengan kawalan Increment dan Decrement 
        for(i=input; i>=1; i--){
            for(j=input; j>=i; j--){
            System.out.print(" ");
            }
        for(k=1; k<(i*2); k++){
            //Papar Output
            System.out.print("*");
        }
        System.out.println();
        }
    }
}
