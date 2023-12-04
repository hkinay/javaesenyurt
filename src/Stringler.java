import java.sql.SQLOutput;

public class Stringler {
    public static void main(String[] args) {
        //String_esit_Mi();
       //StringMethodCalisma();
        Diziler.diziOrnegi();



    }

    private static void StringMethodCalisma() {
        String a = "Araba";
        String uzun = "Çekoslavakyalılaştıramadıklarımızdan mısınız?";

        System.out.printf("Metinimiz %s%n",a);
        System.out.println("charAt istenilen indeksteki karakteri getirir " + a.charAt(2));
        System.out.println("length uzunluğu gösterir " + a.length());
        System.out.println("toUpperCase harfleri büyütür " +a.toUpperCase());
        System.out.println("replace istenilen karakteri değiştirir " + a.replace("b","t"));
        System.out.println("contains istenilen karakteri içerip içermediğini sorgular "+ a.contains("el"));
        System.out.println(a.split("Ar"));
        System.out.println(a.compareTo("Volvo"));
        System.out.println(a.endsWith("a"));
        System.out.println(a.indexOf("b"));
        System.out.println(a.isEmpty());
        System.out.println(a.lastIndexOf("b"));
        System.out.println(a.concat(" Güzel"));
        System.out.println(a.substring(0,2));
        System.out.println(uzun.substring(2));
    }

    private static void String_esit_Mi() {
        String s1 = "Renault";
        String s2 = "Renault";
        String s3 = new String("Renault");

        System.out.println(s1==s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s1);

        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s1));
        System.out.println(s3.equals(s2));
    }


}
