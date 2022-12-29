import java.util.Scanner;
public class hasildarab {
    public static void main(String[] args) {
        //Paparan output-makluman awal aturcara
        System.out.println("ATURCARA PERMAINAN MATEMATIK-OPERASI DARAB");
        //Declare variable Scanner
       Scanner input = new Scanner(System.in);
        //Declare variable dan Papar teks pernyataan
        int nom1, nom2;
        String jawab; 
        //Kawalan ulangan do while 
        do{
            System.out.println("Nombor Pertama: ");
            nom1=input.nextInt();
            System.out.println("Nombor Kedua: ");
            nom2=input.nextInt();
        //Paparan Output 
        System.out.println("Hasil darab: "+nom1+" X "+nom2+" = " + Math.abs(nom2 * nom1));  
        //Pernyataan ulangan 
        System.out.println("Taipkan Y untuk teruskan..");
        jawab=input.next();
        input.close();
        //Ulangan selagi syarat ditepati
        }while (jawab.equals("Y") || jawab.equals("y"));
        
    }
}