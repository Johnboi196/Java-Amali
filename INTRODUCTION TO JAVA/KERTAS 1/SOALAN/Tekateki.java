import java.util.Scanner;
public class Tekateki {
    
    public static void main(String[] args){
//untuk declare libary scanner
        Scanner input = new Scanner(System.in);
//untuk papar soalan
        System.out.println("anda perlu meneka salah satu aksara A-Z");
//declare huruf dengan string dan input
        String huruf = input.nextLine();
//true jika h
        if (huruf.equals("H") || huruf.equals("h")){
            System.out.println("anda betul");
        }
//salah jika selain h
        else{
            System.out.println("anda salah");
        }
    

    }


}
