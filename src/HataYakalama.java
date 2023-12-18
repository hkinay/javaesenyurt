import java.sql.SQLOutput;
import java.util.Scanner;

public class HataYakalama {
    public static void Istisnalar(){
        try
        {
            Scanner al = new Scanner(System.in);
            System.out.println("Bir sayı giriniz :");
            int sayi1 = al.nextInt();
            System.out.println("2. sayıyı giriniz: ");
            int sayi2 = al.nextInt();

            int [] diziler = new int[5];
            diziler[10] = 45;
          //  int a = sayi1/sayi2; // Hata oluşabilecek kodlar
           // String s = null;
           // System.out.println(s);
            System.out.println("bu kısım kodun kalan kısmına devam eder");
        }
        catch (ArithmeticException e){
            //System.out.println(e);
            System.out.println("Sıfıra bölünme hatası" + e);
        }
        catch (NullPointerException n){
            System.out.println(n);
        }
        catch (IndexOutOfBoundsException boundhata){
            System.out.println("Fazla sayıda eleman girdiniz " + boundhata);
        }
        finally {
            System.out.println("Her şartta çalışır");

        }


    }
public static void ThrowAtma(){

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
