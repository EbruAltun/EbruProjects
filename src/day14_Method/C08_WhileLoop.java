package day14_Method;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {


       /*
    Soru :Kullanicidan sifre isteyin asagidaki sartlari saglamayan
sifrelerde hatalari yazdirip, kullanicinin yeni sifre girmesini isteyin
Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin gecerli sifre
yazilinca “sifreniz basari ile kaydedildi” yazdirin
sartlar :
- sifrenin ilk karakteri kucuk harf
olmali
- sifrenin son karakteri sayi olmalı
     */
   Scanner scan= new Scanner(System.in);
   boolean sifreDogruMu= false;
   String sifre="";
   char ilkHarf=0;
   char sonHarf=0;

   while (!sifreDogruMu){
       sifre= scan.nextLine();
       ilkHarf= sifre.charAt(0);
       sonHarf=sifre.charAt(sifre.length()-1);


       if(ilkHarf<'a'||sonHarf>'z'){
           System.out.println("Şifre küçük harfle başlamalıdır");
       }else if (sonHarf<'0' ||sonHarf>'9'){
           System.out.println("şifre son karakteri rakam içermelidir");
       }else {
           System.out.println("şifreniz başarıyla kaydedildi");
           sifreDogruMu=true;
       }
   }
    }
}