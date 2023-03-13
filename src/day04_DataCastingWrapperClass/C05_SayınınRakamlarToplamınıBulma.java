package day04_DataCastingWrapperClass;

import java.util.Scanner;

public class C05_SayınınRakamlarToplamınıBulma {
    public static void main(String[] args) {
        // Kullanicidan 3 basamakli bir sayi alin
        // ve sayinin rakamlar toplamini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen 3 basamaklı tamsyı giriniz");

        int girilenSayi= scan.nextInt();

        int rakam= girilenSayi % 10;

        int rakamlarToplami= rakam;
        // ========

        girilenSayi = girilenSayi / 10; // sayi = 13

        rakam = girilenSayi % 10 ; // rakam = 3

        rakamlarToplami = rakamlarToplami + rakam; // rt= 8
        // ======

        girilenSayi= girilenSayi / 10 ; // 13 / 10 ==> sayi=1

        rakam = girilenSayi % 10; // rakam= 1

        rakamlarToplami= rakamlarToplami + rakam; // 9

        System.out.println("Girilan sayinin rakamlar toplami : " + rakamlarToplami);

    }
}
