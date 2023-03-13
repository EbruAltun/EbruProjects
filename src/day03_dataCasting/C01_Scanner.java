package day03_dataCasting;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String isim= scan.nextLine();

        System.out.println("lütfen soyisminizi yazınız");
        String soyisim= scan.nextLine();

        System.out.println("lütfen yaşınızı giriniz");
        double yas= scan.nextDouble();

        System.out.println("isminiz : " +isim);
        System.out.println("soyminiz : "+soyisim);
        System.out.println("yaşınız :" +yas);
        System.out.println("kaydınız başarıyla tamamlamıştır");

        // kullanıcı istediğimmiz data turunded bilgi girişi yapmazsa koduumuzda hta oluşur ve çalışmaz
        // sout print ln deki ln yazdırma işlemini yaptıktan sonra alt satıra geçmeyı sağlar
        // print yazarsak yazdırdığımız şeyler yan yana yazdırılır


        System.out.println("isminiz : " +isim+
                "soyminiz : "+soyisim+
                "yaşınız :" +yas +
                "kaydınız başarıyla tamamlamıştır"   );
    }
}
