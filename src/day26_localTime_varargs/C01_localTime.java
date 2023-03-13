package day26_localTime_varargs;

import java.time.LocalTime;
import java.util.Locale;

public class C01_localTime {
    public static void main(String[] args) {
        LocalTime saat1= LocalTime.of( 20,15);
        System.out.println(saat1);   // 20:15

        LocalTime saat= LocalTime.now();
        System.out.println(saat);  // 14:04:29.676387500

        // LocalTime nesnesi olan saat değişkeni canlı bir saat değil
        // olusturuldugu anda yerel saat'i sistemden alip kaydettigimiz sabit bir degerdir
        // kodun ilerleyen kisminda ne kadar sure gectigini gorunmek icin
        // saati yeniden almamız gerekirse, yeni bir LocalTime nesnesi daha olusturmaliyiz

       System.out.println(saat.getHour());  // 16
        // get method'lari localTime objesinin saat, dakika, saniye ve nano degerlerini bize getirir

        System.out.println(saat.plusHours(2).plusMinutes(10));  // 18:54:59.232068200
        // saat ekledik,dakika ekledik
        System.out.println(saat.minusMinutes(10).minusSeconds(10));  // 16:38:09.231326600
       // dakika cıkardık
        System.out.println(saat.withSecond(10).withNano(20)); // 16:51:10.000000020

        System.out.println(saat.compareTo(saat1)); //  -1 // saat i saat1 le karşıalştırma yapar
        System.out.println(saat.compareTo(saat));  // 0  aynı ise 0 döneer

        System.out.println(saat.isAfter(saat1)); // false saat saaat1 den sonra mı?
        System.out.println(saat.toSecondOfDay()); // 61270 günün kacıncı sanıyesi olduğunu verir



    }
}
