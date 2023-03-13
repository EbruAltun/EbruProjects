package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {
        // kullanıcdan bir tamsayı alıp
        // mutlaj değerine ceviirip yazdıırn

        Scanner scan= new Scanner(System.in);
        System.out.println("sayı gir");
        int sayı= scan.nextInt();
        if(sayı>=0){
            System.out.println(sayı);
        }else {
            sayı= sayı*(-1);
            System.out.println(sayı);
        }
        // ternary ile
        sayı= sayı>=0 ? sayı :sayı*(-1);
        System.out.println(sayı);
    }

}
