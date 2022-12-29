public class Operasi {
    public static void main(String[] args) {
      
        int nom1,nom2;
        int op1,op2,op3;
        double op5,op4;

        nom1=15;
        nom2=2;

        op1=nom1+nom2;
        op2=nom1-nom2;
        op3=nom1*nom2;
        op4=nom1/nom2;
        op5=nom1%nom2;

        System.out.println("Hasil tambah:" +nom1+'+' +nom2+ '=' +op1);
        System.out.println("Hasil tolak:" +nom1+'-' +nom2+ '=' +op2);
        System.out.println("Hasil darab:" +nom1+'*' +nom2+ '=' +op3);
        System.out.println("Hasil bahagi:" +nom1+'/' +nom2+ '=' +op4);
        System.out.println("Hasil modulos:" +nom1+'%' +nom2+ '=' +op5);
    }
    
}
