import java.sql.SQLOutput;

public class Diziler {
    public static void diziOrnegi(){
        String[] cars = {"Volvo", "BMW", "Ford","Mazda","Suzuki"};
        int [] sayilar ={3,4,5,6,7,8,9};
        int sayilar2[] = new int [10] ;
        //iterable


        String cars2 [] = {"Reno","Peco","Vosvagen"};


        System.out.println(cars); // CARS ID


        for (int i = 0; i < cars.length; i++) {
            if (i%2==0){
                System.out.println(cars[i]);
            }
                    }

        int uzunluk = cars.length;
        while (uzunluk <=0){
            int i = 0;
            System.out.println(cars[i]);
            uzunluk -=1;
            i+=1;
        }


        System.out.println(cars[3]);
        System.out.println(sayilar[2]);
        System.out.println("Dizinin Uzunluğu: " + cars.length);
        System.out.println("Diğer dizinin uzunluğu: " + sayilar.length );


    }
    public static void yildizlar(){
        int [] sayilar = new int[5];
        sayilar[0] = 7;
        sayilar[1] = 0;
        sayilar[2] = 3;
        sayilar [3] = 4;
        sayilar [4] = 8;

        for(int out=0;out<sayilar.length;++out){
            System.out.print(out + ": ");
            for(int yildiz=1;yildiz<=sayilar[out];++yildiz){
                System.out.print("*");
            }
            System.out.print(sayilar[out]);
            System.out.println();
        }

    }
    public static void forEachOrnegi(){
        int[] numbers = {8, 2, 6, 4, 3};
        int sum = 0, sumSq = 0;
        for (int i : numbers) {   // for each int number in int[] numbers
            System.out.println(i);
            sum += i;
            sumSq += i * i;
        }
        System.out.println("The sum is: " + sum);
      System.out.println("The square sum is: " + sumSq);

    }
    public static void CokBoyutluDizi(){
        String [][] Ogrenciler = {{"Ahmet","Kaplan","343434","Konya"},{"Hüseyin","Demir","342324","Gümüşhane"}};
        System.out.println(Ogrenciler[0][1]);
        System.out.println(Ogrenciler[1][2]);


        int satir = Ogrenciler.length;
        int sutun = Ogrenciler[0].length;

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.println(Ogrenciler[i][j]);

            }

        }


    }



}
