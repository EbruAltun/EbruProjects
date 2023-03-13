package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C03_nesTed {
    public static void main(String[] args) {
        /*
        Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.
        hatali giris yapilirsa kullaniciyi uyarin
         */
      //bu sefer ana değişken yaş olsun

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();
        System.out.println("Lutfen cinsiyetinizi giriniz..." +
                "\nKadin icin : K, Erkek icin : E giriniz");
        char cinsiyet = scan. next().charAt(0);
        if(yas<16 || yas>80){
            System.out.println("gecersiz yas");
        } else if (yas<60) { // 16 60 yas arası
            if(cinsiyet=='k'|| cinsiyet=='K'){
                System.out.println("emekli olmak icin "+(60-yas)+"yıl daa calısmalsıın");
            } else if (cinsiyet=='e'|| cinsiyet=='E') {
                System.out.println("emekli olabilmek için"+(65-yas)+"yıl daha calısmalısım");
            }

        } else if (yas<65) { // 60 65yas arası
            if(cinsiyet=='k'|| cinsiyet=='K'){
                System.out.println();
            }
        }else { // 65 80 arası

        }
    }
}
