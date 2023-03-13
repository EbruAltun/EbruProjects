package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {
        // kullanıcıdan bir sayı alın
        // sayı çift ise çift değilse tek sayı
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir pozitif tamsayı girniz");
        int sayı= scan.nextInt();
        if(sayı%2==0){
            System.out.println("çift sayı");
        }else {
            System.out.println("tek sayı");
        }
        // ternary ile

        System.out.println(sayı%2==0 ? "çift sayı":"tek sayı");
    }
}
