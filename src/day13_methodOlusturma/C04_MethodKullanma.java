package day13_methodOlusturma;

import java.util.Scanner;

public class C04_MethodKullanma {
    public static void main(String[] args) {
        // kullanıcıdan 10 dan küçük iki pozitif tam sayı alıp
        // faktoryel değerlerini topla

        Scanner scan= new Scanner(System.in);
        System.out.println("10 dan küçük iki adet pozitif tamasyı girin ");
        int sayı1= scan.nextInt();
        int sayı2= scan.nextInt();

        int sonuc= C03_Faktoryel.faktoryelHesapla(sayı1)
                    + C03_Faktoryel.faktoryelHesapla(sayı2);
        System.out.println(sonuc);

    }
}
