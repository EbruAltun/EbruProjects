package day08_nestedIfElse_ternary;

import java.awt.*;
import java.util.Scanner;

public class C11_Switch {
    public static void main(String[] args) {
        // kullanıcıdan bir har isteyın
        // o harfle başlayan gun ismi varsa yazıdrın
        // yoksa gecersiz harf yazdıırı

        Scanner scan= new Scanner(System.in);
        System.out.println("harf gir");
        char harf=scan.next().charAt(0);
     // harf=Character.toUpperCase(harf);

        if(harf=='p'){
            System.out.println("pazar, pazartesi veya perşembe");
        } else if (harf=='s') {
            System.out.println("salı");
        } else if (harf=='c') {
            System.out.println("carsamba, cuma veya cumartesi");
        }else {
            System.out.println("gecersiz harf");
        }
        System.out.println("===============");
        // daha düzenli ve kullanışlı olarak switch stataments kullanilrisin
        // switch{
        switch (harf){
            case 'S':
                System.out.println("salı");
                break;
            case 'p':
                System.out.println("pazar, pazartesi, persembe");
                break;
            case 'c':
                System.out.println("cuma cumartesi carsamba");
                break;
            default:
                System.out.println("gecersiz harf");
        }
        }
    }


