import java.util.Scanner;
import Veritabani.CONSTANT.*;

public class Kasiyer {
    public static void ParaUstu(){
        Scanner al = new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        int sayi = al.nextInt();

        int [] tedavul = new int [7];
        tedavul[0] = 200;
        tedavul [1] = 100;
        tedavul[2] = 50;
        tedavul[3] = 20;
        tedavul[4] = 10;
        tedavul[5] = 5;
        tedavul[6] = 1;

        for (int i = 0; i < tedavul.length; i++) {
            int adet = 0;
            adet = sayi/tedavul[i];
            if (adet!=0){
                System.out.println(adet + " adet " + tedavul[i]);

            }
            sayi = sayi - adet*tedavul[i];

        }


    }
}
