package day06_BagımsızIfCumleleri;

import java.util.Scanner;

public class C02_IfStataments {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin.

        Scanner scan =new Scanner(System.in);

        System.out.println("lütfen poziti bir tamsayı giriniz");

        int sayı= scan.nextInt();

        if(sayı %5 ==0){
            System.out.println("sayı 5 in tam katı");
        }
          //Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa
        // ”Uc ile bolunebilen sayi”
        if (sayı% 3==0){
            System.out.println("3 ile bölünebilen sayı");
        }
    }

}
