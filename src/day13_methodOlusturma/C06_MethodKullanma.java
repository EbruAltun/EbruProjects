package day13_methodOlusturma;

import java.util.Scanner;

public class C06_MethodKullanma {
    public static void main(String[] args) {


        // verilen bir String i Palindrome olup olmadığını yzdırın
        // Palindrome : düzden  ve tersten aynı şekilde yazılan
        // madam, 12321, kabak

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz");
         String metin= scan.next();

         String tersmetin=C05_StrngiTerseCevirme.stringtersinecevir(metin);

         if(metin.equals(tersmetin)){
             System.out.println("girilen metin PALİNDORME");
         }else {
             System.out.println("girilen metin PALİNROME değil");
         }


    }
}