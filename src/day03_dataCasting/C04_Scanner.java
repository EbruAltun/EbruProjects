package day03_dataCasting;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        // kullanici sayi1= 10 , sayi2= 20 degeri girdiginde
        // sayi1'in yeni degeri= 20 , sayi2'nin yeni degeri= 10 olmali

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen sayı1 giriniz");
         int say1= scan.nextInt();
        System.out.println("lütfen sayı2 griniz");
        int sayı2= scan.nextInt();

        int temp=0;
       temp=sayı2;
       sayı2=say1;
       say1=temp;

        System.out.println("say1 nın yeni dğeri "+say1);
        System.out.println("sayı2 nın yeni değeri "+sayı2);




    }
}
