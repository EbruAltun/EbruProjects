package day13_methodOlusturma;

import java.util.Locale;

public class C01_MethodOlusturma {
    public static void main(String[] args) {
        String str= "Java Candir";
       // str buyuk harflere cevirin

        str=str.toUpperCase(Locale.ROOT);

        System.out.println(str.toLowerCase()); // java candir



    }
}
