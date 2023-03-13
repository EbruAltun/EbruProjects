package day07_genelTekrar_IfElse;

import java.util.Scanner;

public class C02_IfElseIf {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen dönem notunu giriniz");
        double not= scan.nextDouble();
        if(not>100 || not<0){
            System.out.println("notu yanlış girdiniz lütfen yeni not giriniz");
        } else if (not>=85) {
            System.out.println("notunuz AA");
        } else if (not>=65) {
            System.out.println(" notunuz BB");
        } else if (not>=50) {
            System.out.println(" notunuz CC");            
        }else{
            System.out.println("dd");
        }

    }
}
