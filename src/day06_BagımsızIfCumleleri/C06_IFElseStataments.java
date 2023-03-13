package day06_BagımsızIfCumleleri;

import java.util.Scanner;

public class C06_IFElseStataments {

   // Soru 3- Kullanicidan yasini isteyin,
   // 65 yas ve uzeri ise “Emekli olabilirsin” yazdirin,
   // yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

     public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen yasınızı giriniz");

        double yas= scan.nextDouble();
        if (yas>=65){
            System.out.println("emekli olabilirsin");
        }else{
            System.out.println("emekli olabilmek için daha " +(65-yas)+ "yıl daha çalısmalısın");
        }
    }
}
