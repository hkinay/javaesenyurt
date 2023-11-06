import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Bu kısım yorum kısmı
        //Değişkenler - Variables
        int a,sayi3,sayi4;
        String ad = "Hüseyin";
        double sayi = 20.35;
        a = 5;
        float sayi2 = 32.23f;
        char kara= 'a';
        kara = ad.charAt(3);
        final int tc=345343254;//final deyimi immutable değiştirilemez
        final double pi = 3.1423897;
        boolean cins = true;



       /* System.out.println("Merhaba Dünya");
        System.out.println(ad);
        System.out.println(sayi);
        System.out.println(a);
        System.out.println(sayi2);*/
        System.out.println(ad.toUpperCase());
        System.out.println(kara);

//Aritmetik İşleçler
        // +, *, -, /, %
        double toplam = sayi + sayi2;
        System.out.println(toplam);
        sayi3 = 45;
        sayi4=35;
        System.out.println(sayi4 + sayi3);
        System.out.println(45%2);
        //Mantıksal Operatörler, İşleçler
// <,>,<=,>=,==,!=

        System.out.println(sayi4>sayi3);

        Scanner scn = new Scanner (System.in);
       /* System.out.println("İsim Giriniz : ");
        String h = scn.nextLine();
        System.out.println("Hoşgeldiniz : " + h);*/

        System.out.println("Puanınızı Giriniz : ");
        int puan = scn.nextInt();
        if(puan > 70){
            System.out.println("Tebrikler");
        }
         else if(puan>50) {
            System.out.println("İyi");
        }
        else if (puan > 35){
            System.out.println("Çalışmalısın");
        }
        else{
            System.out.println("Kaldı");
        }


        System.out.println("Sayı Seçiniz: ");
        int gun = scn.nextInt();
switch (gun){
    case 1:
        System.out.println("Pazartesi");
        break;
    case 2:
        System.out.println("Salı");
        break;
    case 3:
        System.out.println("Çarşamba");
        break;
    case 4:
        System.out.println("Perşembe");
        break;
    case 5:
        System.out.println("Cuma");
        break;
    case 6:
        System.out.println("Cumartesi");
        break;
    case 7:
        System.out.println("Pazar");
        break;

}




    }
}