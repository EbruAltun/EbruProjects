package day06_BagımsızIfCumleleri;

import java.util.Scanner;

public class C08_IfElStataments {
    public static void main(String[] args) {
       //  5- Kullanicidan bir harf isteyin,
        // len karakter kucuk harf ise onu buyuk harf olarak yazdirin, yoksa girilen harfi yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");

        char krk= scan.next().charAt(0);

        if ('a'<=krk && krk<= 'z'){
            System.out.println(Character.toUpperCase(krk));
        }else {
            System.out.println(krk);
        }

    }
}
