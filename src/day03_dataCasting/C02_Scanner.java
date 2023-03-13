package day03_dataCasting;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //      Girilen bilgiler : J Doe, 44
       Scanner scan= new Scanner(System.in);
        System.out.println("lütfen isminizi, soyisminizi ve yasınızı giriniz"+
                "\nher bilgiden sonra enter e basınız");
        char ilkHarf= scan.nextLine().charAt(0);
        /*
            Scanner method'larinda nextChar() yok
            bunun icin once kullanicinin girisine gore next() veya nextLine() yazip
            sonra .charAt(0)  yazariz
            parantez icindeki 0 almak istedigimiz char'in index'idir
            ve java'da index 0'dan baslar
         */
        String soyisim= scan.nextLine();
        double yas= scan.nextDouble();
        System.out.println("girilen bilgiler : " +ilkHarf+ ","+soyisim+","+yas);


    }
}
