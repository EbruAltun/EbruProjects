package day25_PassByValue_ImmutableClasess;

import java.time.LocalTime;

public class C05_DateTime {
    public static void main(String[] args) {
        LocalTime saat=LocalTime.now();
        System.out.println(saat);   // 17:37:58.919308500

        System.out.println(saat.getNano()); // 195164900


        // bir loop ile 1'den 10bin'e kadar olan sayilari toplayin
        // ve bu islemin kac nanosaniye surdugunu bulun

        int toplam=0;
        int basSuresiNano= saat.getNano();

        for (int i = 0; i < 10000; i++) {
            toplam+=i;
        }

        LocalTime saatSon= LocalTime.now();
        int bitSuresiNano= saatSon.getNano();

        System.out.println("Islem suresi : " +(bitSuresiNano-basSuresiNano));
    }
}
