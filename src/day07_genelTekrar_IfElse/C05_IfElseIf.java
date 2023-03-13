package day07_genelTekrar_IfElse;

import java.util.Scanner;

public class C05_IfElseIf {
    public static void main(String[] args) {

        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya
        // “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz");
        double yas= scan.nextDouble();
        System.out.println("lütfen cinsiyetinizi giriniz .."+
               " \n Kadın için : K, Erkek için E :");
        char cinsiyet= scan.next().charAt(0);
        if(cinsiyet=='K' && yas>=60 || cinsiyet=='E'&& yas>=65){
            System.out.println("emekli olabilirsin");
        } else if (cinsiyet=='K') {
            System.out.println("emekli olabilmek için "+ (60-yas)+"yıl daha calışmalısın");
        } else if (cinsiyet=='E') {
            System.out.println("emekli olabilmek için"+(65-yas)+"yıl daha çalışmalısın");
        }
        }

    }

