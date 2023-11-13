public class Donguler {
    public static void main(String[] args) {
        //İçiçe Döngü Nested Loops
        //OUTER
        for (int i = 0;i<10;i = i + 3){
            System.out.println("OUTER");
            System.out.println(i);
//INNER
            for (int y = 1;y<5;y++){

                System.out.println(y);
            }
        }
        System.out.println("---------------------");

        //continue döngü de pass geçer
        for (int d = 0;d<5;d++){
            if (d==1) continue;
            System.out.println(d);
           }

        System.out.println("break deyiminin kullanımı");

        //break deyimi döngüyü kırar
        for (int x = 0;x<5;x++){
            System.out.println(x);
            break;
        }
        System.out.println("return deyiminin kullanımı");
       /* //return , break gibi döngüyü kırar ve fonk. dışına çıkar
        for (int x = 0;x<5;x++){
            System.out.println(x);
            return;
        }*/
        System.out.println("----------Yıldızlar-------");

        for (int c = 1; c <= 4; c++){
            for (int x = 1; x <= 5; x++){
                System.out.print("*");
            }
            System.out.println();
        }




    }

}
