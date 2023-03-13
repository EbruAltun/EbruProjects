package day07_genelTekrar_IfElse;

import java.util.Scanner;

public class C06_IfElseIf {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        vucut kitle endeksi
        30’dan buyukse obez,
        25-30 arasi ise kilolu,
        20-25 arasi ise normal,
        20’den kucukse zayif yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen kilonuzu giriniz");
        double kiLo = scan.nextDouble();
        System.out.println("lütfen boyunuzu giriniz");
        double boy = scan.nextDouble();
        double vKe = kiLo * 10000 / (boy * boy);
        if (vKe > 30) {
            System.out.println("obez");
        } else if (vKe > 25) {
            System.out.println("kilolu");
        } else if (vKe > 20) {
            System.out.println("normal");
        } else {
            System.out.println("zayıf");
        }

    }
}
