import  VizeOncesi.Donguler.*;

import static VizeOncesi.Donguler.*;

public class NesneTabanli {
    int thisx;
    int thisyas;
    String thisisim;
    final int kimlikno=12356;

    public NesneTabanli(int x,int yas,String isim){
       thisx = x;
       thisyas = yas;
       thisisim = isim;


    }

    public static void main(String[] args) {
        NesneTabanli ilkobje = new NesneTabanli(5,35,"Ahmet");
        System.out.println(ilkobje.thisx); //5
        System.out.println(ilkobje.thisisim); // Ahmet
        ilkobje.thisisim = "Hasan";
        System.out.println(ilkobje.thisisim); // Hasan
        System.out.println("Oluşan nesnenin adı " + ilkobje.thisisim + " Yaşı " + ilkobje.thisyas) ;
        Nesnesiz();
      //  Main.carpim(3,5);
    //   donguFonk();
       ilkobje.Parametresiz();
       ilkobje.Parametreli(23);
       // ilkobje.kimlikno = 15; final deyimi ile oluşturulan değişkenler değiştirilemezler


    }
    static void Nesnesiz (){
        System.out.println("Bu static sınıfıdır.");

    }
    public void Parametresiz(){

    }
    public void Parametreli(int parametre){
        System.out.printf("Burada parametre gelecek %d",parametre);


    }
    public int Donuslu(int a){
        return a;


    }
    private void Gizli(){

    }

}
