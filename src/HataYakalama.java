import java.sql.SQLOutput;
import java.util.Scanner;

public class HataYakalama {
    public static void Istisnalar(){
       while (true){try
       {
           Scanner al = new Scanner(System.in);
           System.out.println("Bir sayı giriniz :");
           int sayi1 = al.nextInt();
           System.out.println("2. sayıyı giriniz: ");
           int sayi2 = al.nextInt();

           // int [] diziler = new int[5];
           // diziler[10] = 45;
           double a = (sayi1)/sayi2; // Hata oluşabilecek kodlar


           System.out.println(a);
           break;
           // String s = null;
           // System.out.println(s);
           //System.out.println("bu kısım kodun kalan kısmına devam eder");
       }
       catch (ArithmeticException e){
           //System.out.println(e);
           System.out.println("Sıfıra bölünme hatası " + e);
       }
       catch (NullPointerException n){
           System.out.println(n);
       }
       catch (IndexOutOfBoundsException boundhata){
           System.out.println("Fazla sayıda eleman girdiniz " + boundhata);
       }
       catch (Exception r){
           System.out.println("Bir hata oluştu.");
       }
      /* finally {
           System.out.println("Hata Yakalandı");

       }*/



        }




    }
public static void ThrowAtma() {

    Scanner al = new Scanner(System.in);
    System.out.println("Bir sayı giriniz :");
    int sayi1 = al.nextInt();
    System.out.println("2. sayıyı giriniz: ");
    int sayi2 = al.nextInt();
    if(sayi2==0){
        throw new RuntimeException("Sıfıra bölünme hatası");
    }
    else{
        System.out.println(sayi1/sayi2);
    }
}
}
