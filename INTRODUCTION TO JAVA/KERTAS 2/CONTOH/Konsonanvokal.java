    //Import class
import java.time.Year;
import java.util.Scanner;
    public class Konsonanvokal {
    public static void main (String [] args){
System.out.println("ATURCARA BILANG HURUF KONSONAN & VOKAL");
// Pengisytiharan pembolehubah Scanner
Scanner input = new Scanner(System.in);
//Papar teks pertanyaan dan istihar pembolehubah
System.out.println("Taipkan satu perkataan dan tekan ENTER");
String perkataan = input.next();
char[] hurufv = perkataan.toCharArray();
int vokal = 0;
//Kawalan ulangan for
for (char h: hurufv){
    if ( h == 'a' ||h == 'A' ||h == 'e' ||h == 'E' ||h == 'i' ||h == 'I' ||h == 'o' ||h == 'O' ||h == 'u' || h == 'U'){
        vokal++;
    }
}
//Paparan output
System.out.println("Bilangan huruf vokal dalam" + perkataan + "adalah: " + vokal);
System.out.println("Bilangan huruf konsonan dalam "+ perkataan + "adalah: " + (hurufv.length - vokal));
    }
}