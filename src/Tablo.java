import java.util.Scanner;

public class Tablo {
    public static void main(String[] args) {
        int sayi;
        Scanner scn = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        sayi = scn.nextInt();

        System.out.print( "*|");
        for (int i=1;i<=sayi;++i){
            System.out.printf("%4d",i);
        }
        System.out.println();
        System.out.print("--");
        for(int col = 1;col<=sayi;++col){
            System.out.printf("%4s","----");
        }
        System.out.println();
        for (int satir = 1;satir<=sayi;++satir){
            System.out.printf("%2d",satir);
            for (int sutun = 1;sutun<=sayi;++sutun){
                System.out.printf("%4d",satir*sutun);
            }
            System.out.println();
        }
    }


}
