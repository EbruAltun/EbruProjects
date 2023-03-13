package day13_methodOlusturma;

import java.util.Scanner;

public class C02_IkiSayıToplamaMethodu {
    public static void main(String[] args) {
        // kullsnıcıdan iki sayı alıp
        // toplamlarını yzdıran bir metdot oluşturun
     ikiSayiTopla();
        System.out.println("===================================");
        ikiSayiTopla();
    }

    public static void ikiSayiTopla(){
        //kullanıcadan girdi alınması için ayar yap

        Scanner scan= new Scanner(System.in);

        //kullanıcıya mesaj göster

        System.out.println("Lütfen iki sayı gir");

        //ilksayı için mesaj göster

        System.out.println("1 . sayıyı gir");

        double  birinci= scan.nextDouble();
        //ikinici sayıiçin uyarı göster
        System.out.println("ikinci sayıyı gir");
        double ikinci= scan.nextDouble();

        System.out.println("iki sayının toplamı:"+(birinci+ikinci));

    }
}
