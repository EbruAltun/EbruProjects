package day12_forLoops;

import java.util.Scanner;

public class C03_forLoops {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner scan = new Scanner(System.in);
        System.out.println(" baş sayı gir");
        int bas = scan.nextInt();
        System.out.println("bitiş sayı gir");
        int bit = scan.nextInt();
        int sayılarToplamı = 0;

        if (bas <= bit) {
            for (int i = bas; i <= bit; i++) {
                sayılarToplamı += i;
            }
        } else { //basşlangıc degeri bitiş değerinden daha büyük
            for (int i = bas; i >= bit; i--) {
                sayılarToplamı += i;
            }
        }
        System.out.println("sayıların toplamı:"+sayılarToplamı);
    }
}