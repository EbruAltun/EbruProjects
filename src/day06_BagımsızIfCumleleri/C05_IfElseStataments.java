package day06_BagımsızIfCumleleri;

import java.util.Scanner;

public class C05_IfElseStataments {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");
        double not = scan.nextDouble();

        if (not >= 50 && not <= 100) {

            System.out.println("sınıfı gectın");
        }else {

            System.out.println("malesef kaldın");
        }
        // kullancıdan pozitif tamsayı alın
        // sayının tek vey çift sayı olduğunu yazdırın

        System.out.println("lütfen bir tamsayı giriniz");
        int a= scan.nextInt();
        if(a%2==0){
            System.out.println("çift sayı");
        }else {
            System.out.println("tek sayı");
        }
        // kullanıcıdan bir tamsayı alın
        // 5 ile bölünüp bölülmediğini yazıdr
        System.out.println("lütfen bir tamsayı girinz");

        int b= scan.nextInt();
        if(b%5==0){
            System.out.println("5 ile bölünebilen sayı");
        }else {
            System.out.println("\"5 e bölünemeyen sayı\"");
        }

       // if else statamments de if badysi veya else badysi mutlaka çalışır
        // ikisinin birden çalışma ihtimali Yoktur
        // ikisinin de çalışma ihtimali Yoktur
    }




}
