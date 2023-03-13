package day10_substring;

import java.util.Scanner;

public class C04_endWith {
    public static void main(String[] args) {
        //SORU : kullanicidan bir mail alin
        // - mail @ icermiyorsa "gecersiz mail"
        // - mail @gmail.com icermiyorsa, "mail gmail olmali"
        // - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen mail adresinizi giriniz");
        String email= scan.nextLine();

        if(!email.contains("@")){
            System.out.println("gecersiz mail");
        } else if(!email.contains("@gmail.com")){
            System.out.println("mail gmail olmalı");
            
        } else if (!email.endsWith("@gmail")) {
            System.out.println("mailde yazım hatası var");

        }

    }
}
