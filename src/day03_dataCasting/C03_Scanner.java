package day03_dataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen çemberin yarıçapını giriniz");

        // kullanıcının girdiği bilgiyi kaydedeceği data türünde bir variable oluşturun
        // kullanıcıdan bilgiyi almak için scan objesini veilgili next methodunu kullan

        double yarıcap= scan.nextDouble();

        // cevresini ve allanını yazdıralım
        System.out.println("cemberin cevresi : " + 2*3.14*yarıcap);//31.400000000000002
        System.out.println("cemberin alanı: "+ 3.14*yarıcap*yarıcap);//78.5

    }
}
