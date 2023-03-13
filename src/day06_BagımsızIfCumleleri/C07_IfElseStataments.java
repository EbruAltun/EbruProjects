package day06_BagımsızIfCumleleri;

import java.util.Scanner;

public class C07_IfElseStataments {
    public static void main(String[] args) {

         // Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lüten birkarakter giriniz");

        char krk=scan.next().charAt(0);

        // r==A ile Z arasında mı

        if ('A'<= krk && krk <='Z'){
            System.out.println("girilen karakter büyük harf");
        }else {
            System.out.println("girilen karakter bütük harff değil");
        }

    }
}
