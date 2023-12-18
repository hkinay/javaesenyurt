
import VizeOncesi.Donguler;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Diziler.CokBoyutluDizi();
        HataYakalama.Istisnalar();
        HataYakalama.ThrowAtma();
       // Kasiyer.ParaUstu();

       // int z = faktorAlma(5);
     //   System.out.println(z);
       // Diziler.yildizlar();
/*
        switchCaseornegi();
        Donguler.donguFonk();
        int c = carpim(5,4);
        System.out.println(c);
        merhaba();
        ScannerOrnegi.scannerOrnegi();
        kosullar();
        int g = carpim(3,4,5);
        System.out.println(g);

        System.out.println(kokAlma(45));
        System.out.println(usAlma(3,5));


 */
          }

    private static int faktorAlma(int z){
        if (z >= 1){
            return faktorAlma(z-1) * z;
        }
        else
            return 1;
    }


    private static double usAlma(double a, double b) {
        return Math.pow(a,b);

    }

    private static double kokAlma(double a) {
        return Math.sqrt(a);

    }


    private static void dongulerOrnegi(){
              int i = 0,cifttoplam = 0 ;
              while(i<10){
                  if (i%2==0){
                      System.out.println(i);

                  }

                  ++i;
              }
          }

    private static void kosullar(){
        Scanner scn = new Scanner (System.in);
        //KOŞULLAR
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


    }
static int carpim (int a, int b){
    return a*b;
}

static int carpim(int a, int b, int c){
        return a*b*c;
}
private static void merhaba(){
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



       System.out.println("Merhaba Dünya");
        System.out.println(ad);
        System.out.println(sayi);
        System.out.println(a);
        System.out.println(sayi2);
    System.out.println(ad.toUpperCase());
    System.out.println(kara);

//Aritmetik İşleçler
    // +, *, -, /, %
       /* double toplam = sayi + sayi2;
        System.out.println(toplam);
        sayi3 = 45;
        sayi4=35;
        System.out.println(sayi4 + sayi3);
        System.out.println(45%2); */
    //Mantıksal Operatörler, İşleçler
// <,>,<=,>=,==,!=

    // System.out.println(sayi4>sayi3);
    if (a>sayi) System.out.println("a küçüktür");
}
    private static void switchCaseornegi() {

       Scanner scn= new Scanner(System.in);
        System.out.println("Sayı Seçiniz: ");
        int gun = scn.nextInt();
switch (gun){
    case 1:case 10: case 11: System.out.println("Pazartesi");break;
    case 2: System.out.println("Salı");break;
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
    default:
        System.out.println("İstenilen sayı girilmedi");

}
    }

}