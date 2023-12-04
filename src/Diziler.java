import java.sql.SQLOutput;

public class Diziler {
    public static void diziOrnegi(){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int [] sayilar ={3,4,5,6,7,8,9};


        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
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
}
