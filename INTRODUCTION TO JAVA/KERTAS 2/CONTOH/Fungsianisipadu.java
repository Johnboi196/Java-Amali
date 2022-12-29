public class Fungsianisipadu {
    static java.util.Scanner taip = new java.util.Scanner(System.in);
    public static void main(String[] args) {
       
        //Isytihar Pembolehubah
        double papar;
        //Umpuk nilai dengan sub aturcara fungsi 
        papar = kiraLuas();
        //Panggil semula nilai untuk Output
        System.out.println("Isipadu bagi kuboid yang adalah "+papar+" padu");
    }
    //Sub aturcara yang berbentuk fungsi 
    static double kiraLuas(){
        //Declare pembolehubah 
        double panjang, lebar, tinggi, isipadu;
        System.out.println("Panjang kuboid: ?");
        panjang = taip.nextDouble();
        System.out.println("Lebar kuboid: ?");
        lebar = taip.nextDouble();
        System.out.println("Tinggi kuboid: ?");
        tinggi = taip.nextDouble();
        //Lakukan operasi pengiraan
        isipadu = panjang*lebar*tinggi;
        //Hantar data setelah dilakukan pengiraan 
        return Math.round(isipadu);
    }
}
